package pertemuan11.tugas.tugas2;

public class SllQueue {
    node head, tail;

        SllQueue() {
        head = null;
        tail = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    void enqueue(String nim, String nama) {
        node newNode = new node(nim, nama);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        System.out.println(nama + " (NIM: " + nim + ") telah masuk ke dalam antrian.");
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println(head.nama + " (NIM: " + head.nim + ") telah keluar dari antrian.");
            head = head.next;
            if (head == null) {
                tail = null;
            }
        }
    }

    void display() {
        node current = head;
        if (current == null) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Antrian saat ini:");
            while (current != null) {
                System.out.println("NIM: " + current.nim + ", Nama: " + current.nama);
                current = current.next;
            }
        }
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            node current = head;
            while (current != null) {
                System.out.print(current.nim + " " + current.nama + " | ");
                current = current.next;
            }
            System.out.println();
        }
    }

    void clear() {
        head = null;
        tail = null;
        System.out.println("Antrian berhasil dikosongkan.");
    }
}