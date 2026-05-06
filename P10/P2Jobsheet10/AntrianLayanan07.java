package P10.P2Jobsheet10;

public class AntrianLayanan07 {
    Mahasiswa07[] data07;
    int front07;
    int rear07;
    int size07;
    int max07;

    public AntrianLayanan07(int max){
        this.max07 = max;
        this.data07 = new Mahasiswa07[max07];
        this.size07 = 0;
        this.front07 = 0; 
        this.rear07 = -1;
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

    public void Enqueue (Mahasiswa07 dt) {
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

    public Mahasiswa07 Dequeue() {
        Mahasiswa07 dt = null;
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

    public void tambahAntrian(Mahasiswa07 mhs){
        if (IsFull()) {
            System.out.println("Antrian penuh,tidak dapat menambah mahasiswa");
            return;
        }
        rear07 = (rear07 + 1) % max07;
        data07[rear07] = mhs;
        size07++;
        System.out.println(mhs.nama07 + " berhasil masuk ke antrian");
    }

    public Mahasiswa07 layaniMahasiswa(){
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        }
        Mahasiswa07 mhs = data07[front07];
        front07 = (front07 + 1) % max07;
        size07--;
        return mhs;

    }

    public void lihatTerdepan(){
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data07[front07].tampilkanData();
        }
    }

    public void tampilkansemua(){
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size07; i++) {
            int index = (front07 + i) % max07;
            System.out.print((i+1) + ". ");
            data07[index].tampilkanData();
        }
    }

    public void lihatAkhir(){
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Mahasiswa paling belakang: ");
            System.out.println("NIM - NAMA - PRODI - KELAS ");
            data07[rear07].tampilkanData();
        }
    }

    public int getJumlahAntrian() {
        return size07;
    }
}
