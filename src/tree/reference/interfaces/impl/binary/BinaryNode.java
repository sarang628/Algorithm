package tree.reference.interfaces.impl.binary;

import tree.reference.interfaces.IBinaryNode;

public class BinaryNode<T> implements IBinaryNode<T> {
    T value;
    IBinaryNode<T> left;
    IBinaryNode<T> right;

    public BinaryNode(T value) {
        this.value = value;
    }

    @Override
    public IBinaryNode<T> getLeftChild() {
        return left;
    }

    @Override
    public IBinaryNode<T> getRightChild() {
        return right;
    }

    @Override
    public void setLeftChild(IBinaryNode<T> child) {
        left = child;
    }

    @Override
    public void setRightChild(IBinaryNode<T> child) {
        right = child;
    }

    @Override
    public T getValue() {
        return value;
    }
}
