package class04;

public class Ex02 {
    void breathe(){
        System.out.println("생물이 숨을 쉽니다.");
    }
}

class Plant extends Ex02{
    void photosynthesize(){
        System.out.println("식물이 광합성을 합니다.");
    }
}

class Tree extends Plant{
    String name = "tree";

    Tree(String name){
        this.name = name;
    }

    void growback(){
        System.out.println(this.name + "에 단단한 나무껍질이 자랍니다.");
    }


    public static void main(String[] args){
        Tree pineTree = new Tree("소나무");
    
        System.out.println("----소나무의 행동----");

        pineTree.growback();
        pineTree.photosynthesize();
        pineTree.breathe();
    }
}
