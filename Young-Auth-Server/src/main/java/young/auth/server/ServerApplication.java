package young.auth.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@SpringBootApplication
@EnableResourceServer
@RestController
public class ServerApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class);
    }
    @RequestMapping("test")
    public String test(){
        return "Hello Test";
    }

    @RequestMapping(value = "/user")
    public ResponseEntity getUser(Principal principal) {
        return new ResponseEntity(principal, HttpStatus.OK);
    }

}
