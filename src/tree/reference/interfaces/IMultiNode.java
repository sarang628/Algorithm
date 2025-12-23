package tree.reference.interfaces;

import java.util.List;

public interface IMultiNode<T> extends INode<T> {
    List<IMultiNode<T>> getChild();

    void addNode(IMultiNode<T> node);
}
