package exam02;

public class TreeExam {
    public static void main(String[] args){
        Tree pineTree = new Tree("소나무");

        System.out.println("---소나무의 행동---");

        pineTree.growBark();
        pineTree.photosynthesize();
        pineTree.breathe();
    }
}
