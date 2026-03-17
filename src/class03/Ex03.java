package class03;

public class Ex03 {
    char endChar;                   //생성자

    public Ex03(char endChar){
        this.endChar = endChar; //기본 생성자 지정(defalt constructor)
    }

    public void useWhile(char startAlphabet){
        while(startAlphabet < this.endChar){
            System.out.println(startAlphabet);
            startAlphabet++;
        }
    }

    public void useDoWhile(char startAlphabet){
            do{
                System.out.println(startAlphabet);
                startAlphabet++;
            }while(startAlphabet < this.endChar);
    }


    public static void main(String[] args){
        Ex03 whileOrDoWhile = new Ex03('c');

        whileOrDoWhile.useWhile('d');
        whileOrDoWhile.useDoWhile('d');
    }
}
