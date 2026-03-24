package class04;

public class Ex04 {
    int radius;
    String name;

    public double circleArea(){
        return this.radius * this.radius * 3.14;
    }

    public static void main(String[] args){
        Ex04 pizza = new Ex04();
        Ex04 donut = new Ex04();

        //피자
        pizza.name = "자바피자";
        pizza.radius = 10;

        //도넛
        donut.name = "자바도넛";
        donut.radius = 2;

        System.out.println(pizza.name + "의 면적은 " + pizza.circleArea());
        System.out.println(donut.name + "의 면적은 " + donut.circleArea());
    }
}
