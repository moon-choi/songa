package day07;

public class EX04 {

}

class A {
    public A() {
    }
}

class B extends A {
    public B() {
        super();
        new A();
    }
}