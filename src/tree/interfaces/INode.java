package tree.interfaces;

import java.util.List;

public interface INode<T> {
    T getValue();

    List<INode<T>> getChild();

    void addNode(INode<T> node);
}
