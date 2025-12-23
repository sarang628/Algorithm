package linkedlist;

public class Node<T> implements INode<T>{
    T data;
    INode next;

    @Override
    public T getData() {
        return data;
    }

    @Override
    public INode next() {
        return next;
    }

    @Override
    public void setNext(INode iNode) {
        next = iNode;
    }
}
