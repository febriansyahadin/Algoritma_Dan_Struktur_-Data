import java.util.Scanner;
public class Buku11 {

    String judul, pengarang;
    int halaman, stok, harga, jml;

        void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp " + harga);
    }

    void terjual(int jml) {
        if (stok > 0) {
        stok -= jml;
        if (stok < 0) {
            stok = 0;
        }
        System.out.println(jml + " Buku telah terjual ");
    } else {
        System.out.println("Maaf, stok sudah habis");
        }
        
    }

    void restock(int jml) {
        stok+= jml;
    }

    void gantiharga(int hrg) {
        harga= hrg;
    }

    Buku11(){
        
    }

    public Buku11(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }
    int hitungHargaTotal() {
        return jml * harga;
    }

    int hitungDiskon() {
        if(hitungHargaTotal() >= 150000) {
            return hitungHargaTotal() * 12/100;
        } else if(hitungHargaTotal() >= 75000 || hitungHargaTotal() < 150000) {
            return hitungHargaTotal() * 5/100;
        } else {
            return 0;
        }
    }

    int hitungHargaBayar() {
        return hitungHargaTotal() - hitungDiskon();
    }

}