# LAPORAN PRAKTIKUM ALGORITMA DAN STRUKTUR DATA
# JOBSHEET 11 X QUEUE
## Nama:Fawas Saqif Abdullohil Wali
## NIM:254107020037
## Kelas:TI-1E
## No Absen: 07


## 2. Praktikum 1
## 2.1 Percobaan 1 : Operasi Dasar Queue

<img width="570" height="558" alt="Cuplikan layar 2026-05-06 215047" src="https://github.com/user-attachments/assets/629794e6-1176-4525-bf03-73c53fa7549d" />

<img width="488" height="651" alt="Cuplikan layar 2026-05-06 215057" src="https://github.com/user-attachments/assets/3af50bfb-78b8-427d-afaf-795c46f4bbea" />

<img width="503" height="662" alt="Cuplikan layar 2026-05-06 215105" src="https://github.com/user-attachments/assets/951b9b17-9326-4020-8fc9-ea0928a817ac" />

<img width="539" height="702" alt="Cuplikan layar 2026-05-06 215118" src="https://github.com/user-attachments/assets/1889e456-0012-4201-b1eb-3570e220997b" />

<img width="487" height="643" alt="Cuplikan layar 2026-05-06 215128" src="https://github.com/user-attachments/assets/a91338d3-b982-49ca-9555-90cd175833fe" />

<img width="370" height="305" alt="Cuplikan layar 2026-05-06 215136" src="https://github.com/user-attachments/assets/f82fc8ac-c63d-4a23-844a-ae5cf5a54b1d" />



### kode program
<img width="641" height="745" alt="Cuplikan layar 2026-05-06 204901" src="https://github.com/user-attachments/assets/1217b15a-6016-424c-9238-77f06d4b1192" />
<img width="808" height="754" alt="Cuplikan layar 2026-05-06 204912" src="https://github.com/user-attachments/assets/24c2037c-a82e-48ac-aebd-d11c13646d74" />
<img width="637" height="821" alt="Cuplikan layar 2026-05-06 204929" src="https://github.com/user-attachments/assets/a696c0f0-0043-4456-a101-42ed7d024bd2" />
<img width="609" height="568" alt="Cuplikan layar 2026-05-06 204937" src="https://github.com/user-attachments/assets/1f533576-5eaf-404c-b153-070c410554f3" />
<img width="785" height="609" alt="Cuplikan layar 2026-05-06 205005" src="https://github.com/user-attachments/assets/7ac05a8f-dbd8-49cd-899b-c91fd1005a6d" />
<img width="1052" height="722" alt="Cuplikan layar 2026-05-06 205019" src="https://github.com/user-attachments/assets/32cbc7a7-07d3-4064-ba9c-63dad6f5ed06" />

### hasil running

<img width="496" height="768" alt="Cuplikan layar 2026-05-06 205131" src="https://github.com/user-attachments/assets/0b590178-ebe3-4222-b376-06cb7f025cea" />

### pertanyaan
<img width="724" height="548" alt="Cuplikan layar 2026-05-06 205918" src="https://github.com/user-attachments/assets/6fe1fd1f-4d61-4850-84a8-4ad80b4522a6" />

1. Karena saat queue pertama kali dibuat, queue masih kosong dan belum memiliki data sama sekali. Nilai -1 digunakan sebagai tanda bahwa queue belum terisi.

2. Potongan kode tersebut digunakan untuk membuat queue menjadi circular queue (antrian melingkar).
Penjelasan:
Jika rear07 sudah berada di indeks terakhir array (max07 - 1), maka rear07 dikembalikan ke indeks 0.
Jika belum berada di indeks terakhir, maka rear07 ditambah 1.
Tujuannya agar array dapat digunakan kembali dari awal tanpa harus membuat array baru.

3.Potongan kode tersebut digunakan untuk memindahkan posisi front ke depan setelah data dikeluarkan dari queue.
Penjelasan:
Jika front07 sudah berada di indeks terakhir array, maka front kembali ke indeks 0.
Jika belum, maka front maju satu langkah (front07++).
Tujuannya agar queue tetap berjalan secara melingkar (circular queue).

4.Karena elemen pertama queue belum tentu berada pada indeks 0.
Dalam circular queue, posisi depan queue dapat berpindah-pindah akibat proses dequeue.
Jika dimulai dari 0, maka bisa saja mencetak data kosong atau data yang sudah keluar dari queue.
Karena itu pencetakan harus dimulai dari posisi front07, yaitu posisi elemen paling depan yang valid.

5.Kode tersebut digunakan untuk menggeser indeks ke posisi berikutnya secara melingkar.
Penjelasan:
i + 1 berarti pindah ke indeks berikutnya.
% max07 digunakan agar jika indeks sudah mencapai akhir array, maka kembali ke indeks 0.

