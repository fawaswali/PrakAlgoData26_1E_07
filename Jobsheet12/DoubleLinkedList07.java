package Jobsheet12;

public class DoubleLinkedList07 {
   
    Node07 head;
    Node07 tail;

    

    public DoubleLinkedList07(){
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa07 data) {
        Node07 newNode = new Node07( data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa07 data) {
        Node07 newNode = new Node07( data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa07 data) {
        Node07 current = head;
        while (current != null && !current.data.nim07.equals(keyNim)) {
            current = current.next;
        
        }
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + "tidak ditemukan");
            return;
        } 

        Node07 newNode07 = new Node07(data);

        if (current == tail) {
            newNode07.prev = current;
            current.next  = newNode07;
            tail = newNode07;
        } else {
            newNode07.prev = current;
            newNode07.next = current.next;
            current.next.prev = newNode07;
            current.next = newNode07;
        }

        System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong");
        } else {
            Node07 current = head;
            while (current != null) {
                current.data.tampil();
                current = current.next;
            }
        }
    }
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }

        System.out.println("Data yang dihapus:");
        head.data.tampil();

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }

        System.out.println("Data yang dihapus:");
        tail.data.tampil();


        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void printReverse() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong");
            return;
        }

        Node07 current = tail;
        while (current != null) {
            current.data.tampil();
            current = current.prev;
        }
    }

}
