package pertemuan13.Tugas.tugas1;

public class DoubleLL {
    Node head;
    int size;

    public DoubleLL() {
        head = null;
        size = 0;
    }
    
    public boolean isEmpty() {
        return head == null;
    }
    public void add(int nomer, String nama) throws Exception {
        if (isEmpty()) {
            head = new Node(null, nama, nomer, null);
            size++;
        } else {
            Node current = head;
            while (current.next!= null) {
                current = current.next;
            }
            Node newNode = new Node(current, nama, nomer, null);
            current.next = newNode;
            newNode.prev = current;
            size++;
        }
    }

    public void remove() throws Exception{
        if (isEmpty()) {
            throw new Exception("Antrian kosong");
        }else if (head.next == null) {
            System.out.println(head.nama + " sudah divaksinasi");
            head = null;
            size--;
        }else{
            Node current = head;
            System.out.println(current.nama + " sudah divaksinasi");
            current = current.next;
            current.prev = null;
            head = current;
            size--;
        }

}

    public void print(){
        if (!isEmpty()) {
            Node current = head;
            System.out.println("|" + "No." + "\t | " + "Nama" +  "\t |" );
            while (current != null) {
                System.out.println("|" + current.nomer + "\t | " + current.nama + " |" );
                current = current.next;
            }
            System.out.println("sisa antrian : " + size);
        }else{
            System.out.println("Linked list kosong");
        }
    }
    
}