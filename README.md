# PRAKTIKUM PEMROGRAMAN BERORIENTASI OBJEK 4


Nama: Bening Aqilla Fakhrun Nissa
NIM: L0325018
Kelas: 3A

---

## Deskripsi Program
Program **Sistem Manajemen Aset IT** merupakan aplikasi berbasis console (CLI) yang dibuat dengan bahasa **Java**. Program ini dirancang untuk memenuhi **Tugas Praktikum 4** dengan tujuan mengimplementasikan konsep **Java Collections Framework**, khususnya penggunaan `ArrayList`, `LinkedList`, `For-Each` dan `Iterator` dalam mengelola sekumpulan objek yang bersifat dinamis.

Program ini mensimulasikan proses **CRUD (Create, Read, Delete)** pada data aset IT perusahaan, seperti Server, Router, Switch, dan PC.

---

## Struktur Program

```
praktikum4.tugas/
├── AsetIT.java
├── ManajemenAset.java
└── MainAset.java

```
<img width="266" height="95" alt="strukturProgram" src="https://github.com/user-attachments/assets/286fef4a-3f7b-453d-8f1f-858d96c968e8" />

Pada program ini, struktur program terdiri dari tiga file Java yang saling berkaitan, yaitu `AsetIT.java`, `ManajemenAset.java`, dan `MainAset.java`.

File `AsetIT.java` berisi class `AsetIT` yang berfungsi sebagai cetak biru (blueprint) untuk membuat objek aset IT. Di dalam class ini terdapat atribut, constructor, dan method yang digunakan untuk mengelola data aset.

File `ManajemenAset.java` berisi class `ManajemenAset` yang berfungsi sebagai pengelola kumpulan objek aset. Di dalam class ini terdapat sebuah `ArrayList` bernama `daftarAset`, serta beberapa method untuk menjalankan operasi CRUD (Create, Read, Delete).

File `MainAset.java` berisi method `main()` yang berfungsi sebagai titik awal eksekusi program. Di dalam file inilah objek-objek dari class `AsetIT` dibuat dan method-methodnya dipanggil untuk menjalankan program.

---

## Kelas AsetIT
Kelas `AsetIT` berisikan atribut yang mencakup data aset IT seperti `idAset`, `namaPerangkat`, `lokasi`, dan `statusKondisi`, serta constructor dan method untuk mengelola data tersebut.

<img width="342" height="188" alt="image" src="https://github.com/user-attachments/assets/470e8c3d-8742-455a-95ff-69c7a55f7a4a" /> 

Keempat atribut tersebut berfungsi untuk menyimpan data aset IT. Semua atribut, yaitu `idAset`, `namaPerangkat`, `lokasi`, dan `statusKondisi`, bertipe data String untuk menyimpan teks. Atribut `idAset` digunakan sebagai identitas unik setiap aset, `namaPerangkat` menyimpan nama perangkat, `lokasi` menyimpan tempat penempatan aset, dan `statusKondisi` menyimpan keterangan kondisi aset seperti "Baik" atau "Rusak". Atribut-atribut ini belum memiliki nilai saat dibuat dan akan diisi melalui constructor.

Constructor dalam kelas `AsetIT` dibuat dalam satu bentuk (parameterized constructor) untuk memberikan nilai pada objek saat objek tersebut dibuat.

<img width="992" height="165" alt="image" src="https://github.com/user-attachments/assets/0628ff87-d04d-4aaa-ac65-ce349f191e68" />

Constructor ini menerima empat parameter, yaitu `idAset`, `namaPerangkat`, `lokasi`, dan `statusKondisi`. Pada constructor ini, keempat atribut tersebut akan diisi sesuai dengan nilai yang diberikan saat objek dibuat. Constructor ini cocok digunakan ketika seluruh data aset sudah tersedia sejak awal, sehingga objek `AsetIT` langsung memiliki nilai yang lengkap tanpa perlu diisi satu per satu setelah dibuat.

Selain constructor, kelas `AsetIT` juga memiliki sebuah method, yaitu `tampilkanInfoAset()` yang berfungsi untuk menampilkan seluruh data aset ke layar.

<img width="1072" height="115" alt="image" src="https://github.com/user-attachments/assets/2bd1ad96-dccf-462e-9bdb-259ed67c4eeb" />

Method ini tidak menerima parameter apapun dan tidak mengembalikan nilai, bertipe `void`. Di dalam method ini, seluruh atribut aset digabungkan menggunakan operator `+` dan dipisahkan dengan tanda pipe `(|)`, lalu dicetak ke layar menggunakan `System.out.println()`. Method ini berguna untuk menampilkan informasi setiap aset dengan format `idAset | namaPerangkat | lokasi | statusKondisi`, sehingga data aset dapat dibaca dengan rapi dan mudah dipahami.

