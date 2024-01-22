package collectionListHashSet;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
public class collectionListHashSetPractice {
    public static void main(String[] args)
    {
        Collection<String> c = new ArrayList<>();
     /*   c.add("Snow");
        c.add("tap");
        c.add("hat");
        c.add("Snow");*/

       // System.out.println(c);
        // Hash Set eliminates  the duplicate items
        c.add("Snow");
        c.add("tap");
        c.add("hat");
        c.add("Snow");
        Collection<String> favorites = new HashSet<>(c);
        System.out.println(favorites);

        //ArrayDeque<String> arrDeq  = new ArrayDeque<>(); would be more abstract type for object, rather use as
        //below
        Collection<String> arrDeq = new ArrayDeque<>();
        arrDeq.add("Snow");
        arrDeq.add("tap");
        arrDeq.add("hat");
        System.out.println(arrDeq);

        Collection<hotelRoom> room = new ArrayList<hotelRoom>();
        room.add(new hotelRoom("Suite","test",12,560));

        room.stream().forEach(e -> System.out.println(e.getName()));
    }
}
