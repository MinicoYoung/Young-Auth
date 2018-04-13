package young.auth.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextListener;

import java.security.Principal;

@SpringBootApplication
@RestController
public class OrderClientApplication extends SpringBootServletInitializer {
    @Bean
    public RequestContextListener requestContextListener() {
        return new RequestContextListener();
    }

    public static void main(String[] args) {
        SpringApplication.run(OrderClientApplication.class, args);
    }

    @RequestMapping("UserInfo")
    public ResponseEntity getUser(Principal principal) {
        return new ResponseEntity(principal, HttpStatus.OK);
    }

}