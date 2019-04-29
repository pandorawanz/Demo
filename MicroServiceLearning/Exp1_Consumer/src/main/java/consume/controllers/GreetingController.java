package consume.controllers;

import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RequestMapping("/consume")
@RestController
public class GreetingController {

    private RestTemplate restTemplate;

    @Autowired
    public GreetingController(final RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/greeting/{name}")
    public String getGreeting(@PathVariable String name) {
        String targetUrl = String.format("http://127.0.0.1:8080/greeting?name=%s", name);
        System.out.println(targetUrl);
        val result = this.restTemplate.getForObject(targetUrl, String.class);
        System.out.println(result);
        return result;
    }
}
