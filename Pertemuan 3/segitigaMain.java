public class segitigaMain{
public static void main(String[] args) {
    Segitiga[] ppArray = new Segitiga[4];
    ppArray[0] = new Segitiga(10, 4);
    ppArray[1] = new Segitiga(20, 10);
    ppArray[2] = new Segitiga(15, 6);
    ppArray[3] = new Segitiga(25, 10);

    for(int i = 0; i < ppArray.length; i++){
        System.out.println("Segitiga ke-" + i);
        System.out.println("Luas Segitiga: " + ppArray[i].hitungLuas() );
        System.out.println("Keliling Segitiga : " + ppArray[i].hitungKeliling());
        System.out.println();
    }
}
}
