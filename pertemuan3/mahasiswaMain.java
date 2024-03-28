import java.util.Scanner;

public class mahasiswaMain {
    public static void main(String[] args) {
        Scanner mhs = new Scanner(System.in);
        
        Mahasiswa[] daftarMahasiswa = new Mahasiswa[3]; 
        
        for (int i = 0; i < daftarMahasiswa.length; i++) {
            System.out.println("Masukkan informasi untuk Mahasiswa ke-" + (i + 1));
            System.out.print("Nama: ");
            String nama = mhs.nextLine();
            System.out.print("NIM: ");
            String nim = mhs.nextLine();
            System.out.print("Jenis Kelamin: ");
            String jenisKelamin = mhs.nextLine();
            System.out.print("IPK: ");
            double ipk = mhs.nextDouble();
            mhs.nextLine(); 
            
            daftarMahasiswa[i] = new Mahasiswa(nama, nim, jenisKelamin, ipk);
        }
        
        System.out.println("Daftar Mahasiswa:");
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            mahasiswa.identitas();
        }
        
        System.out.println("Rata-rata IPK: " + hitungRataRataIPK(daftarMahasiswa));
        
        Mahasiswa mahasiswaTerbaik = cariMahasiswaTerbaik(daftarMahasiswa);
        System.out.println("Mahasiswa dengan IPK terbaik:");
        mahasiswaTerbaik.identitas();
        
        mhs.close();
    }
    
    public static double hitungRataRataIPK(Mahasiswa[] mahasiswas) {
        double totalIPK = 0;
        for (Mahasiswa mahasiswa : mahasiswas) {
            totalIPK += mahasiswa.getIPK();
        }
        return totalIPK / mahasiswas.length;
    }
    
    public static Mahasiswa cariMahasiswaTerbaik(Mahasiswa[] mahasiswas) {
        Mahasiswa terbaik = mahasiswas[0];
        for (int i = 1; i < mahasiswas.length; i++) {
            if (mahasiswas[i].getIPK() > terbaik.getIPK()) {
                terbaik = mahasiswas[i];
            }
        }
        return terbaik;
    }
}
