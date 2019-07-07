package spring.Annotationclass;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.Annotationclass.bean.Person;
import spring.Annotationclass.config.ApplicationConfig;

import java.util.logging.Logger;


public class MainTest {

    private static Logger logger = Logger.getLogger("MainTest");
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Person person = (Person) context.getBean("person");
        person.setAge(10);
        logger.info("==================");
        System.out.println(person);
    }
}
