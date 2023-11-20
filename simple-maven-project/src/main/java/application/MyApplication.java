package application;

import com.google.common.collect.Lists;

import java.util.ArrayList;

public class MyApplication {
    public static void main(String[] args) {
        ArrayList<String> helloWorld = Lists.newArrayList("Hello", " World");
        System.out.println(helloWorld.get(0) + helloWorld.get(1));
    }
}
