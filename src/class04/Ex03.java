package class04;

public class Ex03 {

    public void speak(){
        System.out.println("동물이 소리를 냅니다.");
    }

    public static void main(String[] args){
        Dog poppy = new Dog();
        Cat matcha = new Cat();

        System.out.println("----개별호출----");
        poppy.speak();
        matcha.speak();
    }
}

class Dog extends Ex03{
    public void speak(){
        System.out.println("멍멍");
    }
}

class Cat extends Ex03{
    public void speak(){
        System.out.println("야옹");
    }
}