---

## Kelas ManajemenAset

Kelas ManajemenAset berisikan sebuah ArrayList yang mencakup kumpulan objek AsetIT, serta beberapa method untuk mengelola data tersebut.

<img width="561" height="187" alt="image" src="https://github.com/user-attachments/assets/8baa75fe-e093-47c0-a66a-ca595e2a0de5" />

Terdapat tiga import yang digunakan, yaitu `ArrayList`, `Iterator`, dan `List`. Import `ArrayList` dan `List` digunakan untuk membuat koleksi data bertipe list, sedangkan import `Iterator` digunakan untuk menelusuri dan menghapus elemen di dalam list secara aman.

Atribut `daftarAset` bertipe `List<AsetIT>` dan diinstansiasi menggunakan `ArrayList`. Atribut ini berfungsi untuk menampung seluruh objek `AsetIT` yang telah dibuat. Penggunaan `ArrayList` dipilih karena ukurannya bersifat dinamis, sehingga dapat bertambah atau berkurang sesuai kebutuhan.

Method pertama dalam kelas ini adalah tambahAset() yang berfungsi untuk menambahkan objek baru ke dalam list.

<img width="606" height="83" alt="image" src="https://github.com/user-attachments/assets/b3207bd8-0b4d-4dc9-a5cc-41c425496f95" />

Method ini menerima satu parameter bertipe `AsetIT`, lalu menambahkannya ke dalam `daftarAset` menggunakan method `add()`. Method ini digunakan ketika ada data aset baru yang ingin dimasukkan ke dalam sistem.

Method kedua adalah tampilkanSemuaAset() yang berfungsi untuk menampilkan seluruh data aset menggunakan For-Each Loop.

<img width="727" height="225" alt="image" src="https://github.com/user-attachments/assets/3cf60073-fa10-4b68-a03d-a8c439ab87d4" />

Method ini tidak menerima parameter apapun dan tidak mengembalikan nilai, bertipe `void`. Sebelum melakukan perulangan, method ini terlebih dahulu memeriksa apakah `daftarAset` kosong menggunakan method `isEmpty()`. Jika list kosong, program akan menampilkan pesan "Data aset kosong." ke layar dan langsung keluar dari method menggunakan `return`, sehingga For-Each Loop tidak dijalankan. Namun jika list berisi data, For-Each Loop akan dijalankan untuk menampilkan setiap objek `AsetIT` dengan memanggil method `tampilkanInfoAset()`. Pengecekan `isEmpty()` ini berguna untuk mencegah tampilan yang kosong tanpa keterangan, sekaligus memberikan informasi yang jelas kepada pengguna ketika belum ada data aset yang tersimpan.

Method ketiga adalah hapusAset() yang berfungsi untuk menghapus aset berdasarkan idAset menggunakan Iterator.

<img width="968" height="431" alt="image" src="https://github.com/user-attachments/assets/36b85a2a-d248-4f20-90c8-9234375a1c03" />

Method ini menerima satu parameter berupa `idAset` yang akan dicari. Di awal method, dibuat sebuah objek `Iterator` dari `daftarAset` menggunakan method `iterator()`. Selain itu, terdapat variabel `ditemukan` bertipe `boolean` yang diinisialisasi dengan nilai `false`, yang berfungsi sebagai penanda apakah ID yang dicari berhasil ditemukan atau tidak.

Selanjutnya, dilakukan perulangan `while` dengan kondisi `it.hasNext()` untuk menelusuri setiap elemen di dalam list satu per satu. Setiap elemen diambil menggunakan `it.next()` dan disimpan dalam variabel `asetSekarang`. Jika `idAset` dari aset tersebut sama dengan `idAset` yang dicari (dibandingkan menggunakan method `equals()`), maka objek akan dihapus dari list menggunakan `it.remove()`, variabel `ditemukan` diubah menjadi `true`, program menampilkan pesan berhasil ke layar, lalu keluar dari perulangan menggunakan `break`.

Setelah perulangan selesai, dilakukan pengecekan apakah `ditemukan` masih bernilai `false`. Jika ya, artinya ID yang dicari tidak ada di dalam list, sehingga program menampilkan pesan peringatan ke layar. Penggunaan Iterator dipilih karena merupakan cara yang aman untuk menghapus elemen di tengah iterasi, sehingga terhindar dari error `ConcurrentModificationException`.

