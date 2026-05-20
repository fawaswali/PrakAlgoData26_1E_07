package CM2;

public class DoubleLLPesanan07 {
    NodePesanan07 head, tail;

    void tambahPesanan(Pesanan07 p) {
        NodePesanan07 newNode = new NodePesanan07(p);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    void sortPesanan() {
        if (head == null) return;

        for (NodePesanan07 i = head; i != null; i = i.next) {
            for (NodePesanan07 j = i.next; j != null; j = j.next) {
                if (i.data.namaPesanan07.compareToIgnoreCase(j.data.namaPesanan07) > 0) {
                    
                    Pesanan07 temp = i.data;
                    i.data = j.data;
                    j.data = temp;
                }
            }
        }
    }

    void tampilPesanan() {


        if (head == null) {
            System.out.println("Belum ada pesanan!");
            return;
        }

        sortPesanan();

        

        NodePesanan07 temp = head;
        int total = 0;

        System.out.println("===============================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("===============================");

        System.out.println("Kode Pesanan\tNama Pesanan\tHarga");
        while (temp != null) {
            System.out.println(temp.data.kodePesanan07 + 
                               temp.data.namaPesanan07 + 
                               temp.data.harga07);
            total += temp.data.harga07;
            temp = temp.next;
        }

        System.out.println("Total Pendapatan: " + total);
    }
}
