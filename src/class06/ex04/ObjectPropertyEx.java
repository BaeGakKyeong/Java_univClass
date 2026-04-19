package class06.ex04;

public class ObjectPropertyEx {
    public static void main(String[] args){
        ObjectProperty op = new ObjectProperty(2, 3);

        System.out.println(op.getClass().getName());
        System.out.println(op.hashCode());
        System.out.println(op.toString());
    }
}
