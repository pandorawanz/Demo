package user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 告诉Spring从这里启动
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    // 初始化所有的组件，并且根据依赖关系，把每个组件所依赖的其他组件初始化，然后注入！

    /*
    1.创建UserController --> new UserController(UserDao); --> 需要另外一对象（组件） UserDao
    2.先创建UserMockDao --> 创建UserController
     */
}
