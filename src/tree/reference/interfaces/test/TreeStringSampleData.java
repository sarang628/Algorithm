package tree.reference.interfaces.test;

import tree.reference.interfaces.impl.tree.IntNodeImpl;
import tree.reference.interfaces.IMultiNode;
import tree.reference.interfaces.ITree;

public class TreeStringSampleData {
    static void getSample(ITree tree) {
        IMultiNode<String> root = new IntNodeImpl("/");

        tree.setRoot(root);

        root.addNode(new IntNodeImpl("+"));
        root.addNode(new IntNodeImpl("-"));

        root.getChild().get(0).addNode(new IntNodeImpl("2"));
        root.getChild().get(0).addNode(new IntNodeImpl("7"));

        root.getChild().get(1).addNode(new IntNodeImpl("2"));
        root.getChild().get(1).addNode(new IntNodeImpl("7"));
    }
}
