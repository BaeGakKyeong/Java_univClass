package class03;
import java.util.Scanner;

public class Ex11 {

    public int divide(int i, int j) throws ArithmeticException{
        return i / j;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Ex11 ex = new Ex11();

        int x, y;

        System.out.println("나뉘는 수를 수를 입력하시오 : ");
        x = scan.nextInt();
        
        System.out.println("나누는 수를 입력하시오 : ");
        y = scan.nextInt();

        try{
            System.out.println(x + " / " + y + " = " + ex.divide(x, y));
    
        }
        catch(ArithmeticException e){
            System.out.println(e.toString());
        }
        finally{
            scan.close();
        }
    }
}
