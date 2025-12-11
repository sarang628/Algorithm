package linkedlist;

import linkedlist.reference.LinkedListByReference;
import linkedlist.reference.LinkedListImplByReference;
import linkedlist.reference.Node;

public class Main {
    public static void main(String args[]){
        LinkedListByReference linkedList = new LinkedListImplByReference();
        linkedList.add(new Node(1));
        linkedList.add(new Node(2));
        linkedList.add(new Node(3));
        linkedList.add(new Node(4));

        System.out.println(
                linkedList.contains(10)
        );
    }
}
