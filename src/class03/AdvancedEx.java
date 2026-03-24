package class03;
import java.util.Random;
import java.util.Scanner;

public class AdvancedEx {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int result = rand.nextInt(100) + 1;
        int counter = 0, userInput;
        int[] guessHistory = new int[100];

        for(int i = 0; i < guessHistory.length; i++){
            guessHistory[i] = -1;
        }

        System.out.println("1부터 100사이의 숫자를 맞혀보세요.");

        while(true){
            System.out.print("\n숫자를 입력하세요 >> ");
            userInput = scan.nextInt();
            guessHistory[counter] = userInput;
            counter++;

            if(userInput < result){
                System.out.println("Up! 더 큰 숫자입니다.");
            }
            else if(userInput > result){
                System.out.println("Down! 더 작은 숫자입니다.");
            }
            else{
                break;
            }
        }
        System.out.println("정답입니다! 총 " + counter + "번 만에 맞히셨네요.");

        System.out.print("당신의 입력기록: ");
        for(int k : guessHistory){      //Q. k == guessHistory[k]. 여기서 k는 guessHistroy를 참조하는 변수인가, 아니면 실제 리터럴을 갖나?
            if(k == -1){
                break;
            }
            System.out.print(k + " ");
        }
    }
}
