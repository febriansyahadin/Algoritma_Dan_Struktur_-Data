package jobsheet6.bubbleSelectioInsertion;

import java.util.Scanner;

public class MainHotel {
    public static void main(String[] args) {
        HotelService list = new HotelService();
        Hotel h1 = new Hotel("Hillside Hotel", "semarang", 5000000, (byte)5);
        Hotel h2 = new Hotel("Raffles Hotel", "jakarta", 3000000, (byte)3);
        Hotel h3 = new Hotel("Park Hyatt Hotel", "malang", 1000000,(byte)1);
        Hotel h4 = new Hotel("Borobudur Hotel", "bandung", 2000000, (byte)2);
        Hotel h5 = new Hotel("Royal city Hotel", "bali", 4000000, (byte)4);

        list.tambah(h1);
        list.tambah(h2);
        list.tambah(h3);
        list.tambah(h4);
        list.tambah(h5);

        System.out.println("Daftar hotel setelah disorting = ");
        list.tampilAll();

        System.out.println("Data hotel setelah sorting desc berdasarkan bintang");
        list.bubbleSort();
        list.tampilAll();

        System.out.println("Data hotel setelah sorting asc berdasarkan bintang");
        list.selectionSort();
        list.tampilAll();
    }
}