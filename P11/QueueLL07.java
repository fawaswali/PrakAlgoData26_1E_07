package P11;

public class QueueLL07 {
    Nodeantri07 front, rear;
    int size = 0;

    boolean isEmpty() {
        return front == null;
    }

    void enqueue(Mahasiswaantri07 data) {
        Nodeantri07 newNode = new Nodeantri07(data, null);

        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Antrian masuk!");
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.print("Memanggil: ");
            front.data.tampil();
            front = front.next;
            size--;
        }
    }

    void peekFront() {
        if (!isEmpty()) {
            System.out.print("Terdepan: ");
            front.data.tampil();
        }
    }

    void peekRear() {
        if (!isEmpty()) {
            System.out.print("Terakhir: ");
            rear.data.tampil();
        }
    }

    void print() {
        Nodeantri07 temp = front;
        System.out.println("Isi Antrian:");
        while (temp != null) {
            temp.data.tampil();
            temp = temp.next;
        }
    }

    void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian dikosongkan");
    }

    void jumlah() {
        System.out.println("Jumlah antrian: " + size);
    }
}