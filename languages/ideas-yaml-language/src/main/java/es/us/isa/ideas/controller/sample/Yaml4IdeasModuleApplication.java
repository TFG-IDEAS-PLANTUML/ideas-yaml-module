package es.us.isa.ideas.controller.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class Yaml4IdeasModuleApplication {
    public static void main(String[] args) {
        SpringApplication.run(Yaml4IdeasModuleApplication.class, args);
        
    }
    
}
