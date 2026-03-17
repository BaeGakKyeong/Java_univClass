package class03;
import java.util.Scanner;

public class Ex04 {

    int endNum;

    public Ex04(int endNum){
        this.endNum = endNum;
    }

    public void printMultiplicationTable(int endNumber){
        for(int i = 1; i < 10; i++){
            System.out.println();

            for(int j = 1; j <= endNumber; j++){
                System.out.print(j + " * " + i + " = " + i * j + "\t");
            }
        }
    }    

    public static void main(String[] args){
        Ex04 MT = new Ex04(9);
        Scanner scan = new Scanner(System.in);

        System.out.println("구구단을 출력합니다. 자연수 n을 입력하면, n단까지 출력합니다.");
        int number = scan.nextInt();

        if(number < 1){
            MT.printMultiplicationTable(9);
        }
        else{
            MT.printMultiplicationTable(number);
        }
        scan.close();
    }
}