6. <img width="515" height="81" alt="Cuplikan layar 2026-05-06 210637" src="https://github.com/user-attachments/assets/4fd896bf-e44b-4e5d-91c8-ff75cf965a39" />

<img width="260" height="177" alt="Cuplikan layar 2026-05-06 210656" src="https://github.com/user-attachments/assets/06e5639c-9d04-4f6e-9e5b-234516d9124c" />

7.<img width="536" height="103" alt="Cuplikan layar 2026-05-06 210919" src="https://github.com/user-attachments/assets/cc6e471f-4763-44f6-b9a0-eb108d7eac96" />

<img width="510" height="82" alt="Cuplikan layar 2026-05-06 210949" src="https://github.com/user-attachments/assets/972a77e0-a2b7-4867-97be-6f5a9d441a5b" />

## 2.2. Percobaan 2 : Antrian Layanan Akademik

<img width="540" height="682" alt="Cuplikan layar 2026-05-06 215235" src="https://github.com/user-attachments/assets/97352a37-d047-4766-8a13-572226618922" />

<img width="505" height="636" alt="Cuplikan layar 2026-05-06 215245" src="https://github.com/user-attachments/assets/d3d62174-2b1f-4e9f-ba32-abb8d876a446" />

<img width="500" height="657" alt="Cuplikan layar 2026-05-06 215255" src="https://github.com/user-attachments/assets/e029363a-6d50-4bcf-9fa7-82805fc68e81" />

<img width="496" height="687" alt="Cuplikan layar 2026-05-06 215305" src="https://github.com/user-attachments/assets/02e79d45-9e40-4ffd-aa1c-d96e80bfb97e" />

<img width="417" height="656" alt="Cuplikan layar 2026-05-06 215314" src="https://github.com/user-attachments/assets/83bea644-c732-400e-9024-0c0700ce65fc" />

<img width="288" height="255" alt="Cuplikan layar 2026-05-06 215322" src="https://github.com/user-attachments/assets/08fb0d10-a1e5-4f89-91e8-41fe690c91b4" />

### kode program
<img width="858" height="506" alt="Cuplikan layar 2026-05-06 212158" src="https://github.com/user-attachments/assets/af013e08-204b-4447-b489-d89537b26dfa" />
<img width="707" height="781" alt="Cuplikan layar 2026-05-06 212212" src="https://github.com/user-attachments/assets/9ebf2030-889c-46e2-bdfb-f0c0ec992049" />
<img width="758" height="750" alt="Cuplikan layar 2026-05-06 212226" src="https://github.com/user-attachments/assets/159aa939-d714-4b03-ba95-fd3cbbc5623c" />
<img width="663" height="796" alt="Cuplikan layar 2026-05-06 212239" src="https://github.com/user-attachments/assets/e2a4355b-5408-4d22-ba71-191878cb8ed1" />
<img width="1031" height="799" alt="Cuplikan layar 2026-05-06 212256" src="https://github.com/user-attachments/assets/85b40f28-d645-4502-9624-7441d9370db6" />
<img width="794" height="825" alt="Cuplikan layar 2026-05-06 212307" src="https://github.com/user-attachments/assets/7fd8ae8a-fd4b-4867-ae29-538dfda40104" />
<img width="379" height="164" alt="Cuplikan layar 2026-05-06 212314" src="https://github.com/user-attachments/assets/35c9ade5-afa6-40a3-ace9-b35481be176b" />
<img width="879" height="857" alt="Cuplikan layar 2026-05-06 212328" src="https://github.com/user-attachments/assets/d43abc2b-0a95-44b9-a50a-79edadd991ed" />
<img width="1095" height="797" alt="Cuplikan layar 2026-05-06 212342" src="https://github.com/user-attachments/assets/b1dac55e-6e37-49fa-ac9c-6da07cd57815" />
<img width="669" height="261" alt="Cuplikan layar 2026-05-06 212348" src="https://github.com/user-attachments/assets/7cb064fb-a2b2-4873-aec2-b6ecdf886eeb" />

### hasil running
<img width="460" height="341" alt="Cuplikan layar 2026-05-06 212025" src="https://github.com/user-attachments/assets/2c5b4c6b-81f1-415a-a9d3-8b5c583f809f" />
<img width="372" height="341" alt="Cuplikan layar 2026-05-06 212038" src="https://github.com/user-attachments/assets/0e003142-f2ab-4f15-84f7-a18445aeba37" />
<img width="430" height="596" alt="Cuplikan layar 2026-05-06 212055" src="https://github.com/user-attachments/assets/1b0d3f6d-d7ef-4f51-bc76-5ff3942147ca" />
<img width="369" height="296" alt="Cuplikan layar 2026-05-06 212102" src="https://github.com/user-attachments/assets/9b32c307-f6b1-4403-b6dd-9c28c9ce47de" />


