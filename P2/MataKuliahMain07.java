package P2;

public class MataKuliahMain07 {
    public static void main(String[] args) {
        MataKuliah07 mk = new MataKuliah07();
        mk.kodeMK = "MK01";
        mk.nama = "Algoritma dan Strukur Data";
        mk.sks = 3;
        mk.jumlahJam = 4;


        mk.tampilInformasi();
        mk.ubahsks(4);
        mk.tambahJam(5);
        mk.kurangiJam(2);
        mk.tampilInformasi();

        MataKuliah07 mk2 = new MataKuliah07("MK02","Basis Data",2,3);
        mk2.tambahJam(1);
        mk2.tampilInformasi();

    }
}
