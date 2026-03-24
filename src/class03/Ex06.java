package class03;
import java.util.Scanner;

public class Ex06 {

    public int[] initializeArr(int[] array){
        Scanner scan = new Scanner(System.in);
        int[] array2 = array;

        for(int i = 0; i < 5; i++){
            array2[i] = scan.nextInt(); 
        }

        return array2;
    } 

    public int BiggestNum(int[] array){
        int result = 0;

        for(int k : array){
            if(result < k){
                result = k;
            }
            else{
                continue;
            }
        }
        return result;
    }

    public static void main(String[] args){
        int[] array;
        array = new int[5];

        Ex06 ex = new Ex06();

        System.out.println("양수 다섯개를 입력하시오.");
        ex.initializeArr(array);

        System.out.println("가장 큰 수는 " + ex.BiggestNum(array) + "입니다.");
    }
}