### pertanyaan
Lakukan modifikasi program dengan menambahkan method baru bernama LihatAkhir pada class
AntrianLayanan yang digunakan untuk mengecek antrian yang berada di posisi belakang. Tambahkan
pula daftar menu 6. Cek Antrian paling belakang pada class LayananAkademikSIAKAD sehingga
method LihatAkhir dapat dipanggil!
<img width="625" height="224" alt="Cuplikan layar 2026-05-06 213046" src="https://github.com/user-attachments/assets/68cdbe1b-16cf-448f-a4c0-541e99342135" />
<img width="645" height="270" alt="Cuplikan layar 2026-05-06 213213" src="https://github.com/user-attachments/assets/f5d68681-ae65-4ade-956d-2642f2bc9823" />
<img width="275" height="85" alt="Cuplikan layar 2026-05-06 213221" src="https://github.com/user-attachments/assets/426ce3cd-d122-4cfe-9cee-4e124af24978" />


## 2.3 Tugas
## Waktu : 120 Menit
Buatlah program antrian untuk mengilustasikan antrian persetujuan Kartu Rencana Studi (KRS)
Mahasiswa oleh Dosen Pembina Akademik (DPA). Ketika seorang mahasiswa akan mengantri, maka
dia harus mendaftarkan datanya (data mahasiswa seperti pada praktikum 2). Gunakan class untuk
antrian seperti pada Praktikum 1 dan 2, dengan method-method yang berfungsi :
• Cek antrian kosong, Cek antrian penuh, Mengosongkan antrian.
• Menambahkan antrian, Memanggil antrian untuk proses KRS – setiap 1x panggilan terdiri dari 2
mahasiswa (pada antrian no 1 dan 2)
• Menampilkan semua antrian, Menampilkan 2 antrian terdepan, Menampilkan antrian paling akhir.
• Cetak jumlah antrian, Cetak jumlah yang sudah melakukan proses KRS
• Jumlah antrian maximal 10, jumlah yang ditangani masing-masing DPA 30 mahasiswa, cetak jumlah
mahasiswa yang belum melakukan proses KRS.
Gambarkan Diagram Class untuk antriannya. Implementasikan semua method menggunakan menu
pilihan pada fungsi main. 

### kode program
<img width="838" height="594" alt="Cuplikan layar 2026-05-06 214700" src="https://github.com/user-attachments/assets/4e1fb804-88bc-4791-a2cb-15b5bc9a1729" />

<img width="774" height="788" alt="Cuplikan layar 2026-05-06 214709" src="https://github.com/user-attachments/assets/737b1f5c-d9ca-4f52-90b7-ddecc865192a" />

<img width="714" height="729" alt="Cuplikan layar 2026-05-06 214721" src="https://github.com/user-attachments/assets/0bef1c70-c821-444d-8a05-9474e232244a" />

<img width="671" height="717" alt="Cuplikan layar 2026-05-06 214731" src="https://github.com/user-attachments/assets/d8a8d5f1-89ff-4f96-83d2-73dd0711540a" />

<img width="627" height="514" alt="Cuplikan layar 2026-05-06 214739" src="https://github.com/user-attachments/assets/c5a85d53-d473-4a79-ac44-55a00eed5f88" />

<img width="835" height="727" alt="Cuplikan layar 2026-05-06 214750" src="https://github.com/user-attachments/assets/18e6689f-9219-46e2-9c63-86bff7a33767" />

<img width="715" height="805" alt="Cuplikan layar 2026-05-06 214759" src="https://github.com/user-attachments/assets/17e81f8c-bc19-4aec-a461-538a673f6cfc" />


<img width="741" height="766" alt="Cuplikan layar 2026-05-06 214810" src="https://github.com/user-attachments/assets/9789e8d1-51f2-40e9-b35b-3f9f9a787aca" />

<img width="622" height="168" alt="Cuplikan layar 2026-05-06 214819" src="https://github.com/user-attachments/assets/63fb6186-b367-4604-afe4-0b2ff535ec3b" />

### hasil running
<img width="414" height="782" alt="Cuplikan layar 2026-05-06 214516" src="https://github.com/user-attachments/assets/c2c9b31a-7434-43d5-9108-b955521b836f" />
<img width="389" height="689" alt="Cuplikan layar 2026-05-06 214529" src="https://github.com/user-attachments/assets/1f3a30a7-9a3d-4c07-a837-dd36562fdf89" />
<img width="378" height="871" alt="Cuplikan layar 2026-05-06 214541" src="https://github.com/user-attachments/assets/c4b67667-aa30-41aa-9423-bb211265c315" />
<img width="343" height="750" alt="Cuplikan layar 2026-05-06 214556" src="https://github.com/user-attachments/assets/8ae6c731-7b36-41b2-83b8-8cb30fca2097" />
<img width="360" height="661" alt="Cuplikan layar 2026-05-06 214604" src="https://github.com/user-attachments/assets/b0c49b47-f142-4c5f-929a-4a0ecaea4eab" />
