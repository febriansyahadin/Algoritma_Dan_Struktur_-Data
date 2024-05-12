package pertemuan11.tugas.tugas2;

import java.util.Scanner;

public class SllMain {
    public static void main(String[] args) {
        SllQueue queue = new SllQueue();
        Scanner scanner = new Scanner(System.in);
        int pilih;
        String nim, nama;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Masukkan Diri Anda");
            System.out.println("2. Keluarkan dari Antrian");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Cetak Antrian");
            System.out.println("5. Kosongkan Antrian");
            System.out.println("6. Exit");
            System.out.print("Masukkan pilihan Anda: ");
            pilih = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan NIM Anda: ");
                    nim = scanner.nextLine();
                    System.out.print("Masukkan Nama Anda: ");
                    nama = scanner.nextLine();
                    queue.enqueue(nim, nama);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.display();
                    break;
                case 4:
                    queue.print();
                    break;
                case 5:
                    queue.clear();
                    break;
                case 6:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 6);
    }
}