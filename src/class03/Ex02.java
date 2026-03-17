package class03;
import java.util.Scanner;

public class Ex02 {

    public int average(){
        int num = 0, sum = 0, count = 0;;

        Scanner scan = new Scanner(System.in);

        do{
            num = scan.nextInt();
            sum += num;
            count++;
        }while(num != 0);

        if (count == 1) {
            return -1;
        }

        return sum / count;
    }

    public static void main(String[] args){
        Ex02 avg = new Ex02();
        float result = 0;       //받는 타입을 float로 하면 묵시적 형 변환이 이루어져 소서점 아래값까지 표현된다.

        System.out.println("자연수 값을 입력하시오. 0을 넣으면 종료됩니다.");

        result = avg.average();

        System.out.println("입력된 값의 평균은 " + result + "입니다.");
    }
}
