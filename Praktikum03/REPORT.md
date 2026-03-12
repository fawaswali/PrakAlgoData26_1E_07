# Laporan Praktikum Algoritma Struktur Data Jobshet 3 array of Objects
## Nama: Fawas Saqif Abdullohil Wali
## NIM : 254107020037
## Kelas : TI-1E

## 3.2 Membuat Array dari Object, Mengisi dan Menampilkan
### hasil code
<img width="307" height="200" alt="Cuplikan layar 2026-02-26 082809" src="https://github.com/user-attachments/assets/1caa4127-81a5-4ce9-aacb-84f9be711abd" />

<img width="679" height="861" alt="Cuplikan layar 2026-02-26 082739" src="https://github.com/user-attachments/assets/6a11664c-730e-4981-8e90-a6eb5f15fab8" />

### hasil running
<img width="278" height="326" alt="Cuplikan layar 2026-02-26 082821" src="https://github.com/user-attachments/assets/ce181bb2-8f5e-449e-8292-f94e27568db9" />

### 3.2.3 Pertanyaan
1.Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki
atribut dan sekaligus method? Jelaskan!

Tidak harus.
Sebuah class boleh hanya memiliki atribut saja, hanya method saja, atau keduanya.
Jika class hanya akan dijadikan tipe data untuk array object, sebenarnya cukup memiliki atribut saja. Method hanya diperlukan jika ingin melakukan operasi tertentu pada data.


2.Apa yang dilakukan oleh kode program berikut?

Fungsinya:

Membuat array bernama arrayOfMahasiswa

Tipe datanya Mahasiswa

Ukurannya 3 elemen

Tetapi objek Mahasiswa di dalamnya belum dibuat (masih null)

3.Apakah class Mahasiswa memiliki konstruktor? Jika tidak, kenapa bisa dilakukan pemanggilan
konstruktur pada baris program berikut?

Jika class tidak menuliskan konstruktor, Java otomatis membuatkan default constructor.Itulah sebabnya kita tetap bisa memanggil Walaupun kita tidak menulis konstruktor sendiri.

4.Apa yang dilakukan oleh kode program berikut?

Membuat objek Mahasiswa baru

Menyimpannya di indeks ke-0 array

Tanpa baris ini, elemen array tetap null dan akan error jika diakses atributnya.

5.Mengapa class Mahasiswa dan MahasiswaDemo dipisahkan pada uji coba 3.2?

Karena prinsip separation of responsibility (pemisahan tanggung jawab):

Class Mahasiswa → hanya mendefinisikan struktur data mahasiswa (atribut + method)

Class MahasiswaDemo → menjalankan program (main method, input, output)

Keuntungan dipisah:

kode lebih rapi

mudah digunakan ulang

mudah di-debug

sesuai standar OOP

## 3.3 Menerima Input Isian Array Menggunakan Looping
### hasil kode

<img width="624" height="791" alt="Cuplikan layar 2026-02-26 090548" src="https://github.com/user-attachments/assets/5dac06fc-9723-4183-bfa2-ab5321ff202b" />


### hasil running
<img width="353" height="699" alt="Cuplikan layar 2026-02-26 090429" src="https://github.com/user-attachments/assets/1f359e24-8dde-466e-8b42-cfcc91c16181" />

## 3.3.3 Pertanyaan

1.Tambahkan method cetakInfo() pada class Mahasiswa kemudian modifikasi kode program
pada langkah no 3.

<img width="454" height="344" alt="Cuplikan layar 2026-02-26 093134" src="https://github.com/user-attachments/assets/ef276f68-fd48-4615-a9db-3b4672d97f2b" />

<img width="644" height="768" alt="Cuplikan layar 2026-02-26 093101" src="https://github.com/user-attachments/assets/1383c8fb-1db0-4d1a-b29b-20450d30306f" />

2.Array sudah dibuat, tetapi objek Mahasiswa di dalam array belum dibuat.

## 3.4 Constructor Berparameter

### hasil kode
<img width="685" height="308" alt="Cuplikan layar 2026-02-26 100524" src="https://github.com/user-attachments/assets/9973ec6a-3331-4f15-a8a8-010320e734c7" />

<img width="679" height="812" alt="Cuplikan layar 2026-02-26 101500" src="https://github.com/user-attachments/assets/924ea393-a750-46ea-a5dc-f7cccbf627c3" />

