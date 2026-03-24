package class04;
import java.util.Scanner;

public class Ex06 {
    String author, title;

    public Ex06(String title, String author){
        this.author = author;
        this.title = title;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in, "UTF-8");
        Ex06[] book = new Ex06[2];

        for(int i = 0; i < book.length; i++){
            System.out.println("책의 이름을 입력하시오 :");
            book[i].title = scan.next();
            System.out.println("책의 저자명을 입력하시오 :");
            book[i].author = scan.next();
        }

        System.out.println("입력된 책은...");
        for(int i = 0; i < book.length; i++){
            System.out.println(book[i].title + ", " + book[i].author);
        }

        scan.close();
    }
}
