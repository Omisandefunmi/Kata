package chapterSeven;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Entry {
    private String title;
    private String body;
//    private LocalDate localDate;

//    private int id;
    private static String date;


    public Entry(String title,  String body) {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E, dd/MM/yyyy, hh:mm a");
        date = formatter.format(localDateTime);

        this.title = title;
        this.body = body;


    }
    
    

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }
    
    public String getDate(){
        return date;
    }




}
