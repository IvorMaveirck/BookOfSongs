package finalProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class BookOfSongsApp {

    public static void main(String[] args) {
        SpringApplication.run(BookOfSongsApp.class, args);
    }

    @RequestMapping("/welcome")
    public String sayWelcome()
    {
        return "Welcome in Book of Songs";
    }
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
