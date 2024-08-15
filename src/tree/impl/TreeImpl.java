package tree.impl;

import tree.interfaces.INode;
import tree.interfaces.ITree;

public class TreeImpl<T> implements ITree {
    private INode<T> root;

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
    public String inorderTraversal() {
        StringBuilder sb = new StringBuilder();
        printNode(root, sb);
        return sb.toString();
    }

    @Override
    public int depth(INode node) {
        //System.out.println("search:" + node.getValue());
        return search(node, root, 0);
    }

    private int search(INode node, INode<T> search, int depth) {
        int result = -1;
        if (node.getValue() == search.getValue()) {
            //System.out.println("match: " + node.getValue() + ", depth: " + depth);
            return depth;
        }

        if (!search.getChild().isEmpty()) {
            for (INode<T> child : search.getChild()) {
                //System.out.println("child: " + child.getValue());
                result = search(node, child, depth + 1);
                if (result != -1) {
                    return result;
                }
            }
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("root : " + root.getValue());
        printNode(root, 0);
        return sb.toString();
    }


    void printNode(INode<T> node, int depth) {
        if (node != null && !node.getChild().isEmpty()) {
            for (INode<T> child : node.getChild()) {
                System.out.print("depth : " + depth + " " + child.getValue() + "\n");
                printNode(child, depth + 1);
            }
        }
        if (depth == 1) {
            System.out.println("-----------");
        }
    }

    void printNode(INode<T> node, StringBuilder sb) {
        if (node != null)
            sb.append(node.getValue() + ", ");
        if (node != null && !node.getChild().isEmpty()) {
            for (INode<T> child : node.getChild()) {
                printNode(child, sb);
            }
        }
    }
}
