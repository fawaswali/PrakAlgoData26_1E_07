# LAPORAN PRAKTIKUM ALGORITMA DAN STRUKTUR DATA
# JOBSHEET 12 DOUBLE Linked List

## Nama: Fawas Saqif Abdullohil Wali
## NIM:254107020037
## Kelas:TI-1E
## No Absen:07

## 12.2 Percobaan 1: Operasi Penambahan pada Double Linked List
<img width="582" height="606" alt="Cuplikan layar 2026-05-17 105919" src="https://github.com/user-attachments/assets/4a1f0f83-f2dc-4370-8b6f-744f4a53e550" />
<img width="516" height="699" alt="Cuplikan layar 2026-05-17 105931" src="https://github.com/user-attachments/assets/14926d65-d354-4a79-8ad3-90600e3234cd" />
<img width="527" height="698" alt="Cuplikan layar 2026-05-17 105940" src="https://github.com/user-attachments/assets/2ed73a2e-b78f-43d2-9317-28ac1ca949cd" />
<img width="505" height="605" alt="Cuplikan layar 2026-05-17 105948" src="https://github.com/user-attachments/assets/bbd5d848-d07a-49dd-a578-8fb9bab512b2" />
<img width="484" height="680" alt="Cuplikan layar 2026-05-17 105956" src="https://github.com/user-attachments/assets/ab0769f2-a1bf-441e-966d-4f681754dc47" />
<img width="524" height="694" alt="Cuplikan layar 2026-05-17 110005" src="https://github.com/user-attachments/assets/80a66bef-8767-4ac4-a728-c62001d19828" />
<img width="522" height="257" alt="Cuplikan layar 2026-05-17 110016" src="https://github.com/user-attachments/assets/1f588895-a235-4194-b4c1-b03aa3cb2c21" />

## Kode Program
<img width="806" height="605" alt="Cuplikan layar 2026-05-17 095700" src="https://github.com/user-attachments/assets/0c4905ba-82ea-4fd4-b7a8-236c525b5290" />
<img width="462" height="362" alt="Cuplikan layar 2026-05-17 095708" src="https://github.com/user-attachments/assets/fb6dab5f-b7ea-40c1-8d9c-6e6ffe990f37" />
<img width="714" height="679" alt="Cuplikan layar 2026-05-17 095721" src="https://github.com/user-attachments/assets/279552e1-a1ac-4bd0-b131-95f9475df680" />
<img width="806" height="812" alt="Cuplikan layar 2026-05-17 095732" src="https://github.com/user-attachments/assets/c2c24094-676f-4e83-a6f6-7325197652e5" />
<img width="804" height="796" alt="Cuplikan layar 2026-05-17 095751" src="https://github.com/user-attachments/assets/2296f0c9-525c-49de-b395-aebcceeebdac" />
<img width="807" height="564" alt="Cuplikan layar 2026-05-17 095759" src="https://github.com/user-attachments/assets/12c5dfe2-a971-4744-86cb-878c29a0beeb" />
<img width="884" height="856" alt="Cuplikan layar 2026-05-17 095811" src="https://github.com/user-attachments/assets/a77656f8-3d40-4d83-a9c4-f899ee0f8e9a" />
<img width="787" height="791" alt="Cuplikan layar 2026-05-17 095826" src="https://github.com/user-attachments/assets/faea5c40-784d-4eb6-bae5-d1987a650260" />
<img width="630" height="424" alt="Cuplikan layar 2026-05-17 095833" src="https://github.com/user-attachments/assets/ca07c05c-38de-4fc4-b8c6-72b125765140" />

## Hasil running
<img width="492" height="677" alt="Cuplikan layar 2026-05-17 094354" src="https://github.com/user-attachments/assets/af00b5d4-599e-46b6-b1dd-dc3d9678498b" />
<img width="424" height="600" alt="Cuplikan layar 2026-05-17 094411" src="https://github.com/user-attachments/assets/f8cda08d-4afe-44c2-9a45-e1ecb8ebe130" />

## 12.2.3 Pertanyaan
<img width="496" height="286" alt="Cuplikan layar 2026-05-17 110025" src="https://github.com/user-attachments/assets/3b245fb2-e571-4fe4-bd2d-c86912dadc9f" />

1.Single Linked List:
Hanya punya 1 pointer : next,
Traversal hanya bisa maju (head : tail),
Lebih hemat memori

Double Linked List:
Punya 2 pointer : next dan prev,
Traversal bisa maju & mundur
Lebih fleksibel tapi pakai memori lebih banyak

2.next : menunjuk ke node berikutnya
prev : menunjuk ke node sebelumnya
Fungsinya:
Memudahkan traversal dua arah
Mempermudah operasi:
sisip (insert)
hapus (remove)

3.Menginisialisasi linked list dalam keadaan kosong,
Menandakan belum ada node (head & tail = null)

4.Karena:

Saat node pertama ditambahkan:
dia jadi awal (head)
sekaligus jadi akhir (tail)
Jadi:
hanya ada 1 node
head dan tail harus menunjuk node yang sama

5.<img width="589" height="273" alt="Cuplikan layar 2026-05-17 102325" src="https://github.com/user-attachments/assets/810f5023-e96f-4059-a9e1-515e990a85b8" />

6.<img width="592" height="282" alt="Cuplikan layar 2026-05-17 102353" src="https://github.com/user-attachments/assets/74f4a07b-73a9-4c3f-abfd-bf1c44ae60a3" />

