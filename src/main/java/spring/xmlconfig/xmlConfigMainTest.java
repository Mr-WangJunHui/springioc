package spring.xmlconfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.xmlconfig.bean.Person;

public class xmlConfigMainTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person p = (Person) context.getBean("cutesource");
        System.out.println(p.toString());
    }
}
