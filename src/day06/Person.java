package day06;

public class Person {
    public void sayFavoriteLanguage(String language) {
        //생성자 쓰는 방법
//        Language favoriteLanguage = new Language("파이썬"); //생성자가 필드의 "자바"보다 더 우선순위를 가짐.

        //setter 쓰는 방법
        Language favoriteLanguage = new Language();
//        System.out.println("내가 좋아하는 언어는 " + favoriteLanguage.getName() + "(이)야.");

        favoriteLanguage.setName("코틀린");
        System.out.println("내가 좋아하는 언어는 " + favoriteLanguage.getName() + "(이)야.");
    }
}
