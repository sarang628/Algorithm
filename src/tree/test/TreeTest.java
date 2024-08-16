package tree.test;

import tree.impl.binary.BinarySearchTreeImpl;
import tree.impl.tree.IntNodeImpl;
import tree.impl.tree.MultiNodeTreeImpl;
import tree.interfaces.ITree;

import static tree.test.PreOrderTraversal.*;
import static tree.test.TreeIntSampleData.*;

public class TreeTest {
    public static void main(String[] args) {
//        new TreeTest().test1(new TreeImpl());
//        new TreeTest().preOrderTest(new TreeImpl());
//        new TreeTest().preOrderTest1(new TreeImpl());
//        new TreeTest().preOrderTest2(new TreeImpl());
//        new TreeTest().preOrderTest3(new TreeImpl());
        TreeTest.inOrderTest(new MultiNodeTreeImpl());
//        new TreeTest().depthTest(new TreeImpl());
        BinaryTreeTest.test(new BinarySearchTreeImpl<>());
    }

    private static void inOrderTest(MultiNodeTreeImpl tree) {
        TreeStringSampleData.getSample(tree);
    }

    private void preOrderTest3(MultiNodeTreeImpl tree) {
        TreeStringSampleData.getSample(tree);
        System.out.println(tree.preorderTraversal());
    }


    void test1(ITree tree) {
        getSample(tree);
        System.out.println(tree);
    }

    void preOrderTest(ITree tree) {
        System.out.println("preOrderTest");
        getSample(tree);
        if (tree.preorderTraversal().equals(getSimaplPreOrderTraversal())) {
            System.out.println("preOrderTest success");
        } else {
            System.out.println("preOrderTest failed");
        }
    }

    void preOrderTest1(ITree tree) {
        System.out.println("preOrderTest1");
        getSample1(tree);
        if (tree.preorderTraversal().equals(getSimapl1PreOrderTraversal())) {
            System.out.println("preOrderTest1 success");
        } else {
            System.out.println("preOrderTest1 failed");
        }
    }

    void preOrderTest2(ITree tree) {
        System.out.println("preOrderTest2");
        getSample2(tree);
        if (tree.preorderTraversal().equals(getSimapl2PreOrderTraversal())) {
            System.out.println("preOrderTest2 success");
        } else {
            System.out.println("preOrderTest2 failed");
        }
    }

    void depthTest(ITree tree) {
        getSample(tree);
        int result = 0;

        result = tree.depth(new IntNodeImpl(1));
        System.out.println(result);

        result = tree.depth(new IntNodeImpl(3));
        System.out.println(result);

        result = tree.depth(new IntNodeImpl(2));
        System.out.println(result);

        result = tree.depth(new IntNodeImpl(6));
        System.out.println(result);

        result = tree.depth(new IntNodeImpl(11));
        System.out.println(result);

        result = tree.depth(new IntNodeImpl(15));
        System.out.println(result);
    }
}
