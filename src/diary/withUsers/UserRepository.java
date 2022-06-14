package diary.withUsers;

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
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getName().equalsIgnoreCase(username) && users.get(i).getUserId().equalsIgnoreCase(userid)){
                return true;
            }
        }
        return  false;
    }

    public User getUser(String userId) {
        StringBuilder id = new StringBuilder();
        for (int i = 3; i < userId.length(); i++) {
            char letter = userId.charAt(i);
            id.append(letter);
        }

        int index = Integer.parseInt(id.toString()) - 1;
        return users.get(index);
    }
}
