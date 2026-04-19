package class06.ex05;

public class Point {
    private int x, y, z;

    public Point(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public String toString(){
        return "Point( " + x + ", " + y + ", " + z + " )";
    }
}
