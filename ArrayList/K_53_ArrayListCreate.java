import java.util.ArrayList;

public class K_53_ArrayListCreate {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(22);
        list.add(15);
        list.add(66);
        list.add(82);
        System.out.println(list); // add

        // int getele=list.get(3); //get element
        // System.out.println(getele);

        // list.remove(2); //remove element
        // System.out.println(list);

        // list.set(2,77); // set element
        // System.out.println(list);

        System.out.println(list.contains(46));

        list.add(1, 44);
        System.out.println(list);

    }
}
