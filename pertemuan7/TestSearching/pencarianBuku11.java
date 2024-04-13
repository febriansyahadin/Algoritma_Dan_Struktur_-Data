package pertemuan7.TestSearching;

public class pencarianBuku11 {
    Buku11[] listBk = new Buku11[5];
    int idx;

    void tambah(Buku11 m){
        if (idx < listBk.length){
            listBk[idx] = m;
            idx++;
        }else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil(){
        for (Buku11 m : listBk){
            m.tampilDataBuku();
        }
    }

    public int findSeqSearch(int cari) {
        int posisi = -1;
        for(int j=0; j< listBk.length; j++){
            if (listBk[j] != null && listBk[j].kodeBuku==cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void tampilPosisi(int x, int pos){
        if (pos!= -1){
            System.out.println("Data : " + x + " ditemukan pada indeks " + pos);
        }else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    public void tampilData(int x, int pos){
        if (pos!= -1){
            System.out.println("Kode Buku\t : " + x);
            System.out.println("Judul\t : "+listBk[pos].judulBuku);
            System.out.println("Tahun terbit\t : "+listBk[pos].tahunTerbit);
            System.out.println("Pengarang\t : "+listBk[pos].pengarang);
            System.out.println("Stock\t : "+listBk[pos].stock);
        }else{
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    public int FindBinarySearch(int cari, int left, int right){
        int mid;
        if(right >= left){
            mid = (right + left) / 2;
            if (cari == listBk[mid].kodeBuku) {
                return (mid);
            }else if (cari < listBk[mid].kodeBuku) {
                return FindBinarySearch(cari, left, mid - 1);
            }else{
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
}