package ch3.fixed_capacity_stack_of_strings;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Main {
    public static void main(String args[]) {
        In in = new In("./src/ch3/fixed_capacity_stack_of_strings/test.txt");
        testFixedCapacityStackOfStrings(in);
    }

    public static void testFixedCapacityStackOfStrings(In in) {
        FixedCapacityStackOfStrings s;
        s = new FixedCapacityStackOfStringsImpl(100);

        while (in.hasNextChar()) {
            String item = in.readString();
            if (!item.equals("-"))
                s.push(item);
            else if (!s.isEmpty()) StdOut.print(s.pop() + " ");
        }
        StdOut.println("(" + s.size() + " left on stack)");
    }
}
