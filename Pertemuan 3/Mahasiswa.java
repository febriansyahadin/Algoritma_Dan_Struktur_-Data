import java.util.Scanner;

class Mahasiswa {
    String nama;
    String nim;
    String jenisKelamin;
    double ipk;
    
    public Mahasiswa(String nama, String nim, String jenisKelamin, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
        this.ipk = ipk;
    }
    
    public void identitas() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("IPK: " + ipk);
        System.out.println();
    }
    public double getIPK(){
        return ipk;
    }
}

