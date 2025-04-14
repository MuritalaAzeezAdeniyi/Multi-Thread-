package bst;

public class BinarySearchTree {
    Node root;
    public BinarySearchTree() {
        root = null;
    }
    void insertValue(int data) {
        root = insertRec(root, data);
    }

    Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        }
        else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    boolean search(int key) {
        return searchRec(root, key);
    }

    boolean searchRec(Node root, int key) {
        if (root == null)
            return false;

        if (key == root.data)
            return true;

        return key < root.data
                ? searchRec(root.left, key)
                : searchRec(root.right, key);
    }

    void inorder() {
        inorderRec(root);
        System.out.println();
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }
}
