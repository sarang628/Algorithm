package tree.interfaces;

public interface ITree {

    void setRoot(INode node);

    /**
     * 전위 순회
     */
    String preorderTraversal();

    String inorderTraversal();

    int depth(INode node);
}
