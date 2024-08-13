package tree;

import java.util.List;

public interface INode {
    int getValue();

    List<INode> getChild();

    void addNode(INode node);
}
