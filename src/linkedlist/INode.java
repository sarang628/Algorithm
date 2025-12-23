package linkedlist;

public interface INode<T> {
    T getData();
    INode next();
    void setNext(INode iNode);
}
