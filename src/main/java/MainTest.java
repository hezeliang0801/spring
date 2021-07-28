package main.java;

import main.java.entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: spring
 * @description:
 * @author: HeZeLiang
 * @create: 2021-07-06 20:22
 **/

public class MainTest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("person.xml");
        Person person = (Person) ac.getBean("person");
        System.out.println("启动完成"+person.getName());
    }
}
