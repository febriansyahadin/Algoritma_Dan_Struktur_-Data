public class Bola {
    double jarijari;
    double phi = 3.14;

    public Bola(double jj) {
        jarijari = jj;
    }
    public double hitungLuasPermukaan() {
        return 4*Math.PI*jarijari*jarijari;
    }
    public double hitungVolume() {
        return 1.33*Math.PI*jarijari*jarijari*jarijari;
    }
}