### hasil running
<img width="397" height="654" alt="Cuplikan layar 2026-02-26 101405" src="https://github.com/user-attachments/assets/2a538a09-def8-449d-9d86-c29da81cef03" />

### 3.4.3 Pertanyaan
1.Apakah suatu class dapat memiliki lebih dari 1 constructor? Jika iya, berikan contohnya

Ya, bisa. Ini disebut constructor overloading (satu class punya beberapa constructor dengan parameter berbeda).

Contoh:

class Matakuliah07 {
    String kode;
    String nama;
    int sks;

    Matakuliah07() {
        kode = "000";
        nama = "Default";
        sks = 0;
    }

    Matakuliah07(String kd, String nm, int s) {
        kode = kd;
        nama = nm;
        sks = s;
    }
}

2.Tambahkan method tambahData() pada class Matakuliah, kemudian gunakan method
tersebut di class MatakuliahDemo untuk menambahkan data Matakuliah
<img width="632" height="486" alt="Cuplikan layar 2026-03-03 225726" src="https://github.com/user-attachments/assets/eb7eeca0-4edd-405d-8f5d-b8c2a1191349" />


<img width="780" height="860" alt="Cuplikan layar 2026-03-03 225718" src="https://github.com/user-attachments/assets/4cee28d2-9b95-4d00-826e-dadaa932d750" />

3.Tambahkan method cetakInfo() pada class Matakuliah, kemudian gunakan method
tersebut di class MatakuliahDemo untuk menampilkan data hasil inputan di layar

<img width="676" height="616" alt="Cuplikan layar 2026-03-03 230334" src="https://github.com/user-attachments/assets/49e633ea-0573-4da6-a8dc-6bbd074843dd" />

4.Modifikasi kode program pada class MatakuliahDemo agar panjang (jumlah elemen) dari
array of object Matakuliah ditentukan oleh user melalui input dengan Scanner
<img width="834" height="814" alt="Cuplikan layar 2026-03-03 230756" src="https://github.com/user-attachments/assets/72493330-c6b2-4bfb-bb9d-ac0b45704e16" />


## 3.5 Tugas
1.Buatlah program untuk menampilkan informasi tentang dosen. Program dapat menerima input
semua informasi terkait dosen dan menampilkanya kembali ke layar. Program ini terdiri dari class
Dosen<NoPresensi> dengan attribute/property sebagai berikut;
String kode
String nama
Boolean jenisKelamin
int usia
dengan methode constructor sebagai berikut;
public dosen(String kode, String nama, Boolean jenisKelamin, int usia) {
…………….;
…………….;
}
Kemudian buatlah class DosenDemo<NoPresensi> untuk proses input dan menampilkan data
beberapa dosen. Gunakan looping dengan FOR untuk pembuatan array of object. Gunakan
looping dengan FOREACH untuk menampilkan data ke layar. 

<img width="678" height="516" alt="Cuplikan layar 2026-03-05 040848" src="https://github.com/user-attachments/assets/3b0b67f7-aad8-4f7f-a26f-c2b1385725e6" />



<img width="553" height="867" alt="Cuplikan layar 2026-03-05 040912" src="https://github.com/user-attachments/assets/52ea000f-4a0c-470f-804b-57e60bb14df3" />

2. Tambahkan class baru DataDosen<NoPresensi> dengan beberapa method berikut;
a. dataSemuaDosen(Dosen[] arrayOfDosen)untuk menampilkan data semua dosen
b. jumlahDosenPerJenisKelamin(Dosen[] arrayOfDosen) untuk menampilkan data
jumlah dosen per jenis kelamin (Pria / Wanita)
c. rerataUsiaDosenPerJenisKelamin(Dosen[] arrayOfDosen) untuk menampilkan
rata-rata usia dosen per jenis kelamin (Pria / Wanita)
d. infoDosenPalingTua(Dosen[] arrayOfDosen) untuk menampilkan data dosen paling
tua
e. infoDosenPalingMuda(Dosen[] arrayOfDosen) untuk menampilkan data dosen paling
muda
Semua method tersebut harus bisa dipanggil/ditest dari class DosenDemo

<img width="584" height="906" alt="Cuplikan layar 2026-03-05 040953" src="https://github.com/user-attachments/assets/aa1c9bf8-7446-46ed-b94c-464dce9087a4" />
