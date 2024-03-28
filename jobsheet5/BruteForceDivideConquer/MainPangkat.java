package jobsheet5.BruteForceDivideConquer;
import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("=======================");
    System.out.println("Masukkan jumlah elemen yang dihitung: ");
    int element = sc.nextInt();
    
    Pangkat[] png = new Pangkat[element];

    for(int i=0; i< element; i++){
        System.out.println("Masukkan nilai yang hendak dipangkatkan: ");
        int angka = sc.nextInt();
        System.out.println("Masukkan nilai pemangkatan: ");
        int pangkat = sc.nextInt();
       png[i] = new Pangkat(angka, pangkat);
    }
    System.out.println("==========================");
    System.out.println("pilih metode pemangkatan");
    System.out.println("1.Brute Force");
    System.out.println("2.Divide and conquer");
    System.out.print("Masukkan pilihan anda: ");
    int pilihan = sc.nextInt();

    switch (pilihan) {
        case 1:
        System.out.println("HASIL PANGKAT - BRUTE FORCE");
        for(int i=0; i< element; i++){
            System.out.println("Hasil dari " + png[i].nilai+ " pangkat " + png[i].pangkat+ " adalah " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        }
        break;

    case 2:
         System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
        for(int i=0; i<element; i++){
            System.out.println("Hasil dari " + png[i].nilai+ " pangkat " + png[i].pangkat+ " adalah " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }
        break;
    }

    }
}