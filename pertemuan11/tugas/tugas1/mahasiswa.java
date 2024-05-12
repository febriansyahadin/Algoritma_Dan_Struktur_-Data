package pertemuan11.tugas.tugas1;

public class mahasiswa {
    int nim;
    String nama;
    mahasiswa next;

    public mahasiswa(int nim, String nama, mahasiswa next) {
        this.nim = nim;
        this.nama = nama;
        this.next = next;
    }
}
