package pertemuan8;

public class stackKonversi11 {
    int size;
    int[] tumpukanBiner;
    int top;
    
    public stackKonversi11(){
        this.size = 32;
        tumpukanBiner = new int [size];
        top = -1;
    }
    public boolean isEmpety() {
        return top == -1;
    }
    public boolean isFull(){
        return top == size -1;
    }
    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack penuh");
        } else {
            top ++;
            tumpukanBiner[top] = data;
        }
    }
    public int pop(){
        if (isEmpety()) {
            System.out.println("Stack kososng");
            return -1;
        } else {
            int data = tumpukanBiner[top];
            top--;
            return data;
        }
    }
}