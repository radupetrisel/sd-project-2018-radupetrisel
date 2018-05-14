package facebass.facebass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "dal.entities")
public class FacebassApplication {

    public static void main(String[] args) {

        SpringApplication.run(FacebassApplication.class, args);
    }
}
