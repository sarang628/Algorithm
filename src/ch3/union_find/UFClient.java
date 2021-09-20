package ch3.union_find;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import org.junit.Test;

public class UFClient {
    public static void main(String args[]) {
        uf(new In("./question/tinyUF.txt"));
    }

    public static int uf(In in) {
        int N = in.readInt();
        UF uf = new QuickUnion1(N);
        while (in.hasNextChar()) {
            int p = in.readInt();
            int q = in.readInt();
            if (uf.connected(p, q)) continue;
            uf.union(p, q);
            StdOut.println(p + " " + q);
        }
        StdOut.println(uf.count() + " components");

        StdOut.println(Integer.valueOf((int) uf.counter()) + " count");
        return uf.count();
    }

    @Test
    public void test() {

    }
}
