package pertemuan14.percobaan2;

public class BinaryTreeArrayMain11 {
    public static void main(String[] args) {
        
    
    BinaryTreeArray11 bta = new BinaryTreeArray11();
    int data[] = {6,4,8,3,5,7,9,0,0,0};
    int idxLast = 6;
    bta.populateData(data, idxLast);
    System.out.print("\ninOrder Traversal : ");
    bta.traverseInOrder(0);
    System.out.println("\n");
    }
}
