package pertemuan8;

import java.util.Scanner;

public class Utama11 {
    public static void main(String[] args) {
        Scanner scanint = new Scanner(System.in);
        Scanner scanstr = new Scanner(System.in);

        System.out.println("SELAMAT DATANG DI GUDANG");
        System.out.print("Masukkan kapasitas gudang : ");
        int kapasitas = scanint.nextInt();

        Gudang11 gudang = new Gudang11(7);
        System.out.println("Selamat datang di sistem gudang");
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1.  Tambah Barang");
            System.out.println("2.  Ambil barang");
            System.out.println("3.  Tampilkan tumpukan barang");
            System.out.println("4.  Lihat Barang teratas/terbawah");
            System.out.println("5.  Cari menggunakan nama/kode");

            System.out.print("Pilih operasi: ");
            int pilihan = scanint.nextInt();
            scanint.nextLine();   
            
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    int kode = scanint .nextInt();
                    System.out.print("Masukkan nama barang: ");
                    String nama = scanstr.nextLine();
                    System.out.print("Masukkan nama kategori: ");
                    String kategori = scanstr.nextLine();
                    Barang11 barangBaru = new Barang11(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru); 
                    break;
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.tampilkanBarang();
                    break;
                    case 4:
                    System.out.println("1.Lihat Barang teratas");
                    System.out.println("2.Lihat Barang terbawah");
                    System.out.println("Pilih operasi: ");
                    pilihan = scanint.nextInt();

                    switch (pilihan) {
                        case 1:
                            gudang.lihatBarangTeratas();
                            break;
                        case 2:
                            gudang.lihatBarangTerbawah();
                            break;
                    }
                    break;

                case 5:
                System.out.println("1.  Pencarian berdasarkan Nama ");  
                System.out.println("2.  Pencarian berdasarkan Kode ");  
                System.out.println("pilih operasi pencarian ");
                int cari = scanint.nextInt();

                switch (cari) {
                    case 1:
                        System.out.println("Masukkan nama barang yang dicari ");
                        String carinama = scanstr.nextLine();
                        gudang.cariNama(carinama, 0);

                        break;
                    case 2:
                        System.out.println("Masukkan kode barang yang dicari ");
                        int carikode = scanint.nextInt();
                        gudang.cariKode(carikode, 0);

                        break;
                }
                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi");
            }
        }
    }
}
