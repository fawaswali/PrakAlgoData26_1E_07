package P2;

public class MahasiswaMain07 {
    public static void main(String[] args) {
        Mahasiswa07 mhsl = new Mahasiswa07 ();
        mhsl.nama = "Muhammad Ali Farhan";
        mhsl.nim = "2241720171";
        mhsl.kelas = "SI 2J";
        mhsl.ipk = 3.55;

        mhsl.tampilkaninformasi();
        mhsl.ubahKelas("SI 2K");
        mhsl.updateIpk(3.60);
        mhsl.tampilkaninformasi();

        Mahasiswa07 mhs2 = new Mahasiswa07("Annisa Nabila","2141720160",3.25,"TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkaninformasi();

    }
}
