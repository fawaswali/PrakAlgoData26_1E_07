package Praktikum05;

public class MahasiswaDemo07 {
    public static void main(String[] args) {
        MahasiswaBerprestasi07 list = new MahasiswaBerprestasi07();
        Mahasiswa07 m1 = new Mahasiswa07("001", "Andi", "TI-1A", 3.5);
        Mahasiswa07 m2 = new Mahasiswa07("002", "Budi", "TI-1A", 3.8);
        Mahasiswa07 m3 = new Mahasiswa07("003", "Citra", "TI-1B", 3.2);
        Mahasiswa07 m4 = new Mahasiswa07("004", "Dina", "TI-1B", 3.9);
        Mahasiswa07 m5 = new Mahasiswa07("005", "Eko", "TI-1C", 3.4);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        list.bubbleSort();
        list.tampil();
    }
}
