package tree;

import java.util.Arrays;

public class TreeTest {

    private void getSample(ITree tree) {
        INode root = new IntNode(1);

        tree.setRoot(root);

        root.addNode(new IntNode(3));
        root.addNode(new IntNode(5));
        root.addNode(new IntNode(8));
        root.addNode(new IntNode(10));

        root.getChild().get(0).addNode(new IntNode(2));
        root.getChild().get(0).addNode(new IntNode(7));
        root.getChild().get(0).addNode(new IntNode(9));

        root.getChild().get(0).getChild().get(0).addNode(new IntNode(6));
        root.getChild().get(0).getChild().get(1).addNode(new IntNode(11));
        root.getChild().get(0).getChild().get(2).addNode(new IntNode(15));
    }

    private void getSample1(ITree tree) {
        INode root = new IntNode(10);

        tree.setRoot(root);

        root.addNode(new IntNode(5));
        root.addNode(new IntNode(15));

        root.getChild().get(0).addNode(new IntNode(3));
        root.getChild().get(0).addNode(new IntNode(7));

        root.getChild().get(1).addNode(new IntNode(12));
        root.getChild().get(1).addNode(new IntNode(18));
    }

    private String getSimaplPreOrderTraversal() {
        return "1, 3, 2, 6, 7, 11, 9, 15, 5, 8, 10";
    }

    private String getSimapl1PreOrderTraversal() {
        return "10, 5, 3, 7, 15, 12, 18";
    }

    private String getSimapl2PreOrderTraversal() {
        return "20, 10, 5, 15, 30, 25, 35";
    }

    private String getSimapl3PreOrderTraversal() {
        return "7, 3, 1, 5, 9, 8, 11";
    }

    private String getSimapl4PreOrderTraversal() {
        return "8, 4, 2, 6, 12, 10, 14";
    }

    private String getSimapl5PreOrderTraversal() {
        return "15, 10, 8, 12, 20, 17, 25";
    }

    private String getSimapl6PreOrderTraversal() {
        return "25, 15, 10, 20, 35, 30, 40";
    }

    private String getSimple7PreOrderTraversal() {
        return "30, 20, 15, 25, 40, 35, 45";
    }

    private String getSimple8PreOrderTraversal() {
        return "50, 30, 20, 40, 70, 60, 80";
    }

    private String getSimple9PreOrderTraversal() {
        return "5, 2, 1, 3, 8, 7, 10";
    }

    private String getSimple10PreOrderTraversal() {
        return "12, 6, 3, 9, 18, 15, 21";
    }

    private void getSample2(ITree tree) {
        INode root = new IntNode(20);

        tree.setRoot(root);

        root.addNode(new IntNode(10));
        root.addNode(new IntNode(30));

        root.getChild().get(0).addNode(new IntNode(5));
        root.getChild().get(0).addNode(new IntNode(15));

        root.getChild().get(1).addNode(new IntNode(25));
        root.getChild().get(1).addNode(new IntNode(35));
    }

    private void getSample3(ITree tree) {
        INode root = new IntNode(7);

        tree.setRoot(root);

        root.addNode(new IntNode(3));
        root.addNode(new IntNode(9));

        root.getChild().get(0).addNode(new IntNode(1));
        root.getChild().get(0).addNode(new IntNode(5));

        root.getChild().get(1).addNode(new IntNode(8));
        root.getChild().get(1).addNode(new IntNode(11));
    }

    private void getSample4(ITree tree) {
        INode root = new IntNode(8);

        tree.setRoot(root);

        root.addNode(new IntNode(4));
        root.addNode(new IntNode(12));

        root.getChild().get(0).addNode(new IntNode(2));
        root.getChild().get(0).addNode(new IntNode(6));

        root.getChild().get(1).addNode(new IntNode(10));
        root.getChild().get(1).addNode(new IntNode(14));
    }

    private void getSample5(ITree tree) {
        INode root = new IntNode(15);

        tree.setRoot(root);

        root.addNode(new IntNode(10));
        root.addNode(new IntNode(20));

        root.getChild().get(0).addNode(new IntNode(8));
        root.getChild().get(0).addNode(new IntNode(12));

        root.getChild().get(1).addNode(new IntNode(17));
        root.getChild().get(1).addNode(new IntNode(25));
    }

    private void getSample6(ITree tree) {
        INode root = new IntNode(25);

        tree.setRoot(root);

        root.addNode(new IntNode(15));
        root.addNode(new IntNode(35));

        root.getChild().get(0).addNode(new IntNode(10));
        root.getChild().get(0).addNode(new IntNode(20));

        root.getChild().get(1).addNode(new IntNode(30));
        root.getChild().get(1).addNode(new IntNode(40));
    }

    private void getSample7(ITree tree) {
        INode root = new IntNode(30);

        tree.setRoot(root);

        root.addNode(new IntNode(20));
        root.addNode(new IntNode(40));

        root.getChild().get(0).addNode(new IntNode(15));
        root.getChild().get(0).addNode(new IntNode(25));

        root.getChild().get(1).addNode(new IntNode(35));
        root.getChild().get(1).addNode(new IntNode(45));
    }

    private void getSample8(ITree tree) {
        INode root = new IntNode(50);

        tree.setRoot(root);

        root.addNode(new IntNode(30));
        root.addNode(new IntNode(70));

        root.getChild().get(0).addNode(new IntNode(20));
        root.getChild().get(0).addNode(new IntNode(40));

        root.getChild().get(1).addNode(new IntNode(60));
        root.getChild().get(1).addNode(new IntNode(80));
    }

    private void getSample9(ITree tree) {
        INode root = new IntNode(5);

        tree.setRoot(root);

        root.addNode(new IntNode(2));
        root.addNode(new IntNode(8));

        root.getChild().get(0).addNode(new IntNode(1));
        root.getChild().get(0).addNode(new IntNode(3));

        root.getChild().get(1).addNode(new IntNode(7));
        root.getChild().get(1).addNode(new IntNode(10));
    }

    private void getSample10(ITree tree) {
        INode root = new IntNode(12);

        tree.setRoot(root);

        root.addNode(new IntNode(6));
        root.addNode(new IntNode(18));

        root.getChild().get(0).addNode(new IntNode(3));
        root.getChild().get(0).addNode(new IntNode(9));

        root.getChild().get(1).addNode(new IntNode(15));
        root.getChild().get(1).addNode(new IntNode(21));
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
}
