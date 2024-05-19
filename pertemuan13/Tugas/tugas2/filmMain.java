package pertemuan13.Tugas.tugas2;

import java.util.Scanner;

public class filmMain {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        DllFilm dllFilm = new DllFilm();
        int pilih, id, index;
        String judul;
        double rating;

        do {
            System.out.println("=========================");
            System.out.println("DATA FILM LAYAR LEBAR");
            System.out.println("=========================");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data Index Tertentu");
            System.out.println("4. Hapus Data Pertama");
            System.out.println("5. Hapus Data Terakhir");
            System.out.println("6. Hapus Data Tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari ID Film");
            System.out.println("9. Urut Data Film -DESC");
            System.out.println("10. Keluar");
            System.out.println("Masukkan pilihan: ");
            pilih = scanner.nextInt();

        switch (pilih) {
            case 1:
                System.out.println("Masukkan Data Film Posisi Awal ");
                System.out.println("Masukkan ID Film : ");
                id = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Masukkan Judul Film : ");
                judul = scanner.nextLine();
                System.out.println("Masukkan Rating Film : ");
                rating = scanner.nextDouble();
                dllFilm.addFirst(id, judul, rating);
                break;
            case 2:
                System.out.println("Masukkan Data Film Posisi Akhir ");
                System.out.println("Masukkan ID Film : ");
                id = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Masukkan Judul Film : ");
                judul = scanner.nextLine();
                System.out.println("Masukkan Rating Film : ");
                rating = scanner.nextDouble();
                dllFilm.addLast(id, judul, rating);
                break;
            case 3:
                System.out.println("Masukkan Data Film Urutan ke- ");
                System.out.println("Masukkan ID Film : ");
                id = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Masukkan Judul Film : ");
                judul = scanner.nextLine();
                System.out.println("Masukkan Rating Film : ");
                rating = scanner.nextDouble();
                System.out.println("Data Film akan ditambahkan pada index : ");
                index = scanner.nextInt();
                dllFilm.add(id, judul, rating, index);
                System.out.println("Data film ini akan masuk di urutan ke-" + (index + 1));
                break;
            case 4:
                dllFilm.removeFist();
                System.out.println("Data pertama telah di hapus");
                break;
            case 5:
                dllFilm.removeLast();
                System.out.println("Data terakhir telah di hapus");
                break;
            case 6:
                System.out.println("Masukkan Index Film : ");
                index = scanner.nextInt();
                dllFilm.remove(index);
                System.out.println("Data pada index ke-" + (index + 1) + " telah di hapus" );
                break;
            case 7:
                dllFilm.print();
                break;
            case 8:
                System.out.println("Masukkan ID Film yang dicari : ");
                id = scanner.nextInt();
                nodeFlm hasil = dllFilm.searchID(id);
            if (hasil != null) {
                System.out.println("ID Film: " + hasil.id);   
                System.out.println("Judul Film: " + hasil.judul);
                System.out.println("Rating Film: " + hasil.rating);
            } else {
                System.out.println("Data ID " + id + " tidak ditemukan");
            }
                break;
            case 9:
                dllFilm.sortDesbyRating();
                System.out.println("Data film telah diurutkan berdasarkan rating secara Descending");
                dllFilm.print();
                break;
            case 10:
                System.out.println("Kelur dari program");
                break;
                default:
                System.out.println("Pilihan tidak valid");
            }
            System.out.println();
        } while (pilih != 10);
        scanner.close();
    }
}
