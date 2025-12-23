package linkedlist.test;

import linkedlist.reference.ILinkedListByReference;
import linkedlist.reference.Node;
import org.junit.Assert;

public class LinkedListTest {
    public void test(ILinkedListByReference linkedList) {

        linkedList.add(new Node(1));
        linkedList.add(new Node(2));
        linkedList.add(new Node(3));
        linkedList.add(new Node(4));
        linkedList.add(new Node(5));

        String result = linkedList.print();

        Assert.assertEquals("12345", result);
    }
}
