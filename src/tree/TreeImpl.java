package tree;

public class TreeImpl implements ITree {
    private INode root;

    @Override
    public void setRoot(INode node) {
        root = node;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append(root);

        for (INode node : root.getChild()) {
            sb.append(" ");
            sb.append(node.getValue());
        }
        return sb.toString();
    }
}
