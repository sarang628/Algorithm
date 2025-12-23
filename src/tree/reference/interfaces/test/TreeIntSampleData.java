package tree.reference.interfaces.test;

import tree.reference.interfaces.impl.tree.IntNodeImpl;
import tree.reference.interfaces.IMultiNode;
import tree.reference.interfaces.ITree;

public class TreeIntSampleData {
    static void getSample(ITree tree) {
        IMultiNode<Integer> root = new IntNodeImpl(1);

        tree.setRoot(root);

        root.addNode(new IntNodeImpl(3));
        root.addNode(new IntNodeImpl(5));
        root.addNode(new IntNodeImpl(8));
        root.addNode(new IntNodeImpl(10));

        root.getChild().get(0).addNode(new IntNodeImpl(2));
        root.getChild().get(0).addNode(new IntNodeImpl(7));
        root.getChild().get(0).addNode(new IntNodeImpl(9));

        root.getChild().get(0).getChild().get(0).addNode(new IntNodeImpl(6));
        root.getChild().get(0).getChild().get(1).addNode(new IntNodeImpl(11));
        root.getChild().get(0).getChild().get(2).addNode(new IntNodeImpl(15));
    }

    static void getSample1(ITree tree) {
        IMultiNode<Integer> root = new IntNodeImpl(10);

        tree.setRoot(root);

        root.addNode(new IntNodeImpl(5));
        root.addNode(new IntNodeImpl(15));

        root.getChild().get(0).addNode(new IntNodeImpl(3));
        root.getChild().get(0).addNode(new IntNodeImpl(7));

        root.getChild().get(1).addNode(new IntNodeImpl(12));
        root.getChild().get(1).addNode(new IntNodeImpl(18));
    }

    static void getSample2(ITree tree) {
        IMultiNode<Integer> root = new IntNodeImpl(20);

        tree.setRoot(root);

        root.addNode(new IntNodeImpl(10));
        root.addNode(new IntNodeImpl(30));

        root.getChild().get(0).addNode(new IntNodeImpl(5));
        root.getChild().get(0).addNode(new IntNodeImpl(15));

        root.getChild().get(1).addNode(new IntNodeImpl(25));
        root.getChild().get(1).addNode(new IntNodeImpl(35));
    }

    private static void getSample3(ITree tree) {
        IMultiNode<Integer> root = new IntNodeImpl(7);

        tree.setRoot(root);

        root.addNode(new IntNodeImpl(3));
        root.addNode(new IntNodeImpl(9));

        root.getChild().get(0).addNode(new IntNodeImpl(1));
        root.getChild().get(0).addNode(new IntNodeImpl(5));

        root.getChild().get(1).addNode(new IntNodeImpl(8));
        root.getChild().get(1).addNode(new IntNodeImpl(11));
    }

    private static void getSample4(ITree tree) {
        IMultiNode<Integer> root = new IntNodeImpl(8);

        tree.setRoot(root);

        root.addNode(new IntNodeImpl(4));
        root.addNode(new IntNodeImpl(12));

        root.getChild().get(0).addNode(new IntNodeImpl(2));
        root.getChild().get(0).addNode(new IntNodeImpl(6));

        root.getChild().get(1).addNode(new IntNodeImpl(10));
        root.getChild().get(1).addNode(new IntNodeImpl(14));
    }

    private static void getSample5(ITree tree) {
        IMultiNode<Integer> root = new IntNodeImpl(15);

        tree.setRoot(root);

        root.addNode(new IntNodeImpl(10));
        root.addNode(new IntNodeImpl(20));

        root.getChild().get(0).addNode(new IntNodeImpl(8));
        root.getChild().get(0).addNode(new IntNodeImpl(12));

        root.getChild().get(1).addNode(new IntNodeImpl(17));
        root.getChild().get(1).addNode(new IntNodeImpl(25));
    }

    private static void getSample6(ITree tree) {
        IMultiNode<Integer> root = new IntNodeImpl(25);

        tree.setRoot(root);

        root.addNode(new IntNodeImpl(15));
        root.addNode(new IntNodeImpl(35));

        root.getChild().get(0).addNode(new IntNodeImpl(10));
        root.getChild().get(0).addNode(new IntNodeImpl(20));

        root.getChild().get(1).addNode(new IntNodeImpl(30));
        root.getChild().get(1).addNode(new IntNodeImpl(40));
    }

    private static void getSample7(ITree tree) {
        IMultiNode<Integer> root = new IntNodeImpl(30);

        tree.setRoot(root);

        root.addNode(new IntNodeImpl(20));
        root.addNode(new IntNodeImpl(40));

        root.getChild().get(0).addNode(new IntNodeImpl(15));
        root.getChild().get(0).addNode(new IntNodeImpl(25));

        root.getChild().get(1).addNode(new IntNodeImpl(35));
        root.getChild().get(1).addNode(new IntNodeImpl(45));
    }

    private static void getSample8(ITree tree) {
        IMultiNode<Integer> root = new IntNodeImpl(50);

        tree.setRoot(root);

        root.addNode(new IntNodeImpl(30));
        root.addNode(new IntNodeImpl(70));

        root.getChild().get(0).addNode(new IntNodeImpl(20));
        root.getChild().get(0).addNode(new IntNodeImpl(40));

        root.getChild().get(1).addNode(new IntNodeImpl(60));
        root.getChild().get(1).addNode(new IntNodeImpl(80));
    }

    private static void getSample9(ITree tree) {
        IMultiNode<Integer> root = new IntNodeImpl(5);

        tree.setRoot(root);

        root.addNode(new IntNodeImpl(2));
        root.addNode(new IntNodeImpl(8));

        root.getChild().get(0).addNode(new IntNodeImpl(1));
        root.getChild().get(0).addNode(new IntNodeImpl(3));

        root.getChild().get(1).addNode(new IntNodeImpl(7));
        root.getChild().get(1).addNode(new IntNodeImpl(10));
    }

    private static void getSample10(ITree tree) {
        IMultiNode<Integer> root = new IntNodeImpl(12);

        tree.setRoot(root);

        root.addNode(new IntNodeImpl(6));
        root.addNode(new IntNodeImpl(18));

        root.getChild().get(0).addNode(new IntNodeImpl(3));
        root.getChild().get(0).addNode(new IntNodeImpl(9));

        root.getChild().get(1).addNode(new IntNodeImpl(15));
        root.getChild().get(1).addNode(new IntNodeImpl(21));
    }
}
