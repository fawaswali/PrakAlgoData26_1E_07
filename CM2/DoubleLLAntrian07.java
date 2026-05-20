package CM2;

public class DoubleLLAntrian07 {
    NodePembeli07 head, tail;
    int nomor = 1;

    void tambahAntrian(String nama, String noHp) {
        Pembeli07 p = new Pembeli07(nama, noHp);
        NodePembeli07 newNode = new NodePembeli07(p);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        System.out.println("Antrian berhasil ditambahkan dengan nomor: " + nomor++);
    }

    void cetakAntrian() {
        if (head == null) {
            System.out.println("Antrian kosong!");
            return;
        }


        System.out.println("===============================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("===============================");

        System.out.println("No Antrian\tNama\tNo HP");

        NodePembeli07 temp = head;
        int no = 1;

        while (temp != null) {
            System.out.println(no + "\t" + temp.data.nama07 + "\t" + temp.data.noHp07);
            temp = temp.next;
            no++;
        }
    }

    Pembeli07 hapusAntrian() {
        if (head == null) {
            System.out.println("Antrian kosong!");
            return null;
        }

        Pembeli07 p = head.data;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        return p;
    }
}
