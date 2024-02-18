import java.util.Scanner;
public class pemilihan {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Double nilaiTugas, nilaiKuis, nilaiUts, nilaiUas, nilaiAkhir;
        String nilaiHuruf, ketLulus;

        System.out.println("Menghitung Nilai Akhir");
        System.out.println("=======================");

        System.out.print("Masukkan Nilai Tugas : ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan Nilai Kuis : ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Maukkan Nilai Uts : ");
        nilaiUts = sc.nextDouble();
        System.out.print("Masukkan Nilai Uas : ");
        nilaiUas = sc.nextDouble();

        if (nilaiTugas < 0 || nilaiTugas > 100 || nilaiKuis < 0 || nilaiKuis > 100 || nilaiUts < 0 || nilaiUts > 100 || nilaiUas < 0 || nilaiUas > 100) { 
        System.out.println("====================");
        System.out.println("Nilai Tidak Valid");
        System.out.println("====================");
        return;

        }
        nilaiAkhir = (0.2 * nilaiTugas) + (0.2 * nilaiKuis) + (0.3 * nilaiUts) + (0.4 * nilaiUas);

        if (nilaiAkhir > 80) {
            nilaiHuruf = "A";
            ketLulus = "SELAMAT ANDA LULUS";
        } else if (nilaiAkhir > 73) {
            nilaiHuruf = "B+";
            ketLulus = "SELAMAT ANDA LULUS";
        } else if (nilaiAkhir > 65) {
            nilaiHuruf = "B";
            ketLulus = "SELAMAT ANDA LULUS";
        } else if (nilaiAkhir > 60) {
            nilaiHuruf = "C+";
            ketLulus = "SELAMAT ANDA LULUS";
        } else if (nilaiAkhir > 50) {
            nilaiHuruf = "C";
            ketLulus = "SELAMAT ANDA LULUS";
        } else if (nilaiAkhir > 39) {
            nilaiHuruf = "D";
            ketLulus = "ANDA TIDAK LULUS";
        } else {
            nilaiHuruf = "E";
            ketLulus = "ANDA TIDAK LULUS";
        }

        System.out.println("==============");
        System.out.println("Nilai akhir : " + nilaiAkhir);
        System.out.println("Nilai huruf : " + nilaiHuruf);
        System.out.println("=================");
        System.out.println(ketLulus);



    }
}