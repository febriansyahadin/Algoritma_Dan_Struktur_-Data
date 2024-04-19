package pertemuan7.TestSearching;

public class Buku11 {
    String kodeBuku;
    int tahunTerbit;
    int stock;
    String judulBuku;
    String pengarang;

    public Buku11(String kodeBuku, String judulBuku, int tahunTerbit, String pengarang, int stock) {
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.pengarang = pengarang;
        this.stock = stock;
    }
    public void tampilDataBuku(){
        System.out.println("==============");
        System.out.println("Kode buku :"+kodeBuku);
        System.out.println("Judul buku :"+judulBuku);
        System.out.println("Tahun terbit :"+tahunTerbit);
        System.out.println("pengarang :"+pengarang);
        System.out.println("Stock :"+stock);
    }
    
}
