package jobsheet5.BruteForceDivideConquer;
import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("============================================================");
        System.out.print("Masukkan jumlah perusahaan: ");
        int pt = sc.nextInt();

        Sum[] sm = new Sum[pt];
        
        for (int i = 0; i < pt; i++) {
            System.out.println("============================================================");
            System.out.println("Program menghitung keuntungan total (Satuan juta. Misal 5.9)");
            System.out.print("Masukkan jumlah bulan : ");
            int elm = sc.nextInt();

            sm[i] = new Sum(elm);
            System.out.println("============================================================");
            for (int j = 0; j < elm; j++) {
                System.out.print("Masukkan keuntungan perusahaan bulan ke-" + (j + 1) + " = ");
                sm[i].keuntungan[j] = sc.nextDouble();
            }
        }
        
        System.out.println("====================================================");
        System.out.println("Algoritma Brute Force");
        for (int i = 0; i < pt; i++) {
            System.out.println("Total keuntungan perusahaan selama " + sm[i].elemen + " bulan adalah = " + sm[i].totalBF(sm[i].keuntungan));
        }
        System.out.println("====================================================");
        System.out.println("Algoritma Devide Conquer");
        for (int i = 0; i < pt; i++) {
            System.out.println("Total keuntungan perusahaan selama " + sm[i].elemen + " bulan adalah = " + sm[i].totalDC(sm[i].keuntungan, 0, sm[i].elemen - 1));
        }

        sc.close();
    }
}
