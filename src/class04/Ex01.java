package class04;

public class Ex01 {
    private int balence = 0;    //생성자

    public Ex01(int money){
        this.balence = money;   //기본 생성자               
    }

    public int getBalance(){
        return this.balence;
    }

    public void withdraw(int amount){
        if(amount > 0 && this.balence - amount > 0){
            this.balence -= amount;
            System.out.println("계좌에서 " + amount + "원이 출금되었습니다.");
        }
        else{
            System.out.println("계좌에 돈이 없거나 출금액이 잘못 입력되었습니다.");
        }
    }

    public static void main(String[] args){
        Ex01 ex = new Ex01(500000);

        ex.withdraw(1000);
        System.out.println("현재 잔액은 " + ex.getBalance() + "입니다.");
    }
}
