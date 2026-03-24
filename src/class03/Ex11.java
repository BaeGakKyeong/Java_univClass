package class03;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x, y;

        System.out.println("나뉘는 수를 수를 입력하시오 : ");
        x = scan.nextInt();
        
        System.out.println("나누는 수를 입력하시오 : ");
        y = scan.nextInt();

        try{
            System.out.println(x + " / " + y + " = " + x / y);
    
        }
        catch(ArithmeticException e){
            System.out.println("0으로 나눌 수 없습니다.");
        }
        finally{
            scan.close();
        }
    }
}
