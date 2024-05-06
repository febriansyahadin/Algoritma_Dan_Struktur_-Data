package pertemuan11;

public class SingleLinkedList {
    Node head, tail;

    boolean isEmpty(){
        return head == null;
    }


    void print() {
    if (isEmpty()) {
        System.out.println("Linked List Kosong");
    } else {
        Node tmp = head;
        System.out.print("Isi Linked List:\t");
        while (tmp != null) {
            System.out.print(tmp.data + "\t");
            tmp = tmp.next;
        }
        System.out.println();
    }
}

    void addFirst(int input) {
        Node ndInput = new Node(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }
    void addLast(int input){
        Node ndiInput = new Node(input, null);
        if (isEmpty()) {
            head = ndiInput;
            tail = ndiInput;
        } else {
           tail.next = ndiInput;
            tail = ndiInput;
        }
    }
    void insertAfter(int key, int input) {
        Node ndInput = new Node(input, null);
        Node temp  = head;
        do {
            if (temp.data == key) {
                ndInput.next= temp.next;
                temp.next = ndInput;
                if (ndInput.next ==null) {
                    tail = ndInput;
                    break;
                }
            }
            temp = temp.next;
        } while (temp != null);
    }
    void insertAt(int index, int input) {
        if (index < 0) {
            System.out.println("indek salah");
        } else if(index == 0) {
            addFirst(input);
        } else {
            Node temp = head;
            for (int i = 0; i < index -1; i++) {
                temp = temp.next;
            }
            temp.next = new Node(input, temp.next);
            if(temp.next.next==null){
                tail = temp.next;
            }
        }
    }
}
