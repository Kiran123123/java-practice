package basics;

import java.util.ArrayList;
import java.util.Collections;

public class KevCollections {

    public static void main(String[] args) {

        /*Vector<String> v = new Vector<>();
        v.add("Kiran");
        v.add("Saheer");
        System.out.println(v);
        v.add(2,"Kevin");
        System.out.println(v);
        v.set(1,"Idru");
        System.out.println(v);

    }*/

        ArrayList<Integer> Num = new ArrayList<Integer>();
        Num.add(1);
        Num.add(2);
        Num.add(3);
        Num.add(4);
        System.out.println(Num);

/*        Num.remove(2);
        System.out.println(Num);*/
        Num.set(2, 8);
        System.out.println(Num);

        System.out.println("Index of 8 "+ Num.contains(7));

        Collections.sort(Num);
        Collections.reverse(Num);
        System.out.println(Num);


        System.out.println(Num.size());

        for (Integer Add : Num)
            System.out.println(Add);
    }
}
