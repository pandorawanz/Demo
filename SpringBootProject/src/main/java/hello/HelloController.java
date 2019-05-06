package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String index(@RequestParam(value = "user", defaultValue = "wanz") String id) {
        // 后端渲染
        return String.format("<html><body>我们的主页欢迎%s~</body></html>", id);
    }
}
