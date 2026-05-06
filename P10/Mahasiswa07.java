package P10;

public class Mahasiswa07 {
    String nim07;
    String nama07;
    String prodi07;
    String kelas07;

    public Mahasiswa07(String nim, String nama, String prodi, String kelas) {
        this.nim07 = nim;
        this.nama07 = nama;
        this.prodi07 = prodi;
        this.kelas07 = kelas;
    }

    public void tampilkanData() {
        System.out.println(
            nim07 + " - " +
            nama07 + " - " +
            prodi07 + " - " +
            kelas07
        );
    }
}
