package linkedlist.reference;

/**
 * - a series of nodes.
 * - always maintain head and tail pointers
 * - Insertion is O(1)
 * - Deletion is O(n)
 * - Searching is O(n)
 */
public interface ILinkedListByReference {
    void add(INode node);
    boolean contains(int data);

    String print();
}