---

## Kelas MainAset

Kelas `MainAset` berisikan method `main()` yang berfungsi sebagai titik awal eksekusi program, serta skenario pengujian untuk mengelola data aset IT.

<img width="608" height="141" alt="image" src="https://github.com/user-attachments/assets/5dac21e8-fb2b-4bcb-aa8a-32ef40d49723" />

Pada awal program, dilakukan instansiasi objek `ManajemenAset` yang akan digunakan untuk mengelola seluruh data aset. Objek ini disimpan dalam variabel `manajemen` agar dapat diakses di sepanjang method `main()`.

Selanjutnya, ditambahkan empat data aset IT ke dalam list menggunakan method `tambahAset()`.

<img width="987" height="113" alt="image" src="https://github.com/user-attachments/assets/f063f334-b4c1-48b3-9464-2bb2d40cd4bd" />

Keempat objek AsetIT dibuat langsung sebagai argumen method `tambahAset()`. Setiap objek memiliki ID, nama perangkat, lokasi, dan status kondisi yang berbeda-beda.

Setelah data ditambahkan, seluruh data aset ditampilkan untuk memastikan data berhasil masuk.

<img width="801" height="85" alt="image" src="https://github.com/user-attachments/assets/52e62524-6e9b-41af-9359-b10f14688b7e" />

Selanjutnya, salah satu aset dihapus menggunakan ID yang valid, yaitu BA03.

<img width="847" height="71" alt="image" src="https://github.com/user-attachments/assets/f5b2ca3f-b676-4973-ad90-2aacc06844ba" />

Terakhir, seluruh data aset ditampilkan kembali untuk membuktikan bahwa penghapusan berhasil dilakukan.

<img width="920" height="110" alt="image" src="https://github.com/user-attachments/assets/4a049094-4bea-42e4-bf4e-4a292765c7dd" />

Skenario pengujian ini mencakup operasi CRUD dasar, yaitu Create (menambah data), Read (menampilkan data), dan Delete (menghapus data).

---

## Hasil Eksekusi Program

Setelah program dieksekusi, layar menampilkan tiga bagian output data aset IT yang masing-masing merupakan hasil dari tahapan yang telah dijalankan.

<img width="327" height="122" alt="image" src="https://github.com/user-attachments/assets/dec2567d-8096-48e4-a0c9-447fb72bafb2" />

Pada bagian awal eksekusi, program menampilkan judul "Data Aset IT Awal" yang diikuti oleh empat baris data aset, yaitu Server Dell (BA01) yang berada di Ruang Server dengan kondisi Baik, Router Cisco (BA02) yang berada di Ruang Jaringan dengan kondisi Baik, Switch TP-Link (BA03) yang berada di Ruang Staff dengan kondisi Rusak, dan PC Lenovo (BA04) yang berada di Ruang Desain dengan kondisi Baik. Setiap baris ditampilkan dengan format `idAset | namaPerangkat | lokasi | statusKondisi`, sehingga seluruh informasi aset dapat dibaca dengan rapi. Hal ini menunjukkan bahwa method `tambahAset()` dan `tampilkanSemuaAset()` berhasil dijalankan dengan baik.

<img width="392" height="47" alt="image" src="https://github.com/user-attachments/assets/d59cf158-47bf-422a-aba7-2d587257c8eb" />

Pada bagian selanjutnya, program menampilkan judul "Menghapus aset (ID: BA03)" yang diikuti dengan pesan "Aset dengan ID BA03 berhasil dihapus.". Pesan ini muncul karena method `hapusAset()` berhasil menemukan objek dengan ID `BA03` di dalam list, lalu menghapusnya menggunakan Iterator. Hal ini menunjukkan bahwa proses penghapusan berjalan dengan sukses dan data aset telah diperbarui.

<img width="413" height="86" alt="image" src="https://github.com/user-attachments/assets/81de8fe6-b7a4-4b04-83ac-f590d74df846" />

Pada bagian akhir, program menampilkan judul "Data Aset IT Setelah Penghapusan" yang diikuti oleh tiga baris data aset, yaitu Server Dell (BA01) dengan kondisi Baik, Router Cisco (BA02) dengan kondisi Baik, dan PC Lenovo (BA04) dengan kondisi Baik. Data dengan ID `BA03` (Switch TP-Link) sudah tidak muncul lagi di dalam list. Hal ini membuktikan bahwa proses penghapusan berhasil dilakukan dan data di dalam `ArrayList` telah diperbarui secara otomatis.


