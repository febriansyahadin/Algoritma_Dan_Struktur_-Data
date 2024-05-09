## Laporan praktikum joobsheet 10

## 10.2 Praktikum 1

## 10.2.2 Verifikasi Hasil Percobaan
<img src = "image.png">

## 10.2.3 Pertanyaan
1. Pada konstruktor, mengapa nilai awal atribut front dan rear bernilai -1, sementara atribut size 
bernilai 0?
Front dan rear bernilai -1 supaya tidak mengarah pada index array apapun, dan size bernilai 0 karena saat inisialisasi arraynya masih kosong.
2. Pada method Enqueue, jelaskan maksud dan kegunaan dari potongan kode berikut!

    <img src ="image-4.png">

    untuk melakukan pengecekan apakah posisi terakhir dalam antrian sudah mencapai batas maksimum.

3. Pada method Dequeue, jelaskan maksud dan kegunaan dari potongan kode berikut!

    <img src="image-5.png">

    untuk mengatur ulang front ketika elemen pertama diambil, dan jika front sama dengan max-1 berarti sudah sampe di akhir array maka front diatur ulang ke 0.

4. Pada method print, mengapa pada proses perulangan variabel i tidak dimulai dari 0 (int i=0), 
melainkan int i=front?

    Karena posisi front tidak selalu berada pada index 0, index dari front selalu berubah-ubah jika dilakukan pengambilan data.

5. Perhatikan kembali method print, jelaskan maksud dari potongan kode berikut!

    <img src="image-6.png">



6. Tunjukkan potongan kode program yang merupakan queue overflow!

<img src ="image-7.png">

7. Pada saat terjadi queue overflow dan queue underflow, program tersebut tetap dapat berjalan dan hanya menampilkan teks informasi. Lakukan modifikasi program sehingga pada saat terjadi queue overflow dan queue underflow, program dihentikan!

<img src="image-8.png">

<img src="image-9.png">


## 10.3 Praktikum 2

## 10.3.2 Verifikasi Hasil Percobaan
<img src ="image-1.png">

## 10.3.3 Pertanyaan
1. Pada class QueueMain, jelaskan fungsi IF pada potongan kode program berikut!
<img src="image-2.png">

memeriksa data norek, nama, dan alamat tidak kosong (!"") dan data umur dan saldo tidak sama dengan 0. jika kondisi tersebut terpenuhi maka output akan mengeluarkan data antrian yang keluar dari Queue

2. Lakukan modifikasi program dengan menambahkan method baru bernama peekRear pada class Queue yang digunakan untuk mengecek antrian yang berada di posisi belakang! Tambahkan pula daftar menu 5. Cek Antrian paling belakang pada class QueueMain sehingga method peekRear
dapat dipanggil!

<img src="image-10.png">
<img src ="image-11.png">

<img src ="image-12.png">


## 10.4 Tugas
1. Buatlah program antrian untuk mengilustasikan pesanan disebuah warung. Ketika seorang pembeli akan mengantri, maka dia harus mendaftarkan nama, dan nomor HP seperti yang digambarkan pada Class diagram berikut
<img src ="image-3.png">

Keterangan:
• Method create(), isEmpty(), isFull(), enqueue(), dequeue() dan print(), kegunaannya sama seperti yang telah dibuat pada Praktikum

• Method peek(): digunakan untuk menampilkan data Pembeli yang berada di posisi antrian paling 
depan

• Method peekRear(): digunakan untuk menampilkan data Pembeli yang berada di posisi antrian paling belakang

• Method peekPosition(): digunakan untuk menampilkan seorang pembeli (berdasarkan nama)posisi antrian ke berapa

• Method daftarPembeli(): digunakan untuk menampilkan data seluruh pembeli

Hasil run

<img src="image-13.png">

<img src="image-14.png">