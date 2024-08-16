package tree.impl.tree;

import tree.interfaces.IMultiNode;

import java.util.ArrayList;
import java.util.List;

public class IntNodeImpl<T> implements IMultiNode<T> {
    private final T value;
    private List<IMultiNode<T>> children = new ArrayList();

    public IntNodeImpl(T value) {
        this.value = value;
    }

    @Override
    public T getValue() {
        return value;
    }

    @Override
    public List<IMultiNode<T>> getChild() {
        return children;
    }

    @Override
    public void addNode(IMultiNode node) {
        children.add(node);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
