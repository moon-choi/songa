// 오버라이드 된 상황
package day08;

public class EX03 {
    public static void main(String[] args) {
        Child child = new Child();
        child.method();
        child.method("A");
    }
}

class Parent {
    public void method() {
        System.out.println("P");
    }
}

class Child extends Parent{ //Parent의 method()도 있고, 자신의 method(String)도 들고 있음.
   @Override // Annotation = 주석 -> 가독성, 실수방지(컴파일러에게 맞는지 요청. 컴파일러는 구문 에러를 잡아주는 역할.)
// 어노테이션은 자바꺼.
    public void method() { //오버라이드
        System.out.println("C");
    }

    public void method(String alphabet) { //오버로드
        System.out.println(alphabet);
    }
}