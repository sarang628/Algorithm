package tree.impl.tree;

import tree.interfaces.IMultiNode;
import tree.interfaces.ITree;

public class MultiNodeTreeImpl<T> implements ITree<IMultiNode<T>> {
    private IMultiNode<T> root;

    @Override
    public void setRoot(IMultiNode<T> node) {
        root = node;
    }

    @Override
    public String preorderTraversal() {
        StringBuilder s = new StringBuilder();
        new PreorderTraversal<T>().preorderTraversal(root, s);
        return s.substring(0, s.length() - 2);
    }

    @Override
    public int depth(IMultiNode<T> node) {
        return new Depth<T>().depth(root, node);
    }

    @Override
    public String postOrderTraversal() {
        StringBuilder s = new StringBuilder();
        new PostorderTraversal<T>().postOrderTraversal(root, s);
        return s.substring(0, s.length() - 2);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("root : " + root.getValue());
        new Print<T>().printNode(root, 0);
        return sb.toString();
    }
}
