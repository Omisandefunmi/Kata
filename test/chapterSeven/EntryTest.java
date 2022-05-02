package chapterSeven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class EntryTest {

    private Entry entry;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E, dd/MM/yyyy, hh:mm a");
    private final String date = formatter.format(LocalDateTime.now());
    @BeforeEach
    void setUp() {
         entry = new Entry("my love", "i love you baby boo boo");
    }

    @Test
    void getTitle() {
       assertEquals("my love", entry.getTitle());
    }

    @Test
    void getBody() {
        assertEquals("i love you baby boo boo", entry.getBody());
    }

    @Test
    void getDate() {
        assertEquals(date, entry.getDate());

    }
}