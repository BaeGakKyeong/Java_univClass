package class03;

public class Ex08 {

    public static void main(String[] args){
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
            sum += array[i];
        }
        System.out.print("합은 " + sum + "\n");

        String[] str = {"사과", "배", "바나나", "체리", "딸기", "포도"};

        for(String k : str){
            System.out.print(k + " ");
        }
    }



}
