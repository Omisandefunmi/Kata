package diary.withUsers.repository;

import diary.withUsers.User;

public interface UserRepository {
    User createUser(String name, int id);
}
