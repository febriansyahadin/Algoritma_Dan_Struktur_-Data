package pertemuan14.percobaan1;

/**
 * BinaryTree11
 */
public class BinaryTree11 {
    Node11 root;

    public BinaryTree11(){
        root = null;
    }
    boolean isEmpty(){
        return root == null;
    }
    
    void add(int data) {
        if (isEmpty()) {
            root = new Node11(data);
        } else {
            Node11 current = root;
            while (true) {
                if (data < current.data) {
                    if (current.left == null) {
                        current.left = new Node11(data);
                        break;
                    } else {
                        current = current.left;
                    }
                } else if (data > current.data) {
                    if (current.right == null) {
                        current.right = new Node11(data);
                        break;
                    } else {
                        current = current.right;
                    }
                } else {
                    // Data already exists
                    break;
                }
            }
        }
    }
    boolean find (int data){
        Node11 current = root;
        while (current != null) {
            if (current.data == data) {
                return true;
            } else if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return false;
    }
    void traversePreOrder(Node11 node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    void traversePostOrder(Node11 node) {
        if (node !=null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }
    void traverseInOrder(Node11 node){
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }
    Node11  getSuccessor(Node11 del) {
        Node11 successor = del.right;
        Node11 successorParent = del;
        while (successor.left!=null) {
            successorParent = successor;
            successor = successor.left;
        } 
        if (successor!=del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }
    void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }
        //find node (current) that will be deleted
        Node11 parent = root;
        Node11 current = root;
        boolean isLeftChild = false;
        while (current !=null) {
            if(current.data==data){
                break;
            } else if (data<current.data) {
                parent = current;
                current =current.left;
                isLeftChild = true;
            } else if (data>current.data) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        //deletion
        if (current==null) {
            System.out.println("Couldn't find data!");
            return;
        }else {
            //if there is no child, simply delete it
            if (current.left== null && current.right==null) {
                if (current==root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    }else {
                        parent.right = null;
                    }
                }
            } else if (current.left==null) {//if there is 1 child (right)
                if (current==root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right =current.right;
                    }
                }
            } else if (current.right==null) {//if there is 1 child (left)
                if (current==root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    }else {
                        parent.right = current.left;
                    }
                }
            }else{//if there are 2 children
                Node11 successor = getSuccessor(current);
                if (current==root) {
                    root =successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                    successor.left = current.left;
                }
            }
        }
    }
    public int findMin() {
        if (root == null) {
            throw new IllegalStateException("Tree is empty");
        }
        return findMinRecursive(root);
    }
    
    public int findMinRecursive(Node11 current) {
        return current.left == null ? current.data : findMinRecursive(current.left);
    }
    
    public int findMax() {
        if (root == null) {
            throw new IllegalStateException("Tree is empty");
        }
        return findMaxRecursive(root);
    }
    
    public int findMaxRecursive(Node11 current) {
        return current.right == null ? current.data : findMaxRecursive(current.right);
    }
    public void displayLeaves() {
        displayLeavesRecursive(root);
    }
    public void displayLeavesRecursive(Node11 node) {
        if (node != null) {
            if (node.left == null && node.right == null) {
                System.out.print(" " + node.data);
            }
            displayLeavesRecursive(node.left);
            displayLeavesRecursive(node.right);
        }
    }
    public int countLeaves() {
        return countLeavesRecursive(root);
    }
    
    public int countLeavesRecursive(Node11 node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }
        return countLeavesRecursive(node.left) + countLeavesRecursive(node.right);
    }    
}