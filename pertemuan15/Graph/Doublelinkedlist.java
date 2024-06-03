package pertemuan15.Graph;

public class Doublelinkedlist {
    
    Node11 head;
    int size;

    public Doublelinkedlist() {
        head  = null;
        size = 0;
    }
    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst(int item, int jarak) {
        if (isEmpty()) {
            head = new Node11(null, item, jarak, null);
        } else {
            Node11 newNode = new Node11(null, item, jarak, head);
            head.prev = newNode;
            head=newNode;
        }
        size++;
    }
    public int get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        Node11 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
    public int getjarak(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }   
        Node11 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.jarak;
    }
    public void remove(int index){
        Node11 current = head;
        while (current != null) {
            if (current.data == index) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                break;
            }
            current = current.next;
        }
        size--;
    }
    public int size() {
        return size;
    }
    public void clear() {
        head = null;
        size = 0;
    }
}
