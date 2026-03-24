package class03;
import java.util.Scanner;

public class Ex05 {
    String name;                        //생성자 선언
    int age;

    public Ex05(String name, int age){
        this.name = name;               //기본 생성자 선언
        this.age = age;
    }

    public void makeProfile(){
        Scanner scan = new Scanner(System.in);

        String name = "";
        int age = 0;
        
        while(true){
            System.out.println("이름을 입력하세요 (종료는 exit) >> ");
            name = scan.next();
            if(name == "exit"){
                break;
            }
        }
    }

    public static void main(String[] args){
    }
}
