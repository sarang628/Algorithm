package tree.interfaces;

public interface ITree<Node> {
    void setRoot(Node node);

    /**
     * 전위 순회
     */
    String preorderTraversal();

    int depth(Node node);

    String postOrderTraversal();
}
