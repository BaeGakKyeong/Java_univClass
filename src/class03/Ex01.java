package class03;

public class Ex01{
    int sum;            //생성자

    public Ex01(){
        this.sum = 0;   //자신을 참조하는 this를 사용하여 sum의 초기값을 지정
    }

    public void printSum(int limit){
        for(int i = 1; i <= limit; i++){
            this.sum += i;
            System.out.print(i + " ");

            if(i < limit) {
                System.out.print("+ ");
            }
            else{
                System.out.print("= ");
            }
        }

        System.out.println(this.sum);
    }


    public static void main(String[] args){
        Ex01 sigma = new Ex01();

        sigma.printSum(10);
    }
}
