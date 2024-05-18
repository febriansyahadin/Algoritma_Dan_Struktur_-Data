package pertemuan13.Tugas.tugas1;

import java.util.Scanner;
public class DoubleLLMain {
    public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);
    DoubleLL dll = new DoubleLL();
    int pilih;

    do {
        menu();
        pilih = sc.nextInt();
        switch (pilih) {
            case 1:
                System.out.println("-----------------------------");
                System.out.println("Masukkan Data Penerima Vaksin");
                System.out.println("-----------------------------");
                System.out.println("Nomer Antrian : ");
                int nomer = sc.nextInt();
                sc.nextLine();
                System.out.println("Nama Penerima : ");
                String nama = sc.nextLine();
                dll.add(nomer, nama);
                break;
            case 2:
                dll.remove();
                dll.print();
                break;
            case 3:
                dll.print();
                break;
            case 4:
                System.exit(4);
                break;
                default:
                System.out.println("Pilihan yang anda masukkan salah!");
                break;
        }
    } while (true);
}
    public static void menu() {
        System.out.println("\n++++++++++++++++++++++++++++++");
        System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
        System.out.println("++++++++++++++++++++++++++++++\n");
        System.out.println("1. Tambah Data Penerima Vaksin");
        System.out.println("2. Hapus Data Pengantri Vaksin");
        System.out.println("3. Daftar Penerima Vaksin");
        System.out.println("4. Keluar");
        System.out.println("++++++++++++++++++++++++++++++");
    }

}