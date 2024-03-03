public class Limas{
    public double panjangSisiAlas, tinggiLimas;

    public Limas(double psa, double tl) {
        panjangSisiAlas = psa;
        tinggiLimas = tl;
    }
    public double hitungLuasPermukaan() {
        double luasAlas = panjangSisiAlas*panjangSisiAlas;
        double luasSisiTegak = 0.5*panjangSisiAlas*tinggiLimas;
        return luasAlas + (4 *luasSisiTegak);
    }
    public double hitungVolume() {
        double luasAlas = panjangSisiAlas*panjangSisiAlas;
        return 0.33*luasAlas*tinggiLimas;
    }
}
