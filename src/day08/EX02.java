package day08;

public class EX02 {
    public static void main(String[] args) {
        //업캐스팅: 자식객체를 부모 타입 변수에 담아 형변환.
        Pet cat = new Cat();

        cat.cry(); //컴파일러가 알고있는건 1이지만 실행시키면 2임. 마우스 갖다대보면 Pet 클래스의 메소드로 뜸.
//        cat.punch(); //안됌.

        //다운캐스팅: 부모 타입 변수로 생성된 자식 객체를 자식 타입 변수로 형변환.
        //방법 1
        ((Cat)cat).punch();

        //방법 2
        Cat realCat = (Cat) cat; //cat은 부모 타입이었다가 (Cat) cat으로 자식 타입 변환됌 -> 그리고 자식 변수에 담음. .
        realCat.punch();
    }
}

class Pet {
    void cry() {
        System.out.println("울음소리"); //1
    }
}

class Cat extends Pet {
    void cry(){
        System.out.println("야옹"); //2
    }

    void punch() {
        System.out.println("냥냥펀치");
    }
}
