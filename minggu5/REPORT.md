# Laporan Praktikum Algoritma Struktur Data JOBSHEET V BRUTE FORCE DAN DIVIDE CONQUER
## Nama: Fawas Saqif Abdullohil Wali
## NIM : 254107020037
## Kelas : TI-1E

## 5.2 Menghitung Nilai Faktorial dengan Algoritma Brute Force dan Divide and Conquer
### hasil kode

package minggu5;

public class Faktorial07 {

    int faktorialBF(int n){
    
        int fakto = 1;
        
        for (int i = 1; i <= n; i++) {
        
            fakto = fakto * i;
        }
        
        return fakto;
        
    }

    int faktorialDC(int n){
    
        if (n==1) {
            return 1;
        }else{
            int fakto = n * faktorialDC(n-1);
            return fakto;
        }
    }
}

package minggu5;

import java.util.Scanner;

public class MainFaktorial07 {

    public static void main(String[] args) {
    
        Scanner fawas = new Scanner(System.in);
        
        System.out.print("Masukkan nilai: ");
        
        int nilai = fawas.nextInt();

        Faktorial07 fk = new Faktorial07();
        
        System.out.println("Nilai faktorial "+nilai+"menggunakan BF: "+fk.faktorialBF(nilai));
        System.out.println("Nilai faktorial "+nilai+"menggunakan DC: "+fk.faktorialDC(nilai));
        
    }

    
}
### 5.2.3. Pertanyaan
1. Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial, jelaskan
perbedaan bagian kode pada penggunaan if dan else!

if digunakan sebagai base case (kondisi dasar) untuk menghentikan rekursi.
Jika kondisi dasar terpenuhi, maka fungsi langsung mengembalikan nilai tanpa memanggil dirinya lagi.else digunakan untuk melakukan proses rekursif, yaitu memecah masalah menjadi masalah yang lebih kecil dan memanggil fungsi kembali.


2. Apakah memungkinkan perulangan pada method faktorialBF() diubah selain menggunakan
for? Buktikan!

Ya, memungkinkan. Perulangan bisa diganti menggunakan while atau do-while.

Contoh menggunakan while:

int faktorialBF(int n){
    int fakto = 1;
    int i = 1;

    while(i <= n){
        fakto = fakto * i;
        i++;
    }

    return fakto;
}

while melakukan perulangan selama kondisi i <= n

setiap iterasi nilai faktorial dikalikan dengan i

Jadi, perulangan tidak harus menggunakan for.

3. Jelaskan perbedaan antara fakto *= i; dan int fakto = n * faktorialDC(n-1); !

fakto = fakto * i;
Digunakan pada algoritma Brute Force (iteratif) dengan perulangan.
int fakto = n * faktorialDC(n-1);
igunakan pada algoritma Divide and Conquer (rekursif).


4. Buat Kesimpulan tentang perbedaan cara kerja method faktorialBF() dan faktorialDC()!

faktorialBF() menghitung faktorial dengan perulangan secara langsung.

faktorialDC() menghitung faktorial dengan rekursi menggunakan konsep divide and conquer.


## 5.3 Menghitung Hasil Pangkat dengan Algoritma Brute Force dan Divide and Conquer

### hasil kode
package minggu5;

public class Pangkat07 {
    int nilai, pangkat;
    Pangkat07(int n, int p){
        nilai = n;
        pangkat = p;
    }

    int pangkatBF(int a, int n){
        int hasil = 1;
        for (int i = 0; i < n; i++) {
            hasil = hasil*a;
        }
        return hasil;
    }

    int pangkatDC(int a, int n){
        if (n==1) {
            return a;
        }else{
            if(n%2==1){
                return (pangkatDC(a, n/2)*pangkatDC(a, n/2)*a);
            }else{
                return (pangkatDC(a, n/2)*pangkatDC(a, n/2));
            }
        }
    }
}

package minggu5;
import java.util.Scanner;
public class MainPangkat07 {
    public static void main(String[] args) {
        Scanner fawas = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = fawas.nextInt();

        Pangkat07[] png = new Pangkat07[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai basis elemen ke-"+(i+1)+": ");
            int basis = fawas.nextInt();
            System.out.print("Masukkan nilai pangkat elemen ke-"+(i+1)+": ");
            int pangkat = fawas.nextInt();
            png[i] = new Pangkat07(basis, pangkat);
        }

        System.out.println("HASIL PANGKAT BRUTEFORCE:");
        for (Pangkat07 p : png) {
            System.out.println(p.nilai+"^"+p.pangkat+": "+p.pangkatBF(p.nilai,p.pangkat));
        }
        System.out.println("HASIL PANGKAT DIVIDE AND CONQUER:");
        for (Pangkat07 p : png){
            System.out.println(p.nilai+"^"+p.pangkat+": "+p.pangkatDC(p.nilai,p.pangkat));
        }

    }
}

