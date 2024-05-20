    package Quis2;

    public class dllVoli {
        node head;
        int size;
        
        dllVoli(){
            head = null;
            size = 0;
        }
        
        public boolean isEmpty(){
            return head == null;
        }
        public void add(teamVoli item){
            if (isEmpty()) {
                head = new node(null, item, null);
                size++;
            } else {
                node current = head;
                while (current.next != null) {
                    current = current.next;
                } 
                node newNode = new node(current, item, null);
                current.next = newNode;
                size++;
            }
        }
        public void remove(int index) throws Exception {
            if (isEmpty() || index > size) {
                throw new Exception("Nilai indeks di luar batas");
            } else if (index == 1) {
                head = head.next;
                head.prev = null;
                size--;
            } else {
                node current = head;
                int i = 1;
                while(i < index) {
                    current = current.next;
                    i++;
                }
                System.out.println(current.data.nama + " pada rank ke-" + index + " telah dihapus.\n");
                if (current.next == null) {
                    current.prev.next = null;
                } else if (current.prev == null) {
                    current = current.next;
                    current.prev = null;
                    head = current;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                size--;
            }
        }
        public void print() {
            if (isEmpty()) {
                System.out.println("Daftar tim masih kosong.");
            } else {
                sort();
                node current = head;
                int rank = 1;
                System.out.println("===================================================================================");
                System.out.println("=================== Klasemen ProLiga Voli Indonesia ===============================");
                System.out.println("===================================================================================");
                System.out.printf("| %-4s | %-35s | %-6s | %-6s | %-6s | %-6s  |%n", "Rank", "Team Name", "Match", "Win", "Lose", "Point");
                System.out.println("==================================================================================|");
                while (current != null) {
                    System.out.printf("| %-4d | %-35s | %-6d | %-6d | %-6d | %-6d  |%n", rank, current.data.nama, current.data.match, current.data.win, current.data.lose, current.data.point);
                    current = current.next;
                    rank++;
                }
                System.out.println("===================================================================================");
            }
        }
        public void searchByname(String nama) {
            if (isEmpty()) {
                System.out.println("Linked list kosong");
                return;
            }
        
            node current = head;
            boolean found = false;
            System.out.println("=============================================================================");
            System.out.println("===================== Hasil Pencarian Tim ===================================");
            System.out.println("=============================================================================");
            System.out.printf("| %-4s | %-30s | %-6s | %-6s | %-6s | %-6s  |%n", "Rank", "Team Name", "Match", "Win", "Lose", "Point");
            System.out.println("=============================================================================");
        
            int rank = 1;
            while (current != null) {
                if (current.data.nama.equalsIgnoreCase(nama)) {
                    System.out.printf("| %-4d | %-30s | %-6d | %-6d |  %-6d | %-6d |%n", rank, current.data.nama, current.data.match, current.data.win, current.data.lose, current.data.point);
                    found = true;
                }
                current = current.next;
                rank++;
            }
        
            if (!found) {
                System.out.println("Tim dengan nama " + nama + " tidak ditemukan dalam linked list");
            }
            System.out.println("==============================================================================");
        }
        private void sort() {
            if (size > 1) {
                boolean posisi;
    
                do {
                    node current = head;
                    node previous = null;
                    node next = head.next;
                    posisi = false;
    
                    while (next != null) {
                        if (current.data.point < next.data.point) {
                            posisi = true;
    
                            if (previous != null) {
                                node sig = next.next;
    
                                previous.next = next;
                                next.next = current;
                                current.next = sig;
                            } else {
                                node sig = next.next;
    
                                head = next;
                                next.next = current;
                                current.next = sig;
                            }
    
                            previous = next;
                            next = current.next;
                        } else {
                            previous = current;
                            current = next;
                            next = next.next;
                        }
                    }
                } while (posisi);
            }
        }
    }
    