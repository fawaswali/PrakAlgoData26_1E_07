# LAPORAN PRAKTIKUM ALGORITMA DAN STRUKTUR DATA
# JOBSHEET 14 TREE

## NAMA: FAWAS SAQIF ABDULLOHIL WALI
## NIM:254107020037
## KELAS:TI-1E
## NO ABSEN:07

## 14.2 Kegiatan Praktikum 1
## Implementasi Binary Search Tree menggunakan Linked List (100 Menit)
## 14.2.1 Percobaan 1
<img width="501" height="567" alt="Cuplikan layar 2026-06-02 212507" src="https://github.com/user-attachments/assets/0ff59ff7-b114-490b-b4ec-65a7c11841da" />
<img width="482" height="653" alt="Cuplikan layar 2026-06-02 212520" src="https://github.com/user-attachments/assets/fa050fa7-abc3-411a-a129-c412fce23012" />
<img width="434" height="603" alt="Cuplikan layar 2026-06-02 212528" src="https://github.com/user-attachments/assets/8e589465-c338-43f8-a059-5871468d6cd2" />
<img width="436" height="530" alt="Cuplikan layar 2026-06-02 212535" src="https://github.com/user-attachments/assets/9188c742-e7e5-48c6-845b-c965a11323ff" />
<img width="470" height="556" alt="Cuplikan layar 2026-06-02 212543" src="https://github.com/user-attachments/assets/c62ce08f-7e2a-4a06-86aa-ef18f7b74110" />
<img width="467" height="637" alt="Cuplikan layar 2026-06-02 212551" src="https://github.com/user-attachments/assets/0d3910b4-d9b8-4227-b9e4-9f98166ce0b2" />
<img width="462" height="345" alt="Cuplikan layar 2026-06-02 212600" src="https://github.com/user-attachments/assets/6555c82d-a544-4373-8449-c7e198e93652" />


## kode program
<img width="781" height="672" alt="Cuplikan layar 2026-06-02 203119" src="https://github.com/user-attachments/assets/5c1a32c9-524d-4b2e-b7c7-5acf696c705b" />
<img width="475" height="465" alt="Cuplikan layar 2026-06-02 203129" src="https://github.com/user-attachments/assets/b51eddaa-cfca-4ce5-9824-7f8fefef2b6a" />
<img width="746" height="847" alt="Cuplikan layar 2026-06-02 203150" src="https://github.com/user-attachments/assets/956d67dc-fdaa-4ed0-8303-ad0e3a78b49a" />
<img width="608" height="755" alt="Cuplikan layar 2026-06-02 203204" src="https://github.com/user-attachments/assets/47cc561c-0244-430f-a65c-b6459c0eae47" />
<img width="657" height="808" alt="Cuplikan layar 2026-06-02 203216" src="https://github.com/user-attachments/assets/5ca10f43-3bb9-4e49-83f7-0567ae26558a" />
<img width="697" height="816" alt="Cuplikan layar 2026-06-02 203228" src="https://github.com/user-attachments/assets/a4f4062f-8f76-4d74-8c35-16605482fa17" />
<img width="880" height="795" alt="Cuplikan layar 2026-06-02 203244" src="https://github.com/user-attachments/assets/8576a05c-2e8e-457e-b90f-633923ed6b25" />
<img width="824" height="683" alt="Cuplikan layar 2026-06-02 203256" src="https://github.com/user-attachments/assets/3b97aeee-2109-4412-be00-6121e702396d" />
<img width="938" height="823" alt="Cuplikan layar 2026-06-02 203309" src="https://github.com/user-attachments/assets/1204fe1f-39fc-4f6b-b583-2a5588961a3a" />
<img width="1127" height="274" alt="Cuplikan layar 2026-06-02 203316" src="https://github.com/user-attachments/assets/04e874ac-71eb-4aa3-9ce2-f29d54e00a70" />

## Hasil running
<img width="547" height="630" alt="Cuplikan layar 2026-06-02 203336" src="https://github.com/user-attachments/assets/1da73679-3c2b-4735-a397-bb05301b7828" />
<img width="738" height="452" alt="Cuplikan layar 2026-06-02 203400" src="https://github.com/user-attachments/assets/27339c6f-22e9-4ea3-acd7-c0f9d3e22095" />

## 14.2.2 Pertanyaan Percobaan

<img width="431" height="293" alt="Cuplikan layar 2026-06-02 212607" src="https://github.com/user-attachments/assets/4f5c9536-fd10-440f-a4ad-fe52f4d016a1" />


### jawaban
1.Karena pada Binary Search Tree (BST), data disusun terurut:
Nilai kiri < root ,Nilai kanan > root
Akibatnya:
Pencarian tidak perlu cek semua node
Bisa langsung “menyempitkan” ke kiri atau kanan
Jadi lebih cepat (mirip konsep pencarian biner / binary search) dibanding binary tree biasa yang tidak terurut.

