package tree.reference.interfaces.impl.tree;

import tree.reference.interfaces.IMultiNode;

public class Depth<T> {

    public int depth(IMultiNode<T> root, IMultiNode<T> node) {
        //System.out.println("search:" + node.getValue());
        return search(node, root, 0);
    }

    private int search(IMultiNode node, IMultiNode<T> search, int depth) {
        int result = -1;
        if (node.getValue() == search.getValue()) {
            //System.out.println("match: " + node.getValue() + ", depth: " + depth);
            return depth;
        }

        if (!search.getChild().isEmpty()) {
            for (IMultiNode<T> child : search.getChild()) {
                //System.out.println("child: " + child.getValue());
                result = search(node, child, depth + 1);
                if (result != -1) {
                    return result;
                }
            }
        }
        return result;
    }
}
