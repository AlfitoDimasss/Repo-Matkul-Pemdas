/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTP;

import java.util.Scanner;

/**
 *
 * @author Illuminare
 */
public class UTPNomor1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
         * Program untuk menentukan jumlah hari yang diperlukan untuk menurunkan berat
         * badan
         */

        // Input
        Scanner io = new Scanner(System.in);
        System.out.print("Input berat badan anda (kg): ");
        double berat = io.nextDouble();
        System.out.print("Berapa target berat badan nantinya: ");
        double target = io.nextDouble();
        System.out.print("Berapa waktu workout tiap harinya (detik): ");
        double waktu = io.nextDouble();
        System.out.print("Berapa jarak workout tiap harinya (km): ");
        double jarak = io.nextDouble();
        double met = 0;

        // Konversi detik
        String jam = "" + (int) (waktu / 3600);
        String menit = "" + (int) ((waktu % 3600) / 60);
        String detik = "" + (int) (waktu % 3600 % 60);

        if (jam.length() < 2) {
            jam = "0" + jam;
        }
        if (menit.length() < 2) {
            menit = "0" + menit;
        }
        if (detik.length() < 2) {
            detik = "0" + detik;
        }

        // Rumus kecepatan rata-rata
        double kec = Math.round(jarak / (waktu / 3600));

        // Konversi kecepatan ke met value
        if (kec <= 4) {
            met = 6;
        } else if (kec == 5) {
            met = 8.3;
        } else if (kec == 6) {
            met = 9.8;
        } else if (kec == 7) {
            met = 11.0;
        } else if (kec >= 8) {
            met = 11.8;
        }

        // Rumus hitung kalori
        int kalori = (int) Math.round((met * berat * (waktu / 3600)));

        // Rumus hitung hari yang dibutuhkan
        int hari = (int) (7700 * (berat - target) / kalori);

        // Output
        System.out.println("Waktu Latihan perhari: " + jam + ":" + menit + ":" + detik);
        System.out.println("Kalori yang dibakar perhari: " + kalori);
        System.out.println("Jumlah hari yang dibtuhkan untuk mencapai target berat badan: " + hari);
        io.close();
    }
}
