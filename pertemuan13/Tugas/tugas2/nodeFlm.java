package pertemuan13.Tugas.tugas2;

/**
 * node
 */
public class nodeFlm {

    int id;
    String judul;
    double rating;
    nodeFlm prev, next;

    public nodeFlm(nodeFlm prev, int id, String judul, double rating, nodeFlm next) {
        this.prev = prev;
        this.id = id;
        this.judul = judul;
        this.rating = rating;
        this.next = next;
    }
}