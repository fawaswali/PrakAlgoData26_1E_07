package P10.P1Jobsheet10;

public class Queue07 {
    int[] data07;
    int front07;
    int rear07;
    int size07;
    int max07;

    public Queue07(int n){
        max07 = n;
        data07 = new int[max07];
        size07 = 0;
        front07 = rear07 = -1;
    }

    public boolean IsEmpty(){
        if (size07 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull(){
        if (size07 == max07) {
            return true;
        }  else {
            return false;
        }
    }

    public void peek () {
        if (!IsEmpty()) {
            System.out.println("Elemen terdepan: " + data07[front07]);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void print () {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front07;
            while (i !=rear07) {
                System.out.print(data07[i] + " ");
                i = (i + 1) % max07;
            }
            System.out.println(data07[i] + " ");
            System.out.println("Jumlah elemen = " + size07);
        }
    }

    public void clear() {
        if (!IsEmpty()) {
            front07 = rear07 = -1;
            size07 = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masing kosong");
        }
    }

    public void Enqueue (int dt) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (IsEmpty()) {
                front07 = rear07 = 0;
            } else {
                if (rear07 == max07 - 1) {
                    rear07 = 0;
                } else {
                    rear07++;
                }
            }
            data07[rear07] = dt;
            size07++;

        }
    }

    public int Dequeue() {
        int dt = 0;
        if (IsEmpty()){
            System.out.println("Queue masih kosong");
        } else {
            dt = data07[front07];
            size07--;
            if (IsEmpty()) {
                front07 = rear07 = -1;
            } else {
                if (front07 == max07 - 1) {
                    front07 = 0;
                } else {
                    front07++;
                }
            }
        }
        return dt;
    }
}

