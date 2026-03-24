package class03;

public class Ex10 {

    public int[] cpyArr(int[] array){
        int[] array2 = new int[4];

        for(int i = 0; i < array2.length; i++){
            array2[i] = i;
        }

        return array2;
    }


    public static void main(String[] args){
        int[] array = new int[4];
        Ex10 ex = new Ex10();

        int[] array3 = ex.cpyArr(array);

        for(int k : array3){
            System.out.print(k + " ");
        }
    }
}
