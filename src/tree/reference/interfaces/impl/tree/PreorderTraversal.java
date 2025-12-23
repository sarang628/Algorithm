package tree.reference.interfaces.impl.tree;

import tree.reference.interfaces.IBinaryNode;
import tree.reference.interfaces.IMultiNode;

public class PreorderTraversal<T> {
    public void preorderTraversal(IMultiNode<T> node, StringBuilder sb) {
        if (node != null)
            sb.append(node.getValue() + ", ");
        if (node != null && !node.getChild().isEmpty()) {
            for (IMultiNode<T> child : node.getChild()) {
                preorderTraversal(child, sb);
            }
        }
    }

    public void preorderTraversal(IBinaryNode<T> node, StringBuilder sb) {

        sb.append(node.getValue() + ", ");

        if (node.getLeftChild() != null)
            preorderTraversal(node.getLeftChild(), sb);

        if (node.getRightChild() != null)
            preorderTraversal(node.getRightChild(), sb);
    }
}
