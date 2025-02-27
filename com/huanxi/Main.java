package com.huanxi;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        Class<?> cls1 = Class.forName("com.huanxi.Person");
        Constructor[] constructors = cls1.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }

        Method[] methods = cls1.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }
}
