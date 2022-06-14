package diaryTest;

import diary.Diary;
import diary.withUsers.MultiUserDiary;
import diary.withUsers.User;
import diary.withUsers.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E, dd/MM/yyyy, hh:mm a");
    private final String date = formatter.format(LocalDateTime.now());
    private Diary diary;
    @BeforeEach
    public void setUp(){
         diary = new Diary("Olufunmi","password");
    }


    @Test
    public void diaryClassExists(){

        assertNotNull(diary);
    }

    @Test
    public void testThatNewDiaryIsEmpty(){

        assertEquals(0, diary.getNoOfEntries());
    }

    @Test
    public void createEntryTest(){

        diary.setPassword("password");
        diary.write( "My Love" ,"The name of my Love is Joel", "password");
        assertEquals(1, diary.getNoOfEntries());
    }

    @Test
    public void createEntry_FindEntryTest(){

        diary.setPassword("password");
        diary.write( "My Love","The name of my Love is Joel", "password");
        assertEquals(1, diary.getNoOfEntries());
        String found = diary.findEntryById(1, "password");

        assertEquals("My Love || The name of my Love is Joel || "+date, found);

    }


    @Test
    public void deleteEntryTest(){
        diary.write( "My Day", "dear diary, i had garri today! can you imagine?", "password");
        assertEquals(1, diary.getNoOfEntries());
        diary.write("Lagos men are scum", "dear diary, femi broke my heart today! can you imagine?", "password");
        assertEquals(2, diary.getNoOfEntries());
        String found = diary.findEntryById(2, "password");

        assertEquals("Lagos men are scum || dear diary, femi broke my heart today! can you imagine? || "+date, found);
        diary.deleteEntryBy(2, "password");
        assertEquals(1, diary.getNoOfEntries());
        String found2 = diary.findEntryById(1, "password");

        assertEquals("My Day || dear diary, i had garri today! can you imagine? || "+date,found2);



    }

    @Test
    public void wrongPasswordCannotCreateEntryTest(){
        diary.setPassword("1111");
        diary.write("Hello world", "learning java", "1111");
        assertEquals(1, diary.getNoOfEntries());
    }

    @Test
    public void diaryCanLock(){
        diary.setPassword("password");
        assertTrue(diary.lockDiary("password"));
    }

    @Test
    public void wrongPasswordCannotLockDiary(){
        diary.setPassword("1111");
        assertFalse(diary.lockDiary("11111"));
    }

    @Test
    public void unlockDiary(){
        diary.setPassword("1111");
        assertTrue(diary.unlockDiary("1111"));
    }

    @Test
    public void CannotUnlockDiaryWithWrongPassword(){
        diary.setPassword("1111");
        assertFalse(diary.unlockDiary("11111"));
    }

    @Test
    public void printDiaryTest(){
//
        diary.printDiary();
    }

    @Test
    public void deleteEntryByTitle(){
        diary.write( "My Day", "dear diary, i had garri today! can you imagine?", "password");
        assertEquals(1, diary.getNoOfEntries());
        diary.write("Lagos men are scum", "dear diary, femi broke my heart today! can you imagine?", "password");
        assertEquals(2, diary.getNoOfEntries());
        diary.deleteEntryByTitle("My Day", "password");
        assertEquals(1, diary.getNoOfEntries());
    }

    @Test
    public void EditEntryTest(){
        diary.write( "My Day", "dear diary, i had garri today! can you imagine?", "password");
        assertEquals(1, diary.getNoOfEntries());
        diary.write("Lagos men are scum", "dear diary, femi broke my heart today! can you imagine?", "password");
        assertEquals(2, diary.getNoOfEntries());
        diary.editEntry(1, "New title", "This is a new content", "Olufunmi","password");
        String entry = diary.findEntryById(1, "password");
        assertEquals("New title || This is a new content || "+date, entry);
    }

    @Test
    public void testThatUserCanHaveDiary(){
        User user = new User("Stockholm");
        MultiUserDiary diary = new MultiUserDiary(user.getName(),"1234");
        user.setDiary(diary);
        diary.write("The vision","Everyone dreams","1234");
        assertEquals(1, diary.getNoOfEntries());
        String expected = """
                Date : %s
                Title: The vision
                                
                Body: Everyone dreams""", date;
        assertEquals(expected, diary.toString());

    }


    @Test
    public void testThatMultipleUsersCanHaveDiary(){
        UserRepository userRepository = new UserRepository();
        User user = new User("Stockholm");
        User user2 = new User("Adewale");
        MultiUserDiary diary = new MultiUserDiary(user.getName(),"1234");
        MultiUserDiary diary1 = new MultiUserDiary(user2.getName(), "0000");
        user.setDiary(diary);
        diary.write("The vision","Everyone dreams","1234");
        assertEquals(1, diary.getNoOfEntries());
        String expected = """
                Date : Mon, 13/06/2022, 06:18
                Title: The vision
                                
                Body: Everyone dreams""";
        assertEquals(expected, diary.toString());
        assertEquals(2, userRepository.getNumberOfUsers());

    }
}
