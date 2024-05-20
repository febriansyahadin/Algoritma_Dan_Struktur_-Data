package Kuis2;

/**
 * teamVoli
 */
public class teamVoli {

    String nama;
    int match;
    int win;
    int lose;
    int point;

    public teamVoli(String nama, int match, int win, int lose, int point) {
        this.nama = nama;
        this.match = match;
        this.win = win;
        this.lose = lose;
        this.point =  (win * 3) + (lose * 0);
    }
}