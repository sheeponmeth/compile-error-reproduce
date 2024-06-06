package org.example;

public class Main {
    public static void main(String[] args) {
        test();
        System.out.println("Hello world!");
    }

    @MyAnnotation
    public static void test() {
        System.out.println("test");
    }
}