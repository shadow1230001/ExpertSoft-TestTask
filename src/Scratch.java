import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Scratch {
    static Scratch instance = new Scratch();

    void merge(ArrayList a, ArrayList b) {
        a.addAll(b);

        Collections.sort(a, Comparator.comparing(i -> ((Integer) i)));
    }

    public static void main(String args[]) {
        test1();
    }

    static void test1() {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(3);
        a.add(5);

        ArrayList<Integer> b = new ArrayList<>();
        b.add(2);
        b.add(6);
        b.add(8);

        instance.merge(a, b);

        for (int i : a) System.out.print(i + " ");
        System.out.println();
        for (int i : b) System.out.print(i + " ");
    }

}
