package studiomusik;

import java.util.Scanner; // IO Sederhana

public class StudioMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BookingDetail[] bookings = new BookingDetail[100];
        int jumlahData = 0;

        boolean jalan = true;

        while (jalan) {
            System.out.println("\n===== APLIKASI BOOKING STUDIO MUSIK =====");
            System.out.println("1. Tambah Booking");
            System.out.println("2. Lihat Semua Booking");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1-3): ");
            String pilihan = scanner.nextLine();

            if (pilihan.equals("1")) {
                try { 
                    System.out.print("Nama Band          : ");
                    String namaBand = scanner.nextLine();

                    System.out.print("Kode Booking (8)   : ");
                    String kode = scanner.nextLine();

                    if (kode.length() != 8) {
                        System.out.println(">> Gagal: Kode harus tepat 8 digit!");
                        continue;
                    }

                    System.out.print("Durasi sewa (jam)  : ");
                    int durasi = Integer.parseInt(scanner.nextLine());

                    System.out.print("Nama Operator Jaga : ");
                    String operator = scanner.nextLine();

                    bookings[jumlahData] = new BookingDetail(namaBand, kode, durasi);
                    jumlahData++;

                    System.out.println("\n>> Booking berhasil ditambahkan!");
                    System.out.println(bookings[jumlahData - 1].displayInfo(operator));

                } catch (Exception e) {
                    System.out.println(">> Error: Input tidak valid (" + e.getMessage() + ")");
                }

            } else if (pilihan.equals("2")) {
                if (jumlahData == 0) {
                    System.out.println(">> Belum ada data booking.");
                } else {
                    for (int i = 0; i < jumlahData; i++) {
                        System.out.println("\n--- Booking ke-" + (i + 1) + " ---");
                        System.out.println(bookings[i].displayInfo());
                    }
                }

            } else if (pilihan.equals("3")) {
                System.out.println("Terima kasih. Sampai jumpa lagi di studio!");
                jalan = false;

            } else {
                System.out.println(">> Menu tidak tersedia, pilih 1-3.");
            }
        }
    }
}