package pertemuan8;

import java.util.Scanner;
public class postfixMain11 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String p, Q;
    System.out.println("Masukkan ekspresi matematika (inflix): ");
    Q = sc.nextLine();
    Q = Q.trim();
    Q = Q + ")";

    int total = Q.length();
    postfix11 post = new postfix11(total);
    p = post.konversi(Q);
    System.out.println("posftix: " + p);
   } 
}
