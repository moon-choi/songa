package day08;

public class EX04 {
    public static void main(String[] args) {
        //다형성 안 쓸 경우
        Chicken chicken = new Chicken();
        chicken.cry();

        Cow cow = new Cow();
        cow.cry();

        //다형성 쓸 경우
        Farm farm = new Farm();

        Animal chicken_ = new Chicken();
        farm.sound(chicken_);

        Animal cow_ = new Cow();
        farm.sound(cow_);

        //다형성을 쓰는 이유: 메소드에 업캐스팅된 부모타입의 변수를 넣어서, 자식 클래스 아무나 올 수 있게.
        //만약 안쓰면 Farm안데 sound(Cow cow), sound(Chicken chicken) 처럼 동물 수만큼 메서드를 생성해서 계속 오버로딩해야함.
        //Cow와 Chicken이 공통점은 Animal임.
    }
}

class Farm {
    public void sound(Animal animal) {
        animal.cry();
    }
}

class Animal {
    public void cry() {
        System.out.println("소리 없음");
    }
}

class Chicken extends Animal {
    @Override
    public void cry() {
        System.out.println("꼬꼬댁");
    }

    public void fly() {
        System.out.println("파닥파닥");
    }
}

class Cow extends Animal {
    @Override
    public void cry() {
        System.out.println("음메");
    }

    public void eat() {
        System.out.println("우물우물");
    }
}