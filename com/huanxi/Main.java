package com.huanxi;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        Class<?> cls1 = Class.forName("com.huanxi.Person");

        Field[] fields = cls1.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        Field idField = cls1.getField("id");
        Person person = new Person();
        Object oldValue = idField.get(person);
        System.out.println(oldValue);
        idField.set(person, 123);
        System.out.println(person);
    }
}
