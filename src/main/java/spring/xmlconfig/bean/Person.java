package spring.xmlconfig.bean;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Person {
    private String id;
    private String name;
    private int age;
}
