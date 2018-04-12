package young.auth.resserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ResServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ResServerApplication.class);
    }

    @RequestMapping("test")
    public String test(){
        return "Hello Test";
    }
}
