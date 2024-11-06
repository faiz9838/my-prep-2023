package JAVA.Collection.Set.EnumSet;

import java.util.EnumSet;

import java.util.Iterator;

enum friends {
    talha, humza;

}

public class example {
    public static void main(String[] args) {
        EnumSet<friends> set;

        // of(E e) => Creates an enum set initially containing the specified element.
        set = EnumSet.of(friends.talha);

        // allOf(size) => Creates an enum set containing all of the elements in the
        // specified element type.
        set = EnumSet.allOf(friends.class);
        System.out.println(set);

        Iterator<friends> iterate = set.iterator();

        while (iterate.hasNext()) {
            System.out.println(iterate.next());
        }

    }
}
