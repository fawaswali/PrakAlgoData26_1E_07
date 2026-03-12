package Praktikum03;

public class DataDosen07 {
     void dataSemuaDosen(Dosen07[] arrayOfDosen) {
        for (Dosen07 d : arrayOfDosen) {
            d.cetakInfo();
        }
    }

    void jumlahDosenPerJenisKelamin(Dosen07[] arrayOfDosen) {
        int pria = 0, wanita = 0;

        for (Dosen07 d : arrayOfDosen) {
            if (d.jenisKelamin)
                pria++;
            else
                wanita++;
        }

        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }

    void rerataUsiaDosenPerJenisKelamin(Dosen07[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0;
        int pria = 0, wanita = 0;

        for (Dosen07 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                totalPria += d.usia;
                pria++;
            } else {
                totalWanita += d.usia;
                wanita++;
            }
        }

        System.out.println("Rata-rata Usia Pria   : " + (pria > 0 ? totalPria / pria : 0));
        System.out.println("Rata-rata Usia Wanita : " + (wanita > 0 ? totalWanita / wanita : 0));
    }

    void infoDosenPalingTua(Dosen07[] arrayOfDosen) {
        Dosen07 tertua = arrayOfDosen[0];

        for (Dosen07 d : arrayOfDosen) {
            if (d.usia > tertua.usia) {
                tertua = d;
            }
        }

        System.out.println("\n=== DOSEN PALING TUA ===");
        tertua.cetakInfo();
    }

    void infoDosenPalingMuda(Dosen07[] arrayOfDosen) {
        Dosen07 termuda = arrayOfDosen[0];

        for (Dosen07 d : arrayOfDosen) {
            if (d.usia < termuda.usia) {
                termuda = d;
            }
        }

        System.out.println("\n=== DOSEN PALING MUDA ===");
        termuda.cetakInfo();
    }
}
