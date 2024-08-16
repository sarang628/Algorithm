package tree.impl.tree;

import tree.interfaces.IBinaryNode;
import tree.interfaces.IMultiNode;

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
