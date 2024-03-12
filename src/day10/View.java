package day10;

public class View {
    public static void main(String[] args) {
        //e.g. 버튼이 눌리면 화면에 안녕하세요가 출력되는 가상 시나리오.
        //1. View가 Controller에게 일 시키고 (컨트롤러가 있어야 일을 시킬 수 있음. 그러므로 생성해야함.)
        Controller controller = new Controller();

        String hello = controller.getHello();
        //6. Controller에게 받은 결과를 출력.
        System.out.println(hello);
    }
}

class Controller {
    //2. View한테 요청을 받으면,  Model 로직 덩어리한테 일 시키고.
    Logic logic = new Logic();

    public String getHello() {
        String result = logic.hello();
        //5. Controller - 로직에게 받은 결과를 View에게 돌려줌.
        return result;
    }
}

//Model에서 로직 덩어리.
class Logic {
    //3. Controller에게 요청 받은 일을 수행한 다음
    public String hello(){
        return "안녕하세요"; //System.out.println("안녕하세요") 쓰면 안됌. 왜냐면 출력은 View가 해야함.
    }
    //4. 결과를 Controller에게 다시 전달.

}