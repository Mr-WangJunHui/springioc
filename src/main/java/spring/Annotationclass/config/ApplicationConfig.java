package spring.Annotationclass.config;

import org.springframework.context.annotation.Bean;
import spring.Annotationclass.bean.Person;

public class ApplicationConfig {

    @Bean
    public Person person(){
        return new Person();
    }
}
