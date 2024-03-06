package day07;

public class EX01 {
    public static void main(String[] args) {
        Mom mom = new Mom();
        mom.introduce();
        mom.move();
        mom.introduce();

        Puppy puppy = new Puppy();
        puppy.introduce();
        puppy.move();
        puppy.introduce();

    }
}

class FamilyMember {
    String city = "서울"; //상속하기 싫으면 private. 상속되는 것은 default, protected, public
}

class Mom extends FamilyMember {
    public void introduce() {
        System.out.println("저는 " + city + "에 삽니다.");
    }
    public void move() {
        city = "제주";
    }
}

class Puppy extends FamilyMember {
    public void introduce() {
        System.out.println("멍멍 "+ city + " 멍멍");
    }
    public void move() {
        city = "인천";
    }
}

//Mom과 Puppy는 FamilyMember라는 제네시스 설명서만 같지, 다른 자동차이다. 다른 인스턴스다.