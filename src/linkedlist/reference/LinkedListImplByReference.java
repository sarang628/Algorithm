package linkedlist.reference;

public class LinkedListImplByReference implements LinkedListByReference {

    INode root;
    INode tail;

    @Override
    public void add(INode node) {
        if(root == null) {
            root = node;
            tail = node;
        }else{
            tail.setNext(node);
            tail = node;
        }
    }

    @Override
    public boolean contains(int data) {
        INode n = root;
        while(n != null && n.getData() != data){
            n = n.next();
        }
        return n != null;
    }
}
