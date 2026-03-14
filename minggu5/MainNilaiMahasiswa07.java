package minggu5;

public class MainNilaiMahasiswa07 {
    public static void main(String[] args) {
       NilaiMahasiswa07[] mhs = {
            new NilaiMahasiswa07("Ahmad",220101001,2022,78,82),
            new NilaiMahasiswa07("Budi",220101002,2022,85,88),
            new NilaiMahasiswa07("Cindy",220101003,2021,90,87),
            new NilaiMahasiswa07("Dian",220101004,2021,76,79),
            new NilaiMahasiswa07("Eko",220101005,2023,92,95),
            new NilaiMahasiswa07("Fajar",220101006,2020,88,85),
            new NilaiMahasiswa07("Gina",220101007,2023,80,83),
            new NilaiMahasiswa07("Hadi",220101008,2020,82,84)
        };

       NilaiMahasiswa07 hitung = new NilaiMahasiswa07("",0,0,0,0);

        int nilaiTertinggi = hitung.maxUTS(mhs,0,mhs.length-1);
        int nilaiTerendah = hitung.minUTS(mhs,0,mhs.length-1);
        double rataUAS = hitung.rataUAS(mhs);

        System.out.println("Nilai UTS Tertinggi : " + nilaiTertinggi);
        System.out.println("Nilai UTS Terendah : " + nilaiTerendah);
        System.out.println("Rata-rata Nilai UAS : " + rataUAS);
    }
}
