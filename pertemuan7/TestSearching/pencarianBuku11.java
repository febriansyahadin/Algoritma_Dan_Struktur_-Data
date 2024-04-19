package pertemuan7.TestSearching;

public class pencarianBuku11 {
    Buku11[] listBk = new Buku11[5];
    int idx;

    void tambah(Buku11 m) {
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (Buku11 m : listBk) {
            m.tampilDataBuku();
        }
    }

    public int findSeqSearch(String cari) {
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j] != null && listBk[j].kodeBuku.equals(cari)) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void tampilPosisi(String x, int pos) {
        if (pos != -1) {
            System.out.println("Data : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    public void tampilData(String x, int pos) {
        if (pos != -1) {
            System.out.println("Kode Buku\t : " + x);
            System.out.println("Judul\t : " + listBk[pos].judulBuku);
            System.out.println("Tahun terbit\t : " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang\t : " + listBk[pos].pengarang);
            System.out.println("Stock\t : " + listBk[pos].stock);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    public Buku11 FindBuku(String cari) {
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j] != null && listBk[j].kodeBuku == cari) {
                posisi = j;
                break;
            }
        }
        if (posisi != -1) {
            return listBk[posisi];
        } else {
            return null;
        }
    }

    public int FindBinarySearch(String cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (right + left) / 2;
            if (cari == listBk[mid].kodeBuku) {
                return (mid);
            } else if (cari.compareTo(listBk[mid].kodeBuku) > 0) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    public int findSeqSearchJudul(String cari) {
        int posisi = -1;
        int jumlahHasil = 0;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j] != null && listBk[j].judulBuku.equals(cari)) {
                posisi = j;
                jumlahHasil++;
            }
        }
        if (jumlahHasil > 1) {
            System.out.println("Peringatan: Terdapat lebih dari satu hasil pencarian untuk judul buku \"" + cari + "\"");
        }
        return posisi;
    }

    public int findBinarySearchJudul(String cari, int left, int right) {
        int mid;
        int jumlahHasil = 0;
        if (right >= left) {
            mid = (right + left) / 2;
            if (cari.equals(listBk[mid].judulBuku)) {
                jumlahHasil++;
                if (jumlahHasil > 1) {
                    System.out.println("Peringatan: Terdapat lebih dari satu hasil pencarian untuk judul buku \"" + cari + "\"");
                }
                return mid;
            } else if (cari.compareTo(listBk[mid].judulBuku) > 0) {
                return findBinarySearchJudul(cari, mid + 1, right);
            } else {
                return findBinarySearchJudul(cari, left, mid - 1);
            }
        }
        return -1;
    }

    public void sortBuku() {
        Buku11 temp;
        for (int i = 0; i < listBk.length - 1; i++) {
            for (int j = 0; j < listBk.length - 1 - i; j++) {
                if (listBk[j].judulBuku.compareToIgnoreCase(listBk[j + 1].judulBuku) > 0) {
                    temp = listBk[j];
                    listBk[j] = listBk[j + 1];
                    listBk[j + 1] = temp;
                }
            }
        }
    }
}