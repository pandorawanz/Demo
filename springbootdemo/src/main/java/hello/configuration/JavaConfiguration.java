package hello.configuration;

import hello.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfiguration {

    // Spring注解方式配置
    @Bean
    public UserService userService() {
        return new UserService();
    }
}