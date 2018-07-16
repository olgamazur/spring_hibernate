package configs;

import entities.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("entities")

public class MyConfig {
    @Bean
    public Student getDog() {
        return new Student();
    }
}