### 5.3.3. Pertanyaan

1. Jelaskan mengenai perbedaan 2 method yang dibuat yaitu pangkatBF() dan pangkatDC()!

pangkatBF() (Brute Force)
Menggunakan perulangan (iterasi).
Kemudian nilai dikalikan berulang kali sesuai jumlah pangkat.
Lalu prosesnya sederhana dan dilakukan langkah demi langkah.

pangkatDC() (Divide and Conquer)

Menggunakan rekursi.
Lalu masalah dipecah menjadi masalah yang lebih kecil.
Kemudian menggunakan konsep pembagian pangkat.

2. Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan!

Ya, tahap combine sudah ada pada method pangkatDC().

Tahap combine adalah proses menggabungkan hasil dari pemecahan masalah kecil.

Contoh kode:

return pangkatDC(a, n/2) * pangkatDC(a, n/2);

3. Pada method pangkatBF()terdapat parameter untuk melewatkan nilai yang akan dipangkatkan
dan pangkat berapa, padahal di sisi lain di class Pangkat telah ada atribut nilai dan pangkat,
apakah menurut Anda method tersebut tetap relevan untuk memiliki parameter? Apakah bisa
jika method tersebut dibuat dengan tanpa parameter? Jika bisa, seperti apa method
pangkatBF() yang tanpa parameter?

Menurut saya method tersebut tetap relevan memiliki parameter, karena:

Method bisa digunakan untuk nilai yang berbeda-beda

Lebih fleksibel

Tidak bergantung pada atribut class saja.

Namun method juga bisa dibuat tanpa parameter jika menggunakan atribut yang sudah ada di class.

4. Tarik tentang cara kerja method pangkatBF() dan pangkatDC()!

pangkatBF():

Menggunakan algoritma Brute Force

Menghitung pangkat dengan perulangan

Mengalikan angka secara berulang sampai jumlah pangkat tercapai.

pangkatDC():

Menggunakan algoritma Divide and Conquer

Menggunakan rekursi

Memecah perhitungan menjadi pangkat yang lebih kecil kemudian menggabungkannya kembali.

## 5.4 Menghitung Sum Array dengan Algoritma Brute Force dan Divide and Conquer

### hasil kode
package minggu5;

public class Sum07 {
    double keuntungan[];

    Sum07(int el){
        keuntungan = new double[el];
    }

    double totalBF(){
        double total =0;
        for(int i=0;i<keuntungan.length;i++){
            total = total+keuntungan[i];
        }
        return total;
    }

    double totalDC(double arr[], int l,int r){
        if(l==r){
            return arr[l];
        }

        int mid = (l+r)/2;
        double lsum = totalDC(arr, l, mid);
        double rsum = totalDC(arr, mid+1, r);
        return lsum+rsum;
    }
}

package minggu5;
import java.util.Scanner;
public class MainSum07 {
    public static void main(String[] args) {
        Scanner fawas = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = fawas.nextInt();

        Sum07 sm = new Sum07(elemen);
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan keuntunngan ke-"+(i+1)+": ");
            sm.keuntungan[i] = fawas.nextDouble();
        }

        System.out.println("Total keuntungan menggunkan BruteForce: "+sm.totalBF());
        System.out.println("Total keuntungan menggunakan Divide and Conquer: "+sm.totalDC(sm.keuntungan,0,elemen-1));
    }
}

### 5.4.3. Pertanyaan

1. Kenapa dibutuhkan variable mid pada method TotalDC()?

Variabel mid digunakan untuk membagi array menjadi dua bagian pada algoritma Divide and Conquer.

2. Untuk apakah statement di bawah ini dilakukan dalam TotalDC()?

Fungsi statement tersebut adalah untuk melakukan proses rekursi pada dua bagian array.

3. Kenapa diperlukan penjumlahan hasil lsum dan rsum seperti di bawah ini?

Penjumlahan ini dilakukan karena algoritma Divide and Conquer memiliki tahap combine.

4. Apakah base case dari totalDC()?

Base case terjadi ketika array hanya memiliki satu elemen.

5. Tarik Kesimpulan tentang cara kerja totalDC()

Method TotalDC() menghitung jumlah seluruh elemen array dengan cara membagi array menjadi bagian kecil, menghitungnya secara rekursif, lalu menggabungkan hasilnya kembali menjadi satu total.


## 4.5 Latihan Praktikum

### hasil kode

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

