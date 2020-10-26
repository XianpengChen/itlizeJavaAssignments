package Serialization;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private int age;

    public Person(String name, int age) {
        System.out.println("反序列化，你调用我了吗？");
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person {" + "name=\'" + name + "\'" +
                ", age=" + age + "}";
    }
}

