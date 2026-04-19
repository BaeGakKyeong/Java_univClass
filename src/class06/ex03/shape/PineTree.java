package class06.ex03.shape;
import class06.ex03.Life.Tree;

public class PineTree {
    public static void main(String[] args){
        Tree pinetree = new Tree("소나무");

        System.out.println("---소나무의 행동---");

        pinetree.photosynthesize();
        pinetree.breathe();;
    }
}
