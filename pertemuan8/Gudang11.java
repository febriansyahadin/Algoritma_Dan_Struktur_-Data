package pertemuan8;

public class Gudang11 {
    Barang11[] tumpukan;
    int size;
    int top;

    public Gudang11(int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang11[size];
        top = -1;
    }
    public boolean cekKosong() {
        if (top == -1){
            return true;
        } else {
            return false;
        }
    }
    public boolean cekPenuh() {
        if (top == size -1 ){
            return true;
        } else {
            return false;
        }
    }
    public void tambahBarang(Barang11 brg) {
        if (!cekPenuh()){
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke Gudang");
        } else{
            System.out.println("Gagal! Tumpukan di gudang sudah penuh");
        }
    }
    public Barang11 ambilBarang() {
        if (!cekKosong()) {
            Barang11 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " ambil dari gudang");
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }
    public Barang11 lihatBarangTeratas() {
        if(!cekKosong()) {
            Barang11 barangTeratas = tumpukan[top];
            System.out.println("Barang Teratas: " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }
    public void tampilkanBarang(){
        if(!cekKosong()){
            System.out.println("Rincian tumpukan barang di gudang:");
            //for (int i = top; i >= 0; i--)
            for (int i =0; i<= top; i++){
                System.out.printf("Kode %d: %s (Kategori %s) \n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            } 
        } else {
            System.out.println("Tumpukan barang kosong");
        }
    }
}