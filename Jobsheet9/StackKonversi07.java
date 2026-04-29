package Jobsheet9;

public class StackKonversi07 {
    int[] tumpukanBiner07;
    int size;
    int top;

    public StackKonversi07(){
        this.size = 32; //asumsi 32 bit
        tumpukanBiner07 = new int[size];
        top = -1;

    }
    public boolean isEmpty(){
        return top == -1;

    }

    public boolean isFull() {
        return top == size - 1;
    }
    public void push(int data){
        if (isFull()) {
            System.out.println("Stack penuh");
        } else {
            top++;
            tumpukanBiner07[top] = data;

        }
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("Stack kosong");
            return -1;

        }else {
            int data = tumpukanBiner07[top];
            top--;
            return data;
        }
    }

}
