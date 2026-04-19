package class05.Ex05;

class Organism{
    void breathe(){
        System.out.println("생물이 숨을 쉽니다.");
    }
}

class Plant extends Organism{
    void photosynthesize(){
        System.out.println("식물이 햇빛을 받아 광합성을 합니다.");
    }
}

class Tree extends Plant{
    String name;

    Tree(String name){
        this.name = name;
    }
    void breathe(){
        System.out.println(this.name + "가 맑은 공기를 뿜으며 숨을 쉽니다.");
    }
    void photosynthesize(){
        System.out.println(this.name + "가 푸른 잎으로 광합성을 합니다.");
    }
}

public class Ex05 {
    public static void main(String[] args){
        Tree pineTree = new Tree("소나무");

        System.out.println("----소나무의 행동----");
        
        pineTree.photosynthesize();
        pineTree.breathe();
    }
}
