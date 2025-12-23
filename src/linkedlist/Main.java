package linkedlist;

import linkedlist.reference.LinkedListImplByReference;
import linkedlist.test.LinkedListTest;

public class Main {
    public static void main(String args[]){
        LinkedListTest test = new LinkedListTest();

        test.test(new LinkedListImplByReference());
    }
}
