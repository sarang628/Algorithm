package tree.impl.tree;

import tree.interfaces.IMultiNode;
import tree.interfaces.INode;

public class Print<T> {
    void printNode(IMultiNode<T> node, int depth) {
        if (node != null && !node.getChild().isEmpty()) {
            for (IMultiNode<T> child : node.getChild()) {
                System.out.print("depth : " + depth + " " + child.getValue() + "\n");
                printNode(child, depth + 1);
            }
        }
        if (depth == 1) {
            System.out.println("-----------");
        }
    }
}
