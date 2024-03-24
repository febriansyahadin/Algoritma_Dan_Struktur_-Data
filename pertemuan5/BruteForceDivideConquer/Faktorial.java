package pertemuan5.BruteForceDivideConquer;

/**
 * Faktorial
 */
public class Faktorial {

    public int nilai;

    int faktorialBF(int n) {
        int fakto = 1;
        for(int i=n; i > 0; i--){
            fakto *= i;
        }
        return fakto ;
  }
        int faktorialDC(int n) {
            if(n==1) {
                return 1;
            }
            else{
                int fakto = n * faktorialDC(n-1);
                return fakto;
            }
        }
}