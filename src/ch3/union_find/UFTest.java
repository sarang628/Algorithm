package ch3.union_find;

import edu.princeton.cs.algs4.In;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UFTest {

    public int uf(In in) {
        int N = in.readInt();
        UF uf = new QuickUnion3(N);
        while (in.hasNextChar()) {
            int p = in.readInt();
            int q = in.readInt();
            if (uf.connected(p, q)) continue;
            uf.union(p, q);
        }
        return uf.count();
    }

    @Test
    public void test() {
        assertEquals(9, uf(new In("./question/tinyUF.txt")));

//        assertEquals(2, uf(new In("./question/tinyUF1.txt")));

//        assertEquals(796, uf(new In("./question/tinyUF3.txt")));

//        assertEquals(3, uf(new In("./question/mediumUF1.txt")));

//        assertEquals(3, uf(new In("./question/mediumUF.txt")));

    }
}
