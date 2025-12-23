package tree.practice;

public class BinarySearchTree {

    Node root = null;

    void addChild(int data) {
        if (root == null) {
            root = new Node(data);
        } else {
            Node n = root;

            while (n != null) {
                if (n.data > data) {
                    if (n.leftChild == null) {
                        n.leftChild = new Node(data);
                        break;
                    } else {
                        n = n.leftChild;
                    }
                } else if (n.data < data) {
                    if (n.rightChild == null) {
                        n.rightChild = new Node(data);
                        break;
                    } else {
                        n = n.rightChild;
                    }
                }
            }
        }
    }

    private void preOrderTraversal() {
        preOrderTraversal(root);
    }

    private void preOrderTraversal(Node n) {
        if (n == null)
            return;

        System.out.println(n.data);
        preOrderTraversal(n.leftChild);
        preOrderTraversal(n.rightChild);
    }


    static class Node {
        int data;
        Node leftChild;
        Node rightChild;

        public Node(int data) {
            this.data = data;
        }

        public void setLeftChild(Node leftChild) {
            this.leftChild = leftChild;
        }

        public void setRightChild(Node rightChild) {
            this.rightChild = rightChild;
        }

        public void setData(int data) {
            this.data = data;
        }
    }

    public static void main(String args[]) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.addChild(1);
        bst.addChild(5);
        bst.addChild(9);
        bst.addChild(11);
        bst.addChild(7);
        bst.addChild(3);

        bst.preOrderTraversal();
    }
}
