import java.util.*;

public class arraylist1 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        // list.add(10);
        // list.add(20);
        // list.add(30);
        // System.out.println(list + " > added");

        // System.out.println(list.size() + " > size");

        // list.add(40);
        // System.out.println(list+" >  added");

        // System.out.println(list.get(2) + " > get");
        // System.out.println(list);

        // System.out.println(list.set(1, 49) + " > set");
        // System.out.println(list);

        // System.out.println(list.remove(0) + " > remove");
        // System.out.println(list);

        // System.out.println(list.remove(Integer.valueOf(44)) + " > remove");
        // System.out.println(list);
        // System.out.println(list.remove(Integer.valueOf(49)) + " > remove");
        // System.out.println(list);

        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        System.out.println(list.size());
        list.add(40);
        System.out.println(list.get(1));
        System.out.println(list.set(2, 143)+ "dd");
        System.out.println(list.remove(1));
       
        System.out.println(list);

    }
}