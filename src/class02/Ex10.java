package class02;
import java.util.Scanner;

public class Ex10 {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("나이를 입력하시오: ");
        int age = scan.nextInt();

        if((age >= 20) && (age < 30)){
            System.out.println("20대입니다. ");
            System.out.println("20대라서 행복합니다!");
        }
        else{
            System.out.println("20대가 아닙니다.");
        }

        scan.close();
    }
}
