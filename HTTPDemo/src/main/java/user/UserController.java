package user;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
public class UserController {

    // user -> User对象
    private final HashMap<String, User> users = new HashMap<>();

    // Spring 通过HTTP请求中的操作(GET, POST, PUT, DELETE) + URL确定调用方法来处理请求

    /**
     * 响应 GET /users 这样的请求
     * 查询用户列表
     * @return 所有用户列表
     */
    @GetMapping("/users")
    List<User> listUsers() {
        return new ArrayList<>(users.values());
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
        if (users.containsKey(name)) {
            return new ResponseEntity<>(users.get(name),HttpStatus.OK);
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
        users.put(user.getName(),user);
        // 创建成功后返回User对象，以及自定义的状态值201
        return new ResponseEntity<>(users.get(user.getName()), HttpStatus.CREATED);
    }


    /**
     * 响应 PUT /users/{name} 这样的请求
     * @param name
     * @param updatedUser
     * @return 修改之后的User对象
     */
    @PutMapping("/users/{name}")
    ResponseEntity<User> updateUser(@PathVariable String name,@RequestBody User updatedUser) {
        if (users.containsKey(name)) {
            User user = users.get(name);
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
        if (users.containsKey(name)) {
            users.remove(name);
            return new ResponseEntity<>(HttpStatus.OK);
        } else return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
