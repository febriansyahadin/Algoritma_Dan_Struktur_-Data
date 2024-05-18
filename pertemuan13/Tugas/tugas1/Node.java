package pertemuan13.Tugas.tugas1;

public class Node {
    String nama;
    int nomer;
    Node next, prev;  

    public Node(Node prev, String nama, int nomer, Node next) {
        this.prev = prev;
        this.nama = nama;
        this.nomer = nomer;
        this.next = next;
    }
    public Node(){

    }
}