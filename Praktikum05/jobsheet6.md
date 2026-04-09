# Laporan Praktikum Algoritma dan Struktur Data JOBSHEET VI SEARCHING
## Nama: Fawas Saqif Abdullohil Wali
## NIM:254107020037
## Kelas:TI-1E
## No Absen:07

<img width="603" height="725" alt="Cuplikan layar 2026-04-09 213912" src="https://github.com/user-attachments/assets/f4c815c9-8686-4e1e-8c28-006c52e8b1be" />

### 6.2.1. Langkah-langkah Percobaan Sequential Search
<img width="527" height="725" alt="Cuplikan layar 2026-04-09 214040" src="https://github.com/user-attachments/assets/3d648dea-6433-40d8-adb8-2a31d9fe78ce" />
<img width="512" height="711" alt="Cuplikan layar 2026-04-09 214119" src="https://github.com/user-attachments/assets/ce3bc5c9-3602-4a40-9e38-e32b6b3dff57" />
<img width="484" height="676" alt="Cuplikan layar 2026-04-09 214130" src="https://github.com/user-attachments/assets/ef3746f7-ddbb-43e2-bfe8-42cd1a283e2f" />

### hasil code
<img width="966" height="824" alt="Cuplikan layar 2026-04-09 213058" src="https://github.com/user-attachments/assets/1675bc29-1c97-43e0-a4ff-251e467bf4a2" />
<img width="722" height="355" alt="Cuplikan layar 2026-04-09 213017" src="https://github.com/user-attachments/assets/d32c7025-4d5c-4993-88f5-b8447eac752c" />
<img width="775" height="753" alt="Cuplikan layar 2026-04-09 213001" src="https://github.com/user-attachments/assets/a97b690b-02ab-4e1e-a197-382045343d4d" />

### hasil output
<img width="374" height="661" alt="Cuplikan layar 2026-04-09 212740" src="https://github.com/user-attachments/assets/d139eeeb-2ddb-4520-8e9d-4836a85d77e4" />
<img width="439" height="709" alt="Cuplikan layar 2026-04-09 212813" src="https://github.com/user-attachments/assets/65bb0e9a-d376-4323-9402-47ff9e37445f" />
<img width="515" height="250" alt="Cuplikan layar 2026-04-09 212824" src="https://github.com/user-attachments/assets/119af424-4398-4173-9432-2fdea27e2cd3" />

### 6.2.3 pertanyaan

<img width="503" height="270" alt="Cuplikan layar 2026-04-09 214512" src="https://github.com/user-attachments/assets/a820465e-5270-47d6-95c1-bbab8dfdd225" />

1. tampildatasearch menampilkan isi data mahasiswa sedangkan tampilposisi Menampilkan letak/index data dalam array
2. fungsinya untuk menghentikan perulangan saat data ditemukan supaya tidak lanjut ke data berikutnya
3. fungsinya adalah untuk menyimpan indeks data yang ditemukan
4. Jika ada lebih dari satu data sama Program akan menampilkan data pertama yang ditemukan
5. Jika break dihapus maka Yang akan terjadi adalah loop tetap jalan sampai akhir dan posisi akan berisi data terakhir yang sama

### 6.3. Searching/ Pencarian Menggunakan Algoritma Binary Search
### 6.3.1. Langkah-langkah Percobaan Binary Search

<img width="500" height="389" alt="Cuplikan layar 2026-04-09 221819" src="https://github.com/user-attachments/assets/c64aa6dc-d756-4ec9-9d8b-260bdc9500e4" />

<img width="536" height="709" alt="Cuplikan layar 2026-04-09 221831" src="https://github.com/user-attachments/assets/f043b2df-166f-4cc9-9723-fecad01dc185" />

<img width="486" height="458" alt="Cuplikan layar 2026-04-09 221849" src="https://github.com/user-attachments/assets/5d7025bc-d6ae-4646-a274-2223e78219a6" />


### hasil code
<img width="591" height="432" alt="Cuplikan layar 2026-04-09 223336" src="https://github.com/user-attachments/assets/c008596b-9fac-4ca8-9336-36938d13e752" />
<img width="667" height="389" alt="Cuplikan layar 2026-04-09 223321" src="https://github.com/user-attachments/assets/aae9a1e4-616a-447a-8327-a56274710a8b" />

### hasil output
<img width="407" height="662" alt="Cuplikan layar 2026-04-09 223211" src="https://github.com/user-attachments/assets/b5ecd40a-0840-4ddf-870a-62f777b69682" />
<img width="408" height="554" alt="Cuplikan layar 2026-04-09 223231" src="https://github.com/user-attachments/assets/d80b99eb-89ee-4a7d-a238-3f8c36e45b99" />
<img width="513" height="307" alt="Cuplikan layar 2026-04-09 223245" src="https://github.com/user-attachments/assets/769e61bb-a2a0-456c-86ab-c92ea784e1ef" />


### 6.3.3. Pertanyaan
1. Tunjukkan pada kode program yang mana proses divide dijalankan!

   jawaban: mid = (left + right) / 2;
   
2. Tunjukkan pada kode program yang mana proses conquer dijalankan!

   jawaban:
   <img width="473" height="154" alt="Cuplikan layar 2026-04-09 223905" src="https://github.com/user-attachments/assets/312544c5-b240-445c-a88d-8256623ee40f" />

   
3. Apa fungsi left, right, dan mid?

  jawaban:left:batas kiri pencarian,right:batas kanan pencarian,mid:posisi tengah (pembagi array).Ketiganya dipakai untuk mempersempit area pencarian
   
4. Jika data IPK yang dimasukkan tidak urut. Apakah program masih dapat berjalan? Mengapa
demikian?

jawaban: Binary search tidak akan bekerja dengan benar Karena algoritma mengasumsikan data sudah terurut.kalau tidak, hasil bisa salah atau tidak ditemukan

5. Jika IPK yang dimasukkan dari IPK terbesar ke terkecil (misal: 3.8, 3.7, 3.5, 3.4, 3.2) dan elemen
yang dicari adalah 3.2. Bagaimana hasil dari binary search? Apakah sesuai? Jika tidak sesuai maka
ubahlah kode program binary seach agar hasilnya sesuai

jawaban: <img width="474" height="184" alt="Cuplikan layar 2026-04-09 225422" src="https://github.com/user-attachments/assets/c72f62c7-ce60-4a03-9b52-f5f70afd86fd" />


6. Jelaskan bagaimana binary search menentukan bahwa data yang dicari tidak ditemukan di dalam
array.

jawaban:Terjadi saat:

if (right >= left)

Jika kondisi ini tidak terpenuhi
artinya:

return -1;

artinya semua data sudah dicektidak ditemukan

7. Modifikasi program di atas yang mana jumlah mahasiswa yang diinputkan sesuai dengan masukan
dari keyboard.

jawaban: <img width="646" height="129" alt="Cuplikan layar 2026-04-09 225452" src="https://github.com/user-attachments/assets/39cb96f3-abd8-4445-b0f2-21e1ec6a92d9" />
