package pertemuan14.percobaan1;

public class Node11 {
    int data;
    Node11 left;
    Node11 right;

    public Node11(){

    }
    Node11(int data) {
        this.left = null;
        this.data = data;
        this.right = null;
    }
    public Node11 addRecursive(Node11 current, int data) {
        if (current == null) {
            return new Node11(data);
        }
    
        if (data < current.data) {
            current.left = addRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = addRecursive(current.right, data);
        } else {
            return current;
        }
    
        return current;
    }
    
}
