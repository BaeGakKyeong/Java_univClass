package class06.ex06;

public class RectEx {
    public static void main(String[] args){
        Rect r1 = new Rect(2, 3);
        Rect r2 = new Rect(3, 2);
        Rect r3 = new Rect(3, 4);

        if(r1.equals(r2)){
            System.out.println("r1 is equal to r2");
        }
        if(r2.equals(r3)){
            System.out.println("r1 is equal to r2");
        }
        if(r3.equals(r1)){
            System.out.println("r1 is equal to r2");
        }       
    }
}
