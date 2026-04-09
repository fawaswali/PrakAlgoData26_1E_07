package CM1;

public class Peminjaman07 {
    Mahasiswa07 mhs;
    Buku07 buku;
    int lamaPinjam07;
    int batasPinjam07=5;
    int terlambat07;
    int denda07;

    Peminjaman07(Mahasiswa07 mhs, Buku07 buku, int lamaPinjam){
        this.mhs=mhs;
        this.buku=buku;
        this.lamaPinjam07=lamaPinjam;
        hitungDenda();
    }

    void hitungDenda(){
        terlambat07= lamaPinjam07-batasPinjam07;

        if (terlambat07>0) {
            denda07=terlambat07*2000;
        } else {
            terlambat07=0;
            denda07=0;
        }
    }

    void tampil(){
        System.out.println(mhs.nama07 + " | " + buku.judul07 + " | Lama: " + lamaPinjam07 + " | Terlambat: " + terlambat07 + " | Denda: " + denda07);
    }
}
