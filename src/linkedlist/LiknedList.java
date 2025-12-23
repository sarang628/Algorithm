package linkedlist;

public class LiknedList<T> implements ILiknedList<T>{
    Node<T> root;
    Node<T> tail;
    @Override
    public INode getRoot() {
        return root;
    }

    @Override
    public INode getTail() {
        return tail;
    }

    @Override
    public void add(T data) {
        if(root == null){
            //root = new Node(data);
        }
    }

    @Override
    public void delete(T data) {

    }

    @Override
    public boolean contains(T data) {
        return false;
    }
}
