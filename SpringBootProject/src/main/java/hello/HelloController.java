package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String index(@RequestParam(value = "user", defaultValue = "wanz") String id) {
        // 后端渲染
        return String.format("<html><body>我们的主页欢迎%s~</body></html>", id);
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam("username")String username,
                        @RequestParam("password")String password) {
        System.out.println("username:" + username + "\npassword:" + password);
        return "";
    }

    @RequestMapping("/whoami")
    public String whoami() {
        // 后端渲染
        return UUID.randomUUID().toString();
    }
}
