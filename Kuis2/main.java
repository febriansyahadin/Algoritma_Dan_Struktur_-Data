package Kuis2;
import java.util.Scanner;


public class main {
    public static void menu() {
        System.out.println("|-------------------------------|");
        System.out.println("|========== Menu Utama =========|");
        System.out.println("|===============================|");
        System.out.println("| 1. Tampilkan Klasemen         |");
        System.out.println("| 2. Tambah Data & Tim Voli     |");
        System.out.println("| 3. Hapus Data Tim Voli        |");
        System.out.println("| 4. Cari Data tim voli         |");
        System.out.println("| 5. Keluar                     |");
        System.out.println("=================================");
        System.out.print("Masukkan pilihan Anda: ");
    }

    public static teamVoli inputTim() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama tim: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan jumlah pertandingan: ");
        int match = sc.nextInt();
        System.out.print("Masukkan jumlah kemenangan (skor 3): ");
        int win = sc.nextInt();
        System.out.print("Masukkan jumlah kekalahan (skor 1): ");
        int lose = sc.nextInt();
        match = win + lose;
        int point = (win * 3) + (lose * 0);
        return new teamVoli(nama, match, win, lose, point);
    }
    public static int inputRank() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan rank tim: ");
        int rank = sc.nextInt();
        return rank;
    }

    public static String inputNama() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama tim yang dicari: ");
        String nama = sc.nextLine();
        return nama;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        dllVoli dll = new dllVoli();

        
        dll.add(new teamVoli("JAKARTA STIN BIN", 6, 5, 1, 15));
        dll.add(new teamVoli("PALEMBANG BANK SUMSEL BABEL", 6, 4, 2, 12));
        dll.add(new teamVoli("JAKARTA LAVANI ALLOBANK ELECTRIC", 6, 5, 1, 15));
        dll.add(new teamVoli("JAKARTA BHAYANGKARA PRESISI", 6, 2, 4, 6));
        dll.add(new teamVoli("JAKARTA PERTAMINA PERTAMAX", 6, 3, 3, 9));
        dll.add(new teamVoli("KUDUS SUKUN BADAK", 6, 1, 5, 3));
        dll.add(new teamVoli("JAKARTA GARUDA JAYA", 6, 0, 0, 0));

        int pilihan;
        do {
            menu();
            pilihan = sc.nextInt();
            switch (pilihan) {
                case 1:
                    dll.print();
                    break;
                case 2:
                    dll.add(inputTim());
                    break;
                case 3:
                    dll.remove(inputRank());
                    break;
                case 4:
                    dll.searchByname(inputNama());
                    break;
                case 5:
                    System.out.println("Terima kasih Telah Menggunakan program ini!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silahkan coba lagi!");
            }
        } while (pilihan != 5);
    }
}