package class04;

public class Ex05 {

    int radius;
    String name;

    public Ex05(){
        this.name = "";
        radius = 1;
    }

    public Ex05(String name, int radius){
        this.name = name;
        this.radius = radius;
    }

    public double circleArea(){
        return this.radius * this.radius * 3.14;
    }

    public static void main(String[] args){
        Ex05 pizza = new Ex05("자바피자", 10);
        System.out.println(pizza.name + "의 면적은 " + pizza.circleArea());

        Ex05 donut = new Ex05();
        donut.name = "자바도넛";
        System.out.println(donut.name + "의 면적은 " + donut.circleArea());
    }
}
