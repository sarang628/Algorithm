package tree.interfaces;

public interface IBinarySearchTree<T> extends ITree<IBinaryNode<T>> {
    String inorderTraversal();
}
