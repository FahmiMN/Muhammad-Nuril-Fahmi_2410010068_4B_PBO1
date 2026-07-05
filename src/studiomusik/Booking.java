package studiomusik;

public class Booking {
    // Atribut + Encapsulation
    private String namaBand;
    private String kodeBooking;
    private int durasiJam;
    private boolean statusLunas;

    // tarif dasar per jam
    public static final int TARIF_PER_JAM = 75000;

    // Constructor
    public Booking(String namaBand, String kodeBooking, int durasiJam) {
        this.namaBand = namaBand;
        this.kodeBooking = kodeBooking;
        this.durasiJam = durasiJam;
        this.statusLunas = false;
    }

    // Mutator
    public void setNamaBand(String namaBand) {
        this.namaBand = namaBand;
    }

    public void setKodeBooking(String kodeBooking) {
        this.kodeBooking = kodeBooking;
    }

    public void setDurasiJam(int durasiJam) {
        this.durasiJam = durasiJam;
    }

    public void setStatusLunas(boolean statusLunas) {
        this.statusLunas = statusLunas;
    }

    // Accessor
    public String getNamaBand() {
        return namaBand;
    }

    public String getKodeBooking() {
        return kodeBooking;
    }

    public int getDurasiJam() {
        return durasiJam;
    }

    public boolean isStatusLunas() {
        return statusLunas;
    }
    
    // Hitung total biaya sebelum diskon
    public int getBiayaKotor() {
        return durasiJam * TARIF_PER_JAM;
    }

    // Diskon: sewa lebih dari 3 jam dapat diskon 10%
    public int getDiskon() {
        if (durasiJam > 3) {
            return getBiayaKotor() / 10; // 10% diskon
        } else {
            return 0;
        }
    }

    // Total bayar (setelah diskon)
    public int getTotalBayar() {
        return getBiayaKotor() - getDiskon();
    }

    // Polymorphism
    // displayInfo versi dengan nama operator
    public String displayInfo(String operator) {
        return displayInfo() + "\nOperator Jaga  : " + operator;
    }

    // Method dasar
    public String displayInfo() {
        return "Nama Band  : " + namaBand + "\nKode       : " + kodeBooking;
    }
}