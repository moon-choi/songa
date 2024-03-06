package day07;

import java.sql.SQLOutput;

public class EX03 {
    public static void main(String[] args) {
        Child child = new Child();
    }
}

class Parent {
    String parent = "parent";
}

class Child extends Parent {
    public Child() {
        new Parent(); // === super();
    }
}