package linkedlist.reference;

public class Node implements INode {
    private final int data;
    private INode next;
    public Node(int data) { this.data = data; }
    @Override  public int getData() { return data; }
    @Override  public void setNext(INode node) { next = node; }
    @Override  public INode next() { return next; }
}