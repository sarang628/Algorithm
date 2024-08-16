package tree.impl.tree;

import tree.interfaces.IBinaryNode;
import tree.interfaces.IMultiNode;

public class InorderTraversal<T> {
    public void inorderTraversal(IBinaryNode<T> node, StringBuilder sb) {

        if (node.getLeftChild() != null)
            inorderTraversal(node.getLeftChild(), sb);

        sb.append(node.getValue() + ", ");

        if (node.getRightChild() != null)
            inorderTraversal(node.getRightChild(), sb);
    }
}
