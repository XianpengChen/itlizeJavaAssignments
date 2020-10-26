package JavaReflex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.*;
import java.util.Arrays;

public class Reflex {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        System.out.println("w4r5".getClass().getName());
        //通过通过Class.forName("全类名")
        Class<?> perClazz = null;
        try {
            perClazz = Class.forName("JavaReflex.Person");
            System.out.println(perClazz);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        ////遍历所有方法
        assert perClazz != null;
        Method[] methods = perClazz.getMethods();
        for (Method method: methods) {
            System.out.println(method);
        }
        //获取所有的构造方法
        Constructor<?>[] constructors = perClazz.getConstructors();
        System.out.println(Arrays.toString(constructors));

        //获取父类
        Class<?> superClass = perClazz.getSuperclass();
        System.out.println(superClass);

        //获取当前类（只有本类的）的所有方法和属性，包括私有的
        Method[] declaredMethods = perClazz.getDeclaredMethods();
        Field[] declaredFields = perClazz.getDeclaredFields();
        System.out.println(Arrays.toString(declaredMethods));
        System.out.println(Arrays.toString(declaredFields));
        //类名.class
        Class<?> perClazz2 = Person.class;
        System.out.println(perClazz2);

        //对象.getClass()
        Person person = new Person(1, "Jack");
        Class<?> perClazz3 = person.getClass();
        System.out.println(perClazz3);

        //重要：可以获取当前类的对象，并通过对象调用类的方法
        Object obj =  perClazz3.getDeclaredConstructor().newInstance();
        Person per = (Person) obj;
        per.setId(4);
        per.setName("Mills");
        System.out.println(per.getName() + ", "+ per.getId());


    }
}

