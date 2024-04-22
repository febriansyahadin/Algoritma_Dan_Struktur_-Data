package UTS;

public class uts11 {
    public static void main(String[] args) {
    int[] data = {44,19,5,32,40,42,23,42,27,7,44,39,10,45,2,19,3};
    
    System.out.print("Data Awal: ");
    printArray(data);
    
    bubbleSort(data);
    System.out.print("\nSetelah sorting (Bubble Sort): ");
    printArray(data);
    
    int[] data2 = {44,19,5,32,40,42,23,42,27,7,44,39,10,45,2,19,3};
    
    selectionSort(data2);
    System.out.print("\nSetelah sorting (Selection Sort): ");
    printArray(data2);

    }
     public static void bubbleSort(int[]arr ){
        int n = arr.length;
        for(int i =0; i < n-1; i++ ){
            for(int j =1; j<n-1; j++){
                if(arr[j] > arr[j+1]){

                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]= temp;
                }
            }
        }
    }
   public static void selectionSort(int[] arr){
    int n = arr.length;
    for (int i = 0; i < n-1; i++) {
        int minIndex = i;
        for (int j = i+1; j < n; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }
    
        int temp = arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = temp;
   }
}

    public static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
}
}
