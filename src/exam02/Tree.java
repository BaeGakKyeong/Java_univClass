package exam02;

public class Tree extends Plant{
    String name;

    Tree(String name){
        this.name = name;
    }

    void growBark(){
        System.out.println(this.name + "에 단단한 나무껍질이 자랍니다.");
    }
}
