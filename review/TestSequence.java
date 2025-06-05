package test;

import review.Sequence;
import review.Selector;

public class TestSequence {
    public static void test() {
        Sequence s = new Sequence(10);
        for (int i = 0; i < 10; i++)
            s.add(Integer.toString(i)); // Add 0 to 9 as String

        Selector sl = s.getSelector(); // Get Selector from Sequence

        while (!sl.end()) {
            System.out.println(sl.current());
            sl.next();
        }
    }
}
