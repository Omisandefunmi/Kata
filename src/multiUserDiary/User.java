package multiUserDiary;

public class User {
    private String name;
    private String userId;

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;
    private MultiUserDiary diary;


    public User(String name, String password) {
        this.name = name;
        this.password = password;
        diary = new MultiUserDiary(name, password);
    }



    public void setDiary(MultiUserDiary diary) {
        this.diary = diary;
    }

    public MultiUserDiary getDiary() {
        return diary;
    }





    public String getName() {
        return name;
    }

    public void setName(String username) {
        this.name = name;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }


    public String getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }
}
