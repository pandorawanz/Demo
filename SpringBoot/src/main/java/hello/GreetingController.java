package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

// 告诉Spring，这是一个RESTful API 的 Controller
@RestController
public class GreetingController {
    private static final String template = "Hello,%s!";
    private final AtomicLong counter = new AtomicLong(); //原子操作，因为Spring默认是支持多线程的处理请求

    // 当用户访问 /greeting 这个路径的时候，请Spring框架调用这个方法去执行相关逻辑
    @RequestMapping("/greeting")

    //value里的name是键名    //自动将类转换成json,并返回
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World")String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template,name));           // counter += 1 ; return counter;
    }

    /*
    // 直接输出String的方式
    public String greeting(@RequestParam(value = "name", defaultValue = "World")String name) {
        return String.format(template,name);
    }
    */

    //框架 -- 框架负责调用你的代码
    //库 -- 我们去调用库的代码
}
