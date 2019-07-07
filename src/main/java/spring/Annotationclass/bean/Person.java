package spring.Annotationclass.bean;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Person {
    private String name;
    private String sex;
    private Integer age;
}
