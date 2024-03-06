package day08;

public class EX01 {
    public static void main(String[] args) {
        //자식 타입 변수에 자식 객체 담기
        SpiderMan spiderman = new SpiderMan();
        IronMan ironman = new IronMan();

        spiderman.printInfo(); //오버라이드 됌.
        spiderman.shoot();
        ironman.printInfo(); //오버라이드 됌.
        ironman.iron();

        //부모 타입 변수에 부모 객체 담기
        Man spiderMan = new SpiderMan();
        Man ironMan = new IronMan(); //업캐스팅 (위로 형변환) //자식객체를 만들어서 부모타입에 담아서 씀.

        spiderMan.printInfo();
//        spiderMan.shoot(); //불가능
        ironMan.printInfo();
//        ironMan.iron(); //불가능
    }
}

class Man {
    public void printInfo(){
    }
}

class SpiderMan extends Man {
    public void printInfo() {
        System.out.println("스파이더맨은 잘 날아다녀요");
    }

    public void shoot() {
        System.out.println("스파이더맨은 거미줄을 쏴요");
    }
}

class IronMan extends Man {
    public void printInfo() {
        System.out.println("아이언맨은 멋있어요");
    }

    public void iron() {
        System.out.println("아이언맨은 쇠질을 해요");
    }
}

