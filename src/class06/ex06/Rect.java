package class06.ex06;

public class Rect {
    int width, height;
    public Rect(int width, int height){
        this.width = width;
        this.height = height;
    }
    public boolean equals(Object obj){
        Rect r = (Rect)obj;

        if(width * height == r.width * r.height){
            return true;
        }
        else{
            return false;
        }
    }
}
