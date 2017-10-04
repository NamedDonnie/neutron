package pers.donnie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ServletComponentScan
@SpringBootApplication
public class NeutronWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(NeutronWebApplication.class, args);
    }
}
