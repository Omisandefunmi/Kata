package chapter6;

import chapterSeven.DateForDiary;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DateForDiaryTest {

    @Test
    public void dateClassExists(){
        DateForDiary date = new DateForDiary();
        assertNotNull(date);
    }

    @Test
    public void dateHasYear(){
        DateForDiary date = new DateForDiary();
        date.setYear(2022);
        assertEquals(2022, date.getYear());
    }
    
    @Test
    public void dateHasMonth(){
        DateForDiary date = new DateForDiary();
        date.setMonth("55");
        assertEquals("55", date.getMonth());
    }
    
    @Test
    public void dateForDay(){
        DateForDiary date = new DateForDiary();
        date.setDay("39");
        assertEquals("39", date.getDay());
    }




}
