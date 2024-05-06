## Laporan praktikum Jobsheet 12

## 2.1.1 Verifikasi Hasil Percobaan 
<img src = "image.png">

## 2.1.2 Pertayaan 
1. Mengapa hasil compile kode program di baris pertama menghasilkan “Linked List Kosong”?

2. Jelaskan kegunaan variable temp secara umum pada setiap method!
variable temp digunakan sebagai node sementara untuk melakukan operasi pada setiap node pada linked list, seperti menemukan node tertentu, menambahkan node baru setelah node tertentu, atau melakukan iterasi pada setiap node.
3. Perhatikan class SingleLinkedList, pada method insertAt Jelaskan kegunaan kode berikut
<img src ="image-1.png">
jadi, baris kode if (temp.next.next == null) { tail = temp.next; } bertanggung jawab untuk mempertahankan referensi tail ketika sebuah node baru dimasukkan di akhir linked list. Kode ini memastikan bahwa referensi tail selalu menunjuk ke node terakhir, sehingga memungkinkan operasi yang efisien yang melibatkan akhir dari linked list.

