package pertemuan7.TestSearching;

import java.util.Scanner;
public class BukuMain11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        pencarianBuku11 data = new pencarianBuku11();
        int jumBuku = 5;

        System.out.println("----------------------------");
        System.out.println("Masukkan data Buku secara urut dari KodeBuku Terkecil :");
        for(int i = 0; i < jumBuku; i++){
            System.out.println("-----------------");
            System.out.print("Kode Buku \t : ");
            int kodeBuku = s.nextInt();
            System.out.print("Judul buku \t : ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun Terbit \t : ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang \t : ");
            String pengarang = s1.nextLine();
            System.out.print("Stock \t\t : ");
            int stock = s.nextInt();

            Buku11 m = new Buku11(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }
        System.out.println("------------------------");
        System.out.println("Data keseluruhan Mahasiswa : ");
        System.out.println("-----------------------------");
        System.out.println("Data keseluruhan Buku : ");
        data.tampil();
        System.out.println("-----------------------------");
        System.out.println("---------------------------");
        System.out.println("Pencarian Data");
        System.out.println("Masukkan Kode Buku yang di cari");
        System.out.println("Kode Buku : ");
        int cari = s.nextInt();
        System.out.println("menggunakan sequential Search");
        int posisi = data.findSeqSearch(cari);
        
        data.tampilPosisi(cari, posisi);
        
        data.tampilData(cari, posisi);

        System.out.println("==================");
        System.out.println("menggunakan binary Search");
        posisi = data.FindBinarySearch(cari, 0, jumBuku -1);
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);
    }
}