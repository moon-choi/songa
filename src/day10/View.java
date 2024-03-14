package day10;

import java.util.HashMap;
import java.util.Map;

public class View {
    public static void main(String[] args) {
        // 1. View -> Contoller (ex. 버튼 눌리면, 화면에 "안녕하세요" 출력)
        Controller controller = new Controller();
        Product product = new Product("img_strawberry.jpg", "딸기", 10000, "맛있다.");
        Product result = controller.registerProduct(product);

        // 5. Controller에게 받은 결과를 출력해줍니다.
        System.out.println(result.name + "등록 완료!");
    }
}

class Controller {
    Logic logic = new Logic();

    public Product registerProduct(Product product) {     // 반환 타입은 어떻게 결정하나요? = 사용자 화면 생각해봐요!
        // 2. View한테 요청을 받으면, Logic한테 일을 시킬거에요.
        Product registered = logic.addToDB(product);
        // 4. Logic에게 받은 결과를, View에게 줍니다.
        return registered;
    }
}

class Logic {

    // DB 대신 쓸 Map 만들어둬야지!
    Map<Integer, Product> db = new HashMap<>();

    // 3. Controller에게 요청 받은 일을 수행한 다음, 결과를 Controller에게 다시 전달.
    // 상품 등록
    public Product addToDB(Product product) {
        db.put(1, product);
        return db.get(1); //상품 등록 잘됐는지 확인
    }
}