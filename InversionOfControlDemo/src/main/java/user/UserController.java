package user;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import user.model.User;
import user.model.UserDao;

import java.util.ArrayList;
import java.util.List;

// 告诉Spring这是个Controller
// 资源的控制，资源的接口合集
// Controller本身也是一个Component
@RestController
public class UserController {

    // 依赖于UserMockDao，需要注入UserMockDao的实例
    // UserDao泛型也可以
    private UserDao userDao;

    // 使用构造方法进行注入
    public UserController(UserDao userDao) {
        this.userDao = userDao;
        System.out.println("创建UserController！");
    }

    /**
     * 响应 GET /users 这样的请求
     * 查询用户列表
     * @return 所有用户列表
     */
    @GetMapping("/users")
    List<User> listUsers() {
        return new ArrayList<>(userDao.getAll());
    }

    /**
     * 响应 GET /users/{name}
     * 通过User的name查询具体User对象
     * @param name
     * @return name确定User对象
     */
    @GetMapping("/users/{name}")
    // 从path中提取出name
    ResponseEntity<User> getUser(@PathVariable String name) {
        if (userDao.contains(name)) {
            return new ResponseEntity<>(userDao.get(name),HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    /**
     * 响应 POST /users 这样的请求
     * 添加一个用户到我们用户列表里
     * @param user
     * @return 返回创建成功的User对象
     */

    /*
    @PostMapping("/users")
    User newUser(@RequestBody User user) {
        users.put(user.getName(),user);
        return users.get(user.getName());
    }
    */

    /**
     * 响应 POST /users 这样的请求
     * 添加一个用户到我们用户列表里
     * @param user
     * @return 返回创建成功的User对象
     */
    @PostMapping("/users")
    ResponseEntity<User> newUser(@RequestBody User user) {
        userDao.put(user);
        // 创建成功后返回User对象，以及自定义的状态值201
        return new ResponseEntity<>(userDao.get(user.getName()), HttpStatus.CREATED);
    }


    /**
     * 响应 PUT /users/{name} 这样的请求
     * @param name
     * @param updatedUser
     * @return 修改之后的User对象
     */
    @PutMapping("/users/{name}")
    ResponseEntity<User> updateUser(@PathVariable String name,@RequestBody User updatedUser) {
        if (userDao.contains(name)) {
            User user = userDao.get(name);
            user.setContent(updatedUser.getContent());
            return new ResponseEntity<>(user,HttpStatus.OK);
        } else return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    /**
     * 响应 DELETE /users/{name} 这样的请求
     * 删除 name 确定的User对象
     * @param name
     */
    @DeleteMapping("/users/{name}")
    ResponseEntity<Void> deleteUser(@PathVariable String name) {
        if (userDao.contains(name)) {
            userDao.delete(name);
            return new ResponseEntity<>(HttpStatus.OK);
        } else return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
