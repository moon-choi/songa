package day10;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class View {
    public static void main(String[] args) {
        // 1. View -> Contoller (ex. 버튼 눌리면, 화면에 "안녕하세요" 출력)
        Controller controller = new Controller();
        Product product1 = new Product("img_strawberry.jpg", "딸기", 10000, "맛있다.");
        Product product2 = new Product("img_apple.jpg", "사과", 20000, "비싸다.");

        Product result1 = controller.registerProduct(product1);
        Product result2 = controller.registerProduct(product2);

        // 5. Controller에게 받은 결과를 출력해줍니다.
        System.out.println(result1.name + "등록 완료!");
        System.out.println(result2.name + "등록 완료!");

        // 상품 전체 조회
        List<Product> allProducts = controller.queryAll();
        for(int i = 0; i < allProducts.size(); i++) {
            System.out.println(allProducts.get(i).name);
        }

        for (Product p : allProducts) {
            System.out.println(p.name);
        }

        // 상품 개별 조회
        int id = 1;
        Product theOne = controller.queryOne(id);
        System.out.println("개별 상품: " + theOne.name);
    }
}

class Controller {
    Logic logic = new Logic();

    public Product registerProduct(Product product) {  // 반환 타입은 어떻게 결정하나요? = 사용자 화면 생각해봐요!
        // 2. View한테 요청을 받으면, Logic한테 일을 시킬거에요.
        Product registered = logic.addToDB(product);
        // 4. Logic에게 받은 결과를, View에게 줍니다.
        return registered;
    }

    public List<Product> queryAll() {
        List<Product> allProducts = logic.findAllProducts();
        return allProducts;
    }

    public Product queryOne(int id) {
        Product oneProduct = logic.findOneProduct(id);
        return oneProduct;
    }
}

class Logic {

    // DB 대신 쓸 Map 만들어둬야지!
    Map<Integer, Product> db = new HashMap<>();
    int id = 0;

    // 3. Controller에게 요청 받은 일을 수행한 다음, 결과를 Controller에게 다시 전달.
    // 상품 등록
    public Product addToDB(Product product) {
        db.put(id, product);
        return db.get(id++); //상품 등록 잘됐는지 확인
    }

    public List<Product> findAllProducts() {
        return new ArrayList<>(db.values());
    }

    public Product findOneProduct(int id) {
        return db.get(id);
    }
}