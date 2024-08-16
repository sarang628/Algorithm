package tree.interfaces;

public interface IBinaryNode<T> extends INode<T> {

    IBinaryNode<T> getLeftChild();

    IBinaryNode<T> getRightChild();

    void setLeftChild(IBinaryNode<T> child);

    void setRightChild(IBinaryNode<T> child);
}