## 12.3 Percobaan 2: Operasi Penghapusan pada Double Linked List
<img width="547" height="183" alt="Cuplikan layar 2026-05-17 110219" src="https://github.com/user-attachments/assets/cce4338d-451c-43ed-ac0b-07ce51802415" />
<img width="532" height="698" alt="Cuplikan layar 2026-05-17 110229" src="https://github.com/user-attachments/assets/e030abb7-97b7-4a6e-b946-ffebb4ed94b7" />
<img width="477" height="184" alt="Cuplikan layar 2026-05-17 110239" src="https://github.com/user-attachments/assets/f5fd1a3b-e6e5-4408-aa5c-021eab37aebf" />

## kode program
<img width="597" height="655" alt="Cuplikan layar 2026-05-17 103722" src="https://github.com/user-attachments/assets/dd07ce43-14b0-4df7-8859-1a429d8b547a" />

## hasil running
<img width="409" height="541" alt="Cuplikan layar 2026-05-17 103707" src="https://github.com/user-attachments/assets/0aac97f9-fd45-4663-ae4f-a6828425b324" />

## 12.3.3 Pertanyaan Percobaan
<img width="483" height="120" alt="Cuplikan layar 2026-05-17 110244" src="https://github.com/user-attachments/assets/5c571290-71e0-41ef-8ece-0b130cf50762" />

1.head = head.next;
 Menggeser head ke node berikutnya
 Artinya node pertama yang lama sudah tidak dipakai (terhapus)
 
head.prev = null;
 Menghapus hubungan ke node sebelumnya Supaya node baru di depan tidak punya prev (karena dia jadi head)

2.<img width="620" height="817" alt="Cuplikan layar 2026-05-17 104031" src="https://github.com/user-attachments/assets/8e9ba5c6-fb38-4cbf-ac1c-74e6533387cc" />
<img width="406" height="324" alt="Cuplikan layar 2026-05-17 104146" src="https://github.com/user-attachments/assets/83151a28-96e0-42ae-88a4-7ccf299bd77b" />


## 12.5 Tugas Praktikum
1. Tambahkan method add(int index, Mahasiswa data) untuk menambahkan node pada indeks
tertentu!
2. Tambahkan method removeAfter() untuk menghapus node setelah node yang memiliki data
key tertentu!
3. Tambahkan method remove(int index) untuk menghapus node pada indeks tertentu!
4. Tambahkan method:
a. getFirst()
b. getLast()
c. getIndex()
untuk menampilkan data pada node pertama, node terakhir, dan node pada indeks tertentu.
5. Tambahkan atribut dan method untuk menghitung jumlah data (size) pada Double Linked List.
<img width="663" height="713" alt="Cuplikan layar 2026-05-17 105402" src="https://github.com/user-attachments/assets/37e54fff-5773-435c-be9a-952c6d1c7980" />
<img width="586" height="776" alt="Cuplikan layar 2026-05-17 105414" src="https://github.com/user-attachments/assets/b2368ef0-dd24-4c36-a57f-fc06e7d49eda" />
<img width="817" height="795" alt="Cuplikan layar 2026-05-17 105429" src="https://github.com/user-attachments/assets/65f5ed8f-a5d7-4d08-a0b6-4ddcb5e87f56" />
<img width="806" height="794" alt="Cuplikan layar 2026-05-17 105445" src="https://github.com/user-attachments/assets/2e6ed1f8-f2a9-4a2a-b1ab-ff64dd93a18f" />
<img width="831" height="816" alt="Cuplikan layar 2026-05-17 105456" src="https://github.com/user-attachments/assets/60bd2a05-2cb7-4cac-a20e-ae0e964e30a3" />
<img width="732" height="772" alt="Cuplikan layar 2026-05-17 105506" src="https://github.com/user-attachments/assets/caa513e0-aba3-45c0-8a05-38172c7e9819" />
<img width="697" height="727" alt="Cuplikan layar 2026-05-17 105517" src="https://github.com/user-attachments/assets/fc1e04a4-7736-4c2f-a7d8-6210b5c592ff" />
<img width="828" height="800" alt="Cuplikan layar 2026-05-17 105528" src="https://github.com/user-attachments/assets/9cec9de1-a695-4ba8-a6a9-9e2d867328be" />
<img width="671" height="476" alt="Cuplikan layar 2026-05-17 105535" src="https://github.com/user-attachments/assets/d9082844-d63a-4376-a846-d15f05f0497d" />
<img width="883" height="717" alt="Cuplikan layar 2026-05-17 105548" src="https://github.com/user-attachments/assets/0ca41e32-beb7-4884-b413-063a59953364" />
<img width="784" height="805" alt="Cuplikan layar 2026-05-17 105602" src="https://github.com/user-attachments/assets/e94739e2-37bd-49c8-8ccf-144cfbe508aa" />
<img width="814" height="802" alt="Cuplikan layar 2026-05-17 105611" src="https://github.com/user-attachments/assets/366c1a69-79bd-4ec2-a7e1-bb071357b897" />
<img width="734" height="807" alt="Cuplikan layar 2026-05-17 105623" src="https://github.com/user-attachments/assets/c1074a39-7871-4c22-8b5b-69d48c3630c1" />
<img width="692" height="241" alt="Cuplikan layar 2026-05-17 105630" src="https://github.com/user-attachments/assets/385bec40-da28-4e4d-bf30-92163227d744" />

