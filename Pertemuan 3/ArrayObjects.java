import java.util.Scanner;
/**
 * persegipanjang
 */
class PersegiPanjang {
public int panjang;
public int lebar;
    
}
public class ArrayObjects {
    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah persegi panjang : ");
        int jmlPersegi = sc.nextInt();

        PersegiPanjang[] ppArray = new PersegiPanjang[jmlPersegi];

        for (int i = 0; i < jmlPersegi; i++) {
            
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi Panjang ke-" + i);
            System.out.print("Masukkan Panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = sc.nextInt();
        }
        for (int i = 0; i < jmlPersegi; i++) {
        
        System.out.println("PersegiPanjang ke-" + i);
        System.out.println("Panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
      }
    }
}
