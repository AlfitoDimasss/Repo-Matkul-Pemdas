package tugas1;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author ACER
 */
/*
 * /* Nama 1: Alfito Dimas Prasetyo (205150401111057)_Pemrograman Dasar_Sistem
 * Informasi - E Nama 2: Audry Tifara Acanta Q (205150407111055)_Pemrograman
 * Dasar_Sistem Informasi - E
 * 
 * Tanggung jawab 1: Mengerjakan soal nomor 1, membuat seleksi kondisi
 * menentukan diskon yang akan didapat, dan membuat tampilan output Tanggung
 * jawab 2: Mengerjakan soal nomor 2, membuat input pemesanan furnitur, membuat
 * seleksi kondisi ongkos kirim dan jenis serta harga furnitur
 * 
 */
public class T1_205150401111057_AlfitoDimasPrasetyo_1 {

    public static void main(String[] args) {

        LocalDateTime localDate = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, MMMM dd YYYY");

        Scanner io = new Scanner(System.in);

        // Deklarasi Variabel
        int subMeja, subKursi, subLemari, ongkir, totPem, disk, jmlTot, jmlMeja, jmlKursi, jmlLemari, hargaMeja,
                hargaKursi, hargaLemari;
        int hargaMejaP = 3000000;
        int hargaMejaB = 1500000;
        int hargaKursiP = 1250000;
        int hargaKursiB = 750000;
        int hargaLemariP = 7000000;
        int hargaLemariB = 3500000;
        int diskon = 0;
        int jmlDisk1 = 5000000;
        int jmlDisk2 = 10000000;
        int jmlDisk3 = 15000000;
        double disk2, hargaM1, hargaK1, hargaL1, subM1, subK1, subL1, totPem1, jmlTot1;
        double disk3 = 200000;
        double usd = 14000;
        double ongkir1 = 2000000;
        double diskon1 = 0;
        String disk1 = "";

        // Input Menentukan Bahasa
        System.out.printf("%s%4c ", "Masukkan bahasa tampilan/language (1. Indonesia, 2. English)", '=');
        int bahasa = io.nextInt();

        // Seleksi Kondisi Untuk Bahasa yang Dipilih
        if (bahasa == 1) {

            // Input Untuk Memesan Furnitur
            io.nextLine();
            System.out.printf("Masukkan nomor anggota (isikan bila ada atau kosongi)%11c ", '=');
            String noAng = io.nextLine();
            System.out.printf("Pengiriman ke (isi dengan DALAM atau LUAR)%22c ", '=');
            String kirim = io.next();
            System.out.printf("Pembelian meja (kuantitas <SPASI> premium? isi YA atau TIDAK)%3c ", '=');
            jmlMeja = io.nextInt();
            String meja = io.next();
            System.out.printf("Pembelian kursi (kuantitas <SPASI> premium? isi YA atau TIDAK)%2c ", '=');
            jmlKursi = io.nextInt();
            String kursi = io.next();
            System.out.printf("Pembelian lemari (kuantitas <SPASI> premium? isi YA atau TIDAK)%c ", '=');
            jmlLemari = io.nextInt();
            String lemari = io.next();

            // Seleksi Kondisi Untuk Menentukan Ongkos Kirim
            if (kirim.equalsIgnoreCase("DALAM")) {
                kirim = "Dalam Negeri";
                ongkir = 0;
            } else {
                kirim = "Luar Negeri";
                ongkir = 2000000;
            }

            // Seleksi Kondisi Menentukan Jenis Meja dan Harga Meja yang Dipilih
            if (meja.equalsIgnoreCase("YA")) {
                meja = "Meja Premium";
                hargaMeja = hargaMejaP;
                subMeja = jmlMeja * hargaMeja;
            } else {
                meja = "Meja Biasa";
                hargaMeja = hargaMejaB;
                subMeja = jmlMeja * hargaMeja;
            }

            // Seleksi Kondisi Menentukan Jenis Kursi dan Harga Kursi yang Dipilih
            if (kursi.equalsIgnoreCase("YA")) {
                kursi = "Kursi Premium";
                hargaKursi = hargaKursiP;
                subKursi = jmlKursi * hargaKursi;
            } else {
                kursi = "Kursi Biasa";
                hargaKursi = hargaKursiB;
                subKursi = jmlKursi * hargaKursi;
            }

            // Seleksi Kondisi Menentukan Jenis Lemari dan Harga Lemari yang Dipilih
            if (lemari.equalsIgnoreCase("YA")) {
                lemari = "Lemari Premium";
                hargaLemari = hargaLemariP;
                subLemari = jmlLemari * hargaLemari;
            } else {
                lemari = "Lemari Biasa";
                hargaLemari = hargaLemariB;
                subLemari = jmlLemari * hargaLemari;
            }

            // Menentukan Harga Total Furnitur yang Dipesan
            jmlTot = subMeja + subKursi + subLemari;

            // Seleksi Kondisi Untuk Menentukan Diskon yang Akan Didapat
            if (noAng.equals("")) {
                if (jmlTot > jmlDisk2) {
                    disk1 = "Rp200000";
                    disk = 200000;
                    diskon = disk;
                } else if (jmlTot > jmlDisk1 && jmlTot <= jmlDisk2) {
                    disk1 = "Rp100000";
                    disk = 100000;
                    diskon = disk;
                }
            } else {
                if (jmlTot > jmlDisk3) {
                    disk1 = "  12.5% ";
                    disk2 = 0.125 * jmlTot;
                    diskon = (int) disk2;
                } else if (jmlTot > jmlDisk2 && jmlTot <= jmlDisk3) {
                    disk1 = "   10%  ";
                    disk2 = 0.1 * jmlTot;
                    diskon = (int) disk2;
                }
            }

            // Menentukan Jumlah Total yang Harus Dibayar
            totPem = jmlTot + ongkir - diskon;

            // Output Untuk Nota
            System.out.println("Pembeli Prioritas dengan nomor anggota " + noAng);
            System.out.println("Pengiriman ke " + kirim);
            System.out.println("Tanggal: " + dtf.format(localDate));
            System.out.println("------------------------------------------------------------------------------");
            System.out.printf("No | %s\t\t| %10s\t| %6s\t| %6s\t \n", "Furnitur", "Kuanititas", "Harga", "Sub Total");
            System.out.println("------------------------------------------------------------------------------");
            System.out.printf("1. | %9s  \t| %10s\t| Rp%6s\t| Rp%6s\t \n", meja, jmlMeja, hargaMeja, subMeja);
            System.out.printf("2. | %9s\t| %10s\t| Rp%6s\t| Rp%6s\t \n", kursi, jmlKursi, hargaKursi, subKursi);
            System.out.printf("3. | %9s\t| %10s\t| Rp%6s\t| Rp%6s\t \n", lemari, jmlLemari, hargaLemari, subLemari);
            System.out.println("------------------------------------------------------------------------------");
            System.out.printf("\t\t\t\t\tTotal%14c Rp%s \n", '=', jmlTot);
            System.out.printf("\t\t\t\t\tOngkos Kirim%7c Rp%s \n", '=', ongkir);
            System.out.printf("\t\t\t\t\tDiskon (%s)%2c Rp%s \n", disk1, '=', diskon);
            System.out.printf("\t\t\t\t\tTotal Pembayaran%3c Rp%s \n", '=', totPem);

        } else if (bahasa == 2) {

            // Input To Order Furniture
            io.nextLine();
            System.out.printf("Input member number (fill if available or keep blank)%11c ", '=');
            String noAng = io.nextLine();
            System.out.printf("Shipping to (fill with DOMESTIC atau INTL)%22c ", '=');
            String kirim = io.next();
            System.out.printf("Desk purchase (quantity <SPACE> premium? fill YES or NO)%8c ", '=');
            jmlMeja = io.nextInt();
            String meja = io.next();
            System.out.printf("Chair purchase (quantity <SPACE> premium? fill YES or NO)%7c ", '=');
            jmlKursi = io.nextInt();
            String kursi = io.next();
            System.out.printf("Cabinet purchase (quantity <SPACE> premium? fill YES or NO)%5c ", '=');
            jmlLemari = io.nextInt();
            String lemari = io.next();

            // Selection Conditions To Determine Shipping Cost
            if (kirim.equalsIgnoreCase("DOMESTIC")) {
                kirim = "DOMESTIC";
                ongkir1 *= 0;
            } else {
                kirim = "INTERNATIONAL";
                ongkir1 /= usd;
            }

            // Selection Conditions Determines the Type of Desk and Price of the Selected
            // Desk
            if (meja.equalsIgnoreCase("YES")) {
                meja = "Premium Desk";
                hargaM1 = hargaMejaP / usd;
                subM1 = jmlMeja * hargaM1;
            } else {
                meja = "Ordinary Desk";
                hargaM1 = hargaMejaB / usd;
                subM1 = jmlMeja * hargaM1;
            }

            // Selection Conditions Determines the Type of Chair and Price of the Selected
            // Chair
            if (kursi.equalsIgnoreCase("YES")) {
                kursi = "Premium Chair";
                hargaK1 = hargaKursiP / usd;
                subK1 = jmlKursi * hargaK1;
            } else {
                kursi = "Ordinaary Chair";
                hargaK1 = hargaKursiB / usd;
                subK1 = jmlKursi * hargaK1;
            }

            // Selection Conditions Determines the Type of Cabinet and Price of the Selected
            // Cabinet
            if (lemari.equalsIgnoreCase("YES")) {
                lemari = "Premium Cabinet";
                hargaL1 = hargaLemariP / usd;
                subL1 = jmlLemari * hargaL1;
            } else {
                lemari = "Ordinary Cabinet";
                hargaL1 = hargaLemariB / usd;
                subL1 = jmlLemari * hargaL1;
            }

            // Determine the total price of the ordered furniture
            jmlTot1 = subM1 + subK1 + subL1;

            // Selection of conditions to determine the discount that will be obtained
            if (noAng.equals("")) {
                if (jmlTot1 > (jmlDisk2 / usd)) {
                    disk1 = "$14.29";
                    disk3 /= usd;
                    diskon1 = disk3;
                } else if (jmlTot1 > (jmlDisk1 / usd) && jmlTot1 <= (jmlDisk2 / usd)) {
                    disk1 = "$7.14 ";
                    disk3 = (disk3 - 100000) / usd;
                    diskon1 = disk3;
                }
            } else {
                if (jmlTot1 > (jmlDisk3 / usd)) {
                    disk1 = "12.5% ";
                    disk2 = (0.125 * jmlTot1);
                    diskon1 = disk2;
                } else if (jmlTot1 > (jmlDisk2 / usd) && jmlTot1 <= (jmlDisk3 / usd)) {
                    disk1 = " 10%  ";
                    disk2 = (0.1 * jmlTot1);
                    diskon1 = disk2;
                }
            }

            // Determine the Total Payment to be Paid
            totPem1 = jmlTot1 + ongkir1 - diskon1;

            // Output for Notes
            System.out.println("Priority customer with member number " + noAng);
            System.out.println("Shipping to " + kirim);
            System.out.println("Date: " + dtf.format(localDate));
            System.out.println("------------------------------------------------------------------------------");
            System.out.printf("# | %9s\t\t| %10s\t| %6s\t| %6s\t \n", "Furniture", "Quantity", "Price", "Sub Total");
            System.out.println("------------------------------------------------------------------------------");
            System.out.printf("1. | %9s  \t| %10s\t| US$%6.2f\t| US$%6.2f\t \n", meja, jmlMeja, hargaM1, subM1);
            System.out.printf("2. | %9s\t| %10s\t| US$%6.2f\t| US$%6.2f\t \n", kursi, jmlKursi, hargaK1, subK1);
            System.out.printf("3. | %9s\t| %10s\t| US$%6.2f\t| US$%6.2f\t \n", lemari, jmlLemari, hargaL1, subL1);
            System.out.println("------------------------------------------------------------------------------");
            System.out.printf("\t\t\t\t\tTotal%13c US$%.2f \n", '=', jmlTot1);
            System.out.printf("\t\t\t\t\tShipping cost%5c US$%.2f \n", '=', ongkir1);
            System.out.printf("\t\t\t\t\tDiscount(%s)%2c US$%.2f \n", disk1, '=', diskon1);
            System.out.printf("\t\t\t\t\tTotal Payment    = US$%.2f \n", totPem1);

        }

        io.close();
    }

}
