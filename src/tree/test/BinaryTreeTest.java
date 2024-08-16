package tree.test;

import tree.impl.binary.BinaryNode;
import tree.interfaces.IBinarySearchTree;

public class BinaryTreeTest {
    public static void test(IBinarySearchTree<String> binarySearchTree) {
        //BinaryNode<Integer> node = new BinaryNode<>(1);

        BinaryNode<String> node1 = new BinaryNode<>("/");

        node1.setLeftChild(new BinaryNode<>("+"));
        node1.setRightChild(new BinaryNode<>("-"));

        node1.getLeftChild().setLeftChild(new BinaryNode<>("1"));
        node1.getLeftChild().setRightChild(new BinaryNode<>("2"));

        node1.getRightChild().setLeftChild(new BinaryNode<>("3"));
        node1.getRightChild().setRightChild(new BinaryNode<>("4"));

        binarySearchTree.setRoot(node1);

        System.out.println(binarySearchTree.preorderTraversal());
        System.out.println(binarySearchTree.inorderTraversal());
        System.out.println(binarySearchTree.postOrderTraversal());
    }
}
