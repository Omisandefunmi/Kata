package chapter6;

import chapterSeven.Diary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
        String found = diary.findEntryBy(1, "password");

        assertEquals("My Love || The name of my Love is Joel || "+date, found);

    }


    @Test
    public void deleteEntryTest(){
        diary.write( "My Day", "dear diary, i had garri today! can you imagine?", "password");
        assertEquals(1, diary.getNoOfEntries());
        diary.write("Lagos men are scum", "dear diary, femi broke my heart today! can you imagine?", "password");
        assertEquals(2, diary.getNoOfEntries());
        String found = diary.findEntryBy(2, "password");

        assertEquals("Lagos men are scum || dear diary, femi broke my heart today! can you imagine? || "+date, found);
        diary.deleteEntryBy(2, "password");
        assertEquals(1, diary.getNoOfEntries());
        String found2 = diary.findEntryBy(1, "password");

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
        String entry = diary.findEntryBy(1, "password");
        assertEquals("New title || This is a new content || "+date, entry);
    }

//    @Test
//    public void lockAndUnlockIsAToggle(){
//        diary.lockDiary();
//
//    }

//    @Test
//    public void allFunctionsAreOffWhenDiaryIsLockedTest(){
//        diary.lockDiary("password");
//        diary.write("read me", "i love meat", "password");
//        assertEquals(0, diary.getNoOfEntries());
//    }





}
