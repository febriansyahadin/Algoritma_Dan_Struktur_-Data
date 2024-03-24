package pertemuan5.BruteForceDivideConquer;
import java.util.Scanner;
class MainFaktorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("_______________________");
        System.out.println("Masukkan jumlah elemen: ");
        int iJml = sc.nextInt();

        Faktorial[] fk = new Faktorial[10];
        for(int i=0; i< iJml; i++){
            fk[i] = new Faktorial();
            System.out.println("Masukkan nilai data ke-" +(i+1)+":");
            fk[i].nilai = sc.nextInt();
            }

            System.out.println("HASIL - BRUTE FORCE");
            for(int i=0; i < iJml; i++){
                System.out.println("Hasil perhitungan faktorial menggunakan Brute Force adalah " + fk[i].faktorialBF(fk[i].nilai));
            }
            System.out.println("HASIL - DEVIDE AND CONQUER");
            for(int i=0; i< iJml; i++) {
                System.out.println("Hasil penghitungan menggunkan Devide and Conquer adalah " + fk[i].faktorialDC(fk[i].nilai));
                
            }
    }
}