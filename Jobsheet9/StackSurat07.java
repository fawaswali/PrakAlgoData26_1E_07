package Jobsheet9;

public class StackSurat07 {
    surat07[] stack;
    int top;
    int size;

    public StackSurat07(int size) {
        this.size = size;
        stack = new surat07[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(surat07 s) {
        if (!isFull()) {
            stack[++top] = s;
        } else {
            System.out.println("Stack penuh!");
        }
    }

    public surat07 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Tidak ada surat!");
            return null;
        }
    }

    public surat07 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            return null;
        }
    }

    // cari berdasarkan nama
    public boolean cari(String nama) {
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                return true;
            }
        }
        return false;
    }
}