2.Atribut ini digunakan untuk:
left : menunjuk ke anak kiri
right : menunjuk ke anak kanan
Ini yang membentuk struktur tree bercabang, bukan linear seperti linked list.

3.a.root adalah:
Node paling atas (awal dari tree)
Titik awal semua operasi (add, find, traversal)

b.Nilainya = null (kosong)
Karena belum ada node yang dimasukkan ke tree.

4.Prosesnya:
Dicek: root == null
Karena kosong → node baru langsung jadi root
Jadi node pertama selalu menjadi root.

5.Penjelasannya:
Jika IPK lebih kecil → masuk ke kiri
Jika lebih besar → ke kanan
Proses diulang sampai ketemu posisi kosong
Ini yang menjaga struktur BST tetap terurut.

6.Langkah delete node dengan 2 child:

Cari node yang mau dihapus
Cari successor (pengganti)
Biasanya node terkecil di subtree kanan
Ganti nilai node yang dihapus dengan successor
Hapus node successor dari posisi lamanya
Peran getSuccessor()
Mencari node pengganti yang tepat
Menjaga struktur BST tetap valid
Kenapa successor?
Karena dia adalah nilai terkecil di kanan, jadi tetap memenuhi aturan BST.


## 14.3 Kegiatan Praktikum 2
## Implementasi Binary Tree dengan Array (45 Menit)
## 14.3.1 Tahapan Percobaan
<img width="481" height="627" alt="Cuplikan layar 2026-06-02 212758" src="https://github.com/user-attachments/assets/fe72b1f6-7967-4e75-b690-ebdfe0291261" />
<img width="303" height="97" alt="Cuplikan layar 2026-06-02 212806" src="https://github.com/user-attachments/assets/f93939d3-7586-48f1-acb1-96f406b5aef3" />


## Kode program
<img width="718" height="629" alt="Cuplikan layar 2026-06-02 210238" src="https://github.com/user-attachments/assets/c4ac5d20-9d21-4f16-90ed-8042faa52c0c" />
<img width="985" height="386" alt="Cuplikan layar 2026-06-02 210257" src="https://github.com/user-attachments/assets/74767059-29fb-42f3-9baf-0596f0c4bc1b" />

## Hasil Running
<img width="497" height="187" alt="Cuplikan layar 2026-06-02 210226" src="https://github.com/user-attachments/assets/ff8a2509-4eb1-4626-b6dd-00cfd5fb20c2" />


## 14.3.2 Pertanyaan Percobaan
<img width="474" height="146" alt="Cuplikan layar 2026-06-02 212812" src="https://github.com/user-attachments/assets/b508e6cd-968d-4f29-9626-d8c526dafb56" />


### jawaban
1.data : untuk menyimpan semua node tree dalam bentuk array
idxLast : menyimpan indeks terakhir yang terisi dalam array

2.Method ini digunakan untuk:
Mengisi array data dengan nilai-nilai node tree
Biasanya diisi langsung dari main

3.Method ini untuk:
Menampilkan isi tree dengan urutan:
Left ke Root ke Right
Hasilnya:
Data akan tampil terurut (ascending) jika struktur mengikuti BST

4.Rumus:
Left child = 2 * i + 1
Right child = 2 * i + 2
Jika i = 2:
Left = 2*2 + 1 = 5
Right = 2*2 + 2 = 6
Jadi:
kiri = indeks 5
kanan = indeks 6

5.Artinya:
Data terakhir ada di indeks ke-6
Jumlah node = 7 (karena mulai dari indeks 0)

6.Karena:
Representasi binary tree dalam array mengikuti pola:
Parent di indeks i
Left di 2*i+1
Right di 2*i+2

## 14.4 Tugas Praktikum
<img width="460" height="219" alt="Cuplikan layar 2026-06-02 212817" src="https://github.com/user-attachments/assets/59466717-4707-4cae-b989-237d6eb38928" />


## kode program
<img width="680" height="826" alt="Cuplikan layar 2026-06-02 212117" src="https://github.com/user-attachments/assets/b103b914-5365-4e2d-af44-10e455a4468d" />
<img width="604" height="784" alt="Cuplikan layar 2026-06-02 212127" src="https://github.com/user-attachments/assets/0783c660-3fd0-4f02-8040-1f34a59221fc" />
<img width="609" height="491" alt="Cuplikan layar 2026-06-02 212139" src="https://github.com/user-attachments/assets/db357377-0cee-4649-a774-f268c280043e" />
<img width="512" height="252" alt="Cuplikan layar 2026-06-02 212153" src="https://github.com/user-attachments/assets/a492c08e-c680-410c-948e-b03b1ed2f2a6" />

## hasil running
<img width="479" height="273" alt="Cuplikan layar 2026-06-02 212052" src="https://github.com/user-attachments/assets/8feed5b2-4185-48f2-bd31-c9e1d95df3f4" />

