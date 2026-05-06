package P10;

public class AntrianKRS07 {
     Mahasiswa07[] data07;
    int front07;
    int rear07;
    int size07;
    int max07;
    int jumlahProses07;

    public AntrianKRS07(int max) {
        max07 = max;
        data07 = new Mahasiswa07[max07];
        front07 = 0;
        rear07 = -1;
        size07 = 0;
        jumlahProses07 = 0;
    }

    public boolean IsEmpty() {
        return size07 == 0;
    }

    public boolean IsFull() {
        return size07 == max07;
    }

    public void clear() {
        front07 = 0;
        rear07 = -1;
        size07 = 0;
        System.out.println("Antrian berhasil dikosongkan");
    }

    public void tambahAntrian(Mahasiswa07 mhs) {
        if (IsFull()) {
            System.out.println("Antrian penuh");
            return;
        }

        rear07 = (rear07 + 1) % max07;
        data07[rear07] = mhs;
        size07++;

        System.out.println(mhs.nama07 + " berhasil masuk antrian");
    }

    public void prosesKRS() {
        if (size07 < 2) {
            System.out.println("Antrian kurang dari 2 mahasiswa");
            return;
        }

        System.out.println("Mahasiswa diproses:");

        for (int i = 0; i < 2; i++) {
            Mahasiswa07 mhs = data07[front07];
            mhs.tampilkanData();

            front07 = (front07 + 1) % max07;
            size07--;
            jumlahProses07++;
        }
    }

    public void lihatSemua() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }

        System.out.println("Daftar Antrian:");

        for (int i = 0; i < size07; i++) {
            int index = (front07 + i) % max07;
            System.out.print((i + 1) + ". ");
            data07[index].tampilkanData();
        }
    }

    public void lihat2Terdepan() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }

        System.out.println("2 Antrian Terdepan:");

        int batas = Math.min(2, size07);

        for (int i = 0; i < batas; i++) {
            int index = (front07 + i) % max07;
            data07[index].tampilkanData();
        }
    }

    public void lihatAkhir() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Antrian paling belakang:");
            data07[rear07].tampilkanData();
        }
    }

    public int getJumlahAntrian() {
        return size07;
    }

    public int getJumlahProses() {
        return jumlahProses07;
    }

    public int getBelumProses() {
        return 30 - jumlahProses07;
    }
}
