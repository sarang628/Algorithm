package tree.impl.binary;

import tree.impl.tree.InorderTraversal;
import tree.impl.tree.PostorderTraversal;
import tree.impl.tree.PreorderTraversal;
import tree.interfaces.IBinaryNode;
import tree.interfaces.IBinarySearchTree;

public class BinarySearchTreeImpl<T> implements IBinarySearchTree<T> {
    private IBinaryNode<T> root;


    @Override
    public void setRoot(IBinaryNode<T> node) {
        this.root = node;
    }

    @Override
    public String preorderTraversal() {
        StringBuilder sb = new StringBuilder();
        new PreorderTraversal<T>().preorderTraversal(root, sb);
        return sb.toString();
    }

    @Override
    public String inorderTraversal() {
        StringBuilder sb = new StringBuilder();
        new InorderTraversal<T>().inorderTraversal(root, sb);
        return sb.toString();
    }

    @Override
    public int depth(IBinaryNode<T> node) {
        return 0;
    }

    @Override
    public String postOrderTraversal() {
        StringBuilder sb = new StringBuilder();
        new PostorderTraversal<T>().postOrderTraversal(root, sb);
        return sb.toString();

    }

    @Override
    public String toString() {
        return preorderTraversal();
    }
}
