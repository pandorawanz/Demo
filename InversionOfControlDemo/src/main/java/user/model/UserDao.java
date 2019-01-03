package user.model;

import java.util.List;

public interface UserDao {

    boolean contains(String key);

    User get(String key);

    void put(User user);

    List<User> getAll();

    void delete(String key);
}
