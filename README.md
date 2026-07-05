# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah aplikasi sederhana pendataan booking studio musik menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama band dan kode booking, kemudian memberikan output berupa informasi detail dari kode tersebut seperti tahun booking, bulan, musim (peak/regular season), paket studio yang dipilih, dan nomor urut booking. Selain itu, aplikasi juga menghitung biaya sewa berdasarkan durasi, memberikan diskon otomatis untuk sewa lebih dari 3 jam, dan menampilkan status pembayaran.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Booking`, `BookingDetail`, dan `StudioBeraksi` adalah contoh dari class.

```bash
public class Booking {
    ...
}

public class BookingDetail extends Booking {
    ...
}

public class StudioBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `bookings[jumlahData] = new BookingDetail(namaBand, kode, durasi);` adalah contoh pembuatan object.

```bash
bookings[jumlahData] = new BookingDetail(namaBand, kode, durasi);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `namaBand`, `kodeBooking`, `durasiJam`, dan `statusLunas` adalah contoh atribut.

```bash
private String namaBand;
private String kodeBooking;
private int durasiJam;
private boolean statusLunas;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Booking` dan `BookingDetail`.

```bash
public Booking(String namaBand, String kodeBooking, int durasiJam) {
    this.namaBand = namaBand;
    this.kodeBooking = kodeBooking;
    this.durasiJam = durasiJam;
    this.statusLunas = false;
}

public BookingDetail(String namaBand, String kodeBooking, int durasiJam) {
    super(namaBand, kodeBooking, durasiJam);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNamaBand`, `setKodeBooking`, `setDurasiJam`, dan `setStatusLunas` adalah contoh method mutator.

```bash
public void setNamaBand(String namaBand) {
    this.namaBand = namaBand;
}

public void setKodeBooking(String kodeBooking) {
    this.kodeBooking = kodeBooking;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNamaBand`, `getKodeBooking`, `getTahunBooking`, `getBulanBooking`, `getMusim`, `getPaket`, `getNoUrut`, `getBiayaKotor`, `getDiskon`, dan `getTotalBayar` adalah contoh method accessor.

```bash
public String getNamaBand() {
    return namaBand;
}

public String getKodeBooking() {
    return kodeBooking;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `namaBand`, `kodeBooking`, `durasiJam`, dan `statusLunas` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String namaBand;
private String kodeBooking;
private int durasiJam;
private boolean statusLunas;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `BookingDetail` mewarisi `Booking` dengan sintaks `extends`.

```bash
public class BookingDetail extends Booking {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Booking` merupakan overloading method `displayInfo` dan `displayInfo` di `BookingDetail` merupakan override dari method `displayInfo` di `Booking`.

```bash
public String displayInfo(String operator) {
    return displayInfo() + "\nOperator Jaga  : " + operator;
}

@Override
public String displayInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getMusim` dan seleksi `switch` dalam method `getBulanBooking` dan `getPaket`.

```bash
public String getMusim() {
    String bulan = getKodeBooking().substring(2, 4);
    if (bulan.equals("06") || bulan.equals("07") || bulan.equals("12")) {
        return "Peak Season (Liburan)";
    } else {
        return "Regular Season";
    }
}

public String getPaket() {
    switch (getKodeBooking().substring(4, 6)) {
        case "10":
            return "Paket Drum Only";
        case "11":
            return "Paket Gitar & Bass";
        case "12":
            return "Paket Full Band";
        case "13":
            return "Paket Rekaman";
        default:
            return "Paket Tidak Dikenal";
    }
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `while` untuk menjalankan menu berulang dan loop `for` untuk menampilkan semua data booking.

```bash
while (jalan) {
    ...
}

for (int i = 0; i < jumlahData; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Nama Band          : ");
String namaBand = scanner.nextLine();

System.out.println("\n>> Booking berhasil ditambahkan!");
System.out.println(bookings[jumlahData - 1].displayInfo(operator));
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `BookingDetail[] bookings = new BookingDetail[100];` adalah contoh penggunaan array.

```bash
BookingDetail[] bookings = new BookingDetail[100];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error, misalnya ketika user memasukkan durasi bukan angka.

```bash
try {
    // code that might throw an exception
} catch (Exception e) {
    System.out.println(">> Error: Input tidak valid (" + e.getMessage() + ")");
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Nuril Fahmi
NPM: 2410010068
