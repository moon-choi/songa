package day07;

public class EX02 {
    public static void main(String[] args) {
    Book harryPotter = new Book();
//    harryPotter.printInfo();

    Novel novel = new Novel("title", 56);
    Comic comic = new Comic("스파이더맨", 25000, "판타지");
//    novel.printInfo();
//    comic.printInfo();
    Novel novel1 = new Novel();
    novel1.printInfo();
    }
}

class Book {
    String title;
    int price;
    public Book(){
        this.title = "book title";
    }

    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    void printInfo(){
        System.out.println("이 책의 제목은 " + title + "이고, 가격은 " + price + "입니다.");
    }
}

class Novel extends Book {
    public Novel(){
        super();
        this.title = "novel title";
    }

    public Novel(String title, int price) {
        super(title, price); // 부모 생성자 호출.
//        this.title = title;
//        this.price = price;
    }
}

class Comic extends Book {
    String genre;
     public Comic(String title, int price, String genre) {
         super(title, price);
         this.genre = genre;
     }



}