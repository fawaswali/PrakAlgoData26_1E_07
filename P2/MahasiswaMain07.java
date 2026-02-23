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

        Mahasiswa07 mhs2 = new Mahasiswa07("Annisa Nabila", "2141720172", 3.85, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkaninformasi();

        Mahasiswa07 mhsFawas = new Mahasiswa07("Fawas Saqif Abdullohil Wali", "254107020037", 3.80, "TI 1E");
        mhsFawas.tampilkaninformasi();
    }
}