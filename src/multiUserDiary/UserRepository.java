package multiUserDiary;

import java.util.ArrayList;

public class UserRepository {

    private static ArrayList <User> users = new ArrayList<>();


    public void addUsers(User user){
        users.add(user);
    }
    public int getNumberOfUsers(){
       return users.size();
    }

    public boolean checkIfUserExists(String username, String userid){
        for (User user : users) {
            if (user.getName().equalsIgnoreCase(username) && user.getUserId().equalsIgnoreCase(userid)) {
                return true;
            }
        }
        return  false;
    }

    public User fetchUserWith(String userId) {
        StringBuilder id = new StringBuilder();
        for (int i = 3; i < userId.length(); i++) {
            char letter = userId.charAt(i);
            id.append(letter);
        }

        int index = Integer.parseInt(id.toString()) - 1;
        return users.get(index);
    }
}
