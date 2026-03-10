package class02;
import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args){
        System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요");

        Scanner scan = new Scanner(System.in);

        String name = scan.next();
        System.out.println("당신의 이름은 " + name + "입니다.");

        String city = scan.next();
        System.out.println("당신이 사는 도시는 " + city + "입니다.");

        int age = scan.nextInt();
        System.out.println("당신의 나이는 " + age + "입니다.");

        int weight = scan.nextInt();
        System.out.println("당신의 체중은 " + weight + "입니다.");

        boolean single = scan.nextBoolean();
        System.out.println("당신의 독신 여부는 " + single + "입니다.");

        scan.close();
    }
}
