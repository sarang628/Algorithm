package tree.reference.interfaces.impl.tree;

import tree.reference.interfaces.IBinaryNode;

public class InorderTraversal<T> {
    public void inorderTraversal(IBinaryNode<T> node, StringBuilder sb) {

        if (node.getLeftChild() != null)
            inorderTraversal(node.getLeftChild(), sb);

        sb.append(node.getValue() + ", ");

        if (node.getRightChild() != null)
            inorderTraversal(node.getRightChild(), sb);
    }
}
