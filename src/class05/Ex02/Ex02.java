package class05.Ex02;

class Point{
    private int x, y;
    
    public Point(){
        this(0, 0);
    }
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void printShow(){
        System.out.println("(" + x + ", " + y + ")");
    }
}

class ColorPoint extends Point{
    private String color;
    public ColorPoint(int x, int y, String color){
        super(x, y);
        this.color = color;
    }

    public void showColorPoint(){
        System.out.print(color);
        printShow();
    }
}

public class Ex02 {

    public static void main(String[] args){
        ColorPoint cp = new ColorPoint(5, 6, "blue");

        cp.showColorPoint();
    }
}
