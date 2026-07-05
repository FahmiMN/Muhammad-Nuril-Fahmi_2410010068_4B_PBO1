package studiomusik;

//Inheritance: mewarisi class Booking
public class BookingDetail extends Booking {

    public BookingDetail(String namaBand, String kodeBooking, int durasiJam) {
        super(namaBand, kodeBooking, durasiJam);
    }

    public String getTahunBooking() {
        return "20" + getKodeBooking().substring(0, 2);
    }

    public String getMusim() {
        String bulan = getKodeBooking().substring(2, 4);
        if (bulan.equals("06") || bulan.equals("07") || bulan.equals("12")) {
            return "Peak Season (Liburan)";
        } else {
            return "Regular Season";
        }
    }

    public String getBulanBooking() {
        switch (getKodeBooking().substring(2, 4)) {
            case "01": return "Januari";
            case "02": return "Februari";
            case "03": return "Maret";
            case "04": return "April";
            case "05": return "Mei";
            case "06": return "Juni";
            case "07": return "Juli";
            case "08": return "Agustus";
            case "09": return "September";
            case "10": return "Oktober";
            case "11": return "November";
            case "12": return "Desember";
            default:   return "Bulan Tidak Valid";
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

    public String getNoUrut() {
        return getKodeBooking().substring(6);
    }

    public String getStatusText() {
        if (isStatusLunas()) {
            return "LUNAS";
        } else {
            return "BELUM BAYAR";
        }
    }

    @Override
    public String displayInfo() {
        return "Nama Band      : " + getNamaBand()
             + "\nKode Booking   : " + getKodeBooking()
             + "\nTahun          : " + getTahunBooking()
             + "\nBulan          : " + getBulanBooking()
             + "\nMusim          : " + getMusim()
             + "\nPaket          : " + getPaket()
             + "\nNomor Urut     : " + getNoUrut()
             + "\nDurasi Sewa    : " + getDurasiJam() + " jam"
             + "\nBiaya Kotor    : " + String.format("Rp %,d", getBiayaKotor())
             + "\nDiskon         : " + String.format("Rp %,d", getDiskon())
             + "\nTotal Bayar    : " + String.format("Rp %,d", getTotalBayar())
             + "\nStatus         : " + getStatusText();
    }
}