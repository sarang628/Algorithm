package tree.impl.tree;

import tree.interfaces.IBinaryNode;
import tree.interfaces.IMultiNode;

public class PostorderTraversal<T> {
    public void postOrderTraversal(IMultiNode<T> node, StringBuilder sb) {
        if (node != null && !node.getChild().isEmpty()) {
            for (IMultiNode<T> child : node.getChild()) {
                postOrderTraversal(child, sb);
            }
        }{
            if (node != null)
                sb.append(node.getValue() + ", ");
        }
    }

    public void postOrderTraversal(IBinaryNode<T> node, StringBuilder sb) {

        if (node.getLeftChild() != null)
            postOrderTraversal(node.getLeftChild(), sb);

        if (node.getRightChild() != null)
            postOrderTraversal(node.getRightChild(), sb);

        sb.append(node.getValue() + ", ");
    }
}
