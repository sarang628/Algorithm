package tree;

import java.util.ArrayList;
import java.util.List;

public class IntNode implements INode {
    private final int value;
    private List<INode> children = new ArrayList();

    IntNode(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public List<INode> getChild() {
        return children;
    }

    @Override
    public void addNode(INode node) {
        children.add(node);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
