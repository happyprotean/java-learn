package com.huanxi;

import java.io.FileNotFoundException;
import java.util.Properties;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();

//        获取配置文件所在位置
        ClassLoader classLoader = Main.class.getClassLoader();
        URL resource = classLoader.getResource("jdbc.properties");
        String path = resource.getPath();
        System.out.println("配置文件所在位置");
//        加载配置文件
        properties.load(new FileReader(path));
        System.out.println(properties.getProperty("url"));
    }
}
