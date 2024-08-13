package tree;

public class TreeTest {
    void test1(ITree tree) {
        INode root = new IntNode(1);

        tree.setRoot(root);

        root.addNode(new IntNode(3));

        root.getChild().get(0).addNode(new IntNode(2));


        System.out.println(tree);
    }
}
