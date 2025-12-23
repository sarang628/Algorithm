package linkedlist;

/**
 * - a series of nodes
 * - insertion O(1)
 * - best practice : Queue
 */
public interface ILiknedList<T> {
    INode   getRoot ();
    INode   getTail ();
    void    add     (T data);
    void    delete  (T data);
    boolean contains(T data);
}
