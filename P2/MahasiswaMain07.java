package P2;

public class MahasiswaMain07 {
    public static void main(String[] args) {
        Mahasiswa07 mhsl = new Mahasiswa07 ();
        mhsl.nama = "Muhammad Ali Farhan";
        mhsl.nim = "2241720171";
        mhsl.kelas = "SI 2J";
        mhsl.ipk = 4.55;

        mhsl.tampilkaninformasi();
        mhsl.ubahKelas("SI 2K");
        mhsl.updateIpk(4.60);
        mhsl.tampilkaninformasi();

    }
}
