package tree.impl;

import tree.interfaces.INode;

import java.util.ArrayList;
import java.util.List;

public class IntNodeImpl<T> implements INode<T> {
    private final T value;
    private List<INode<T>> children = new ArrayList();

    public IntNodeImpl(T value) {
        this.value = value;
    }

    @Override
    public T getValue() {
        return value;
    }

    @Override
    public List<INode<T>> getChild() {
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
