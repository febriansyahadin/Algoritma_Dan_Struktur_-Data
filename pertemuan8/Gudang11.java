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
            System.out.println("Kode unik dalam biner " + konversiDesimalBiner(delete.kode));
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
            for (int i = 0; i >= top; i++){
                System.out.printf("Kode %d: %s (Kategori %s) \n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            } 
        } else {
            System.out.println("Tumpukan barang kosong");
        }
    }
    public String konversiDesimalBiner(int kode) {
        stackKonversi11 stack = new stackKonversi11();
        while (kode > 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }
        String biner = new String();
        while (!stack.isEmpety()) {
            biner +=stack.pop();
        }
        return biner;
    }
    public void lihatBarangTerbawah() {
        for(int i = 0; i < size; i++) {
            if(tumpukan[i] != null) {
                System.out.println("Barang terbawah : " + tumpukan[i].nama + "\n");
                break;
            } else {
                System.out.println("Tumpukan barang kosong.");
            }
        }
    }
    boolean cariNama(String nama, int mulai) {
        if(nama.equalsIgnoreCase(tumpukan[mulai].nama)) {
            System.out.println("Barang ditemukan.");
            return true;
        } else {
            return cariNama(nama, mulai+1);
        }
    }

    boolean cariKode(int kode, int mulai) {
        if(kode == tumpukan[mulai].kode) {
            System.out.println("Barang ditemukan.");
            return true;
        } else {
            return cariKode(kode, mulai+1);
        }
    }

}