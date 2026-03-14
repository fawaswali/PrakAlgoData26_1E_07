package minggu5;

public class NilaiMahasiswa07 {
    String nama;
    int nim;
    int tahunMasuk;
    int uts;
    int uas;

    NilaiMahasiswa07(String nama, int nim, int tahunMasuk, int uts, int uas) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.uts = uts;
        this.uas = uas;
    }

     int maxUTS(NilaiMahasiswa07[] arr, int l, int r) {
        if (l == r) {
            return arr[l].uts;
        }

        int mid = (l + r) / 2;

        int left = maxUTS(arr, l, mid);
        int right = maxUTS(arr, mid + 1, r);

        if (left > right) {
            return left;
        } else {
            return right;
        }
    }

    int minUTS(NilaiMahasiswa07[] arr, int l, int r) {
        if (l == r) {
            return arr[l].uts;
        }

        int mid = (l + r) / 2;

        int left = minUTS(arr, l, mid);
        int right = minUTS(arr, mid + 1, r);

        if (left < right) {
            return left;
        } else {
            return right;
        }
    }

    double rataUAS(NilaiMahasiswa07[] arr) {
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            total += arr[i].uas;
        }

        return (double) total / arr.length;
    }
}


