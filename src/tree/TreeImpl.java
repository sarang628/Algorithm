package tree;

public class TreeImpl implements ITree {
    private INode root;

    @Override
    public void setRoot(INode node) {
        root = node;
    }

    @Override
    public String preorderTraversal() {
        StringBuilder sb = new StringBuilder();
        printNode(root, sb);
        return sb.substring(0, sb.length() - 2);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("root : " + root.getValue());
        printNode(root, 0);
        return sb.toString();
    }


    void printNode(INode node, int depth) {
        if (node != null && !node.getChild().isEmpty()) {
            for (INode child : node.getChild()) {
                System.out.print("depth : " + depth + " " + child.getValue() + "\n");
                printNode(child, depth + 1);
            }
        }
        if (depth == 1) {
            System.out.println("-----------");
        }
    }

    void printNode(INode node, StringBuilder sb) {
        if (node != null)
            sb.append(node.getValue() + ", ");
        if (node != null && !node.getChild().isEmpty()) {
            for (INode child : node.getChild()) {
                printNode(child, sb);
            }
        }
    }
}
