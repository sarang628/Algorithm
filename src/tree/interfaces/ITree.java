package tree.interfaces;

/**
 * https://en.wikipedia.org/wiki/Tree_(abstract_data_type)
 *
 */
public interface ITree<Node> {
    void setRoot(Node node);

    String preorderTraversal();

    int depth(Node node);

    String postOrderTraversal();
}
