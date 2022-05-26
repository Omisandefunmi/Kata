package myersBriggsOOP;

public class Question {


    private String query;
    private String header;

    public Question(String header, String query) {
        this.header = header;
        this.query = query;
    }

    public String getQuery() {
        return query;
    }

    public String getHeader() {
        return header;
    }

    @Override
    public String toString() {
        return String.format("""
                Question %s
                %s""",getHeader(), getQuery());
    }
}
