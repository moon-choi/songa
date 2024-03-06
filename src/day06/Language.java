package day06;

public class Language {

    //    private String name = "자바";
    private String name;
//    public Language (String name){
//        this.name = name;
//    }



    //라이브러리용 클래스는 값을 초기화하지 않는 형태로 씀. 생성자가 초기화하게 하려고.
    /*
    필드를 밖에서 아무나 접근 못하게 하려면?
    -> private 은 나를 감싸고 있는 { } 안에서만 이용 가능.

    private 이라서 접근이 막혀서 밖에서 보지도 못할 때, 다른 곳에서 출력만 하게 해주려면?

    -> getter로. (값을 건드리지 않고 보기만 하게끔)
*/
    //getter: private으로 갇힌 필드의 값을 보여주기만 하는 메소드.
    public String getName() {
        return name;
    }
    //setter
    public void setName(String name) {
        this.name = name;
    }


}
