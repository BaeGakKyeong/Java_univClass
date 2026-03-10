package class02;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int time = scan.nextInt();

        int second = time % 60;
        int minute = (time / 60) % 60;
        int hour = (time / 60) / 60;

        System.out.print(time + "초는 " + hour + "시간, " + minute + "분, " + second + "초 입니다. ");

        scan.close();
    }
}
