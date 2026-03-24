package class03;
import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int[] array;
        array = new int[5];

        int sum = 0;

        System.out.println("다섯개의 정수를 입력하시오.");
        
        for(int i = 0; i < array.length; i++){
            array[i] = scan.nextInt();
            sum += array[i];
        }

        System.out.println("평균은" + (float)(sum/5));
    }
}
