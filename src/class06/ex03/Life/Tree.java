package class06.ex03.Life;

public class Tree extends Plant{
    String name;

    public Tree(String name){
        this.name = name;
    }

    public void breathe(){
        System.out.println(this.name + " Three breathe.");
    }
    public void photosynthesize(){
        System.out.println(this.name + " Tree photosynthesize.");
    }
}
