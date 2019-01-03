package user.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * DAO - Data Access Object, 用户实现和管理数据访问的对象，比如访问数据库等
 */

//@Component  // 告诉Spring这是一个组件，可以用来注入到其他对象里
public class UserMockDao implements UserDao {

    // 这可能会用数据库访问，文件访问的逻辑替换

    private final HashMap<String, User> users = new HashMap<>();

    public UserMockDao() {
        // 模拟数据，之后会补充具体数据库的使用
        users.put("lzh", new User("lzh","master"));
        users.put("pkj", new User("pkj", "electric mouse"));

        System.out.println("创建UserMockDao!");
    }

    // 数据访问接口
    @Override
    public boolean contains(String key) {
        return users.containsKey(key);
    }

    @Override
    public User get(String key) {
        return users.get(key);
    }

    @Override
    public void put(User user) {
        users.put(user.getName(),user);
    }

    @Override
    public List<User> getAll() {
        return new ArrayList<>(users.values());
    }

    @Override
    public void delete(String key) {
        users.remove(key);
    }
}
