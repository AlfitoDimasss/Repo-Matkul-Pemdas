package tugas2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author Illuminare
 */
public class L2Nomor4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /* Program input output untuk menentukan biaya ongkos kirim ekspedisi */

        Scanner io = new Scanner(System.in);

        // Input
        System.out.println("Terdapat dua jenis pilihan pengiriman yaitu instan dan reguler.");
        System.out.print("Pilihan anda\t\t\t: ");
        String jenis = io.next();
        jenis = jenis.toLowerCase();
        System.out.println("Silahkan input jarak pengiriman dan berat paket. Cukup angka saja tanpa satuannya.");
        System.out.print("Input jarak pengiriman (km)\t: ");
        double jarak = io.nextDouble();
        System.out.print("Input berat paket (kg)\t\t: ");
        double berat = io.nextDouble();

        int harga = 0;

        // Seleksi kondisi
        switch (jenis) {
            case "instan":
                harga += 10000;
                if (jarak >= 500) {
                    harga += 30000;
                } else if (jarak >= 250) {
                    harga += 20000;
                } else if (jarak >= 100) {
                    harga += 10000;
                } else if (jarak >= 0) {
                    harga += 5000;
                }

                if (berat >= 20) {
                    harga += 10000;
                } else if (berat >= 10) {
                    harga += 7500;
                } else if (berat >= 0) {
                    harga += 5000;
                }

                System.out.println("Total ongkos kirim\t\t: Rp" + harga);
                break;

            case "reguler":
                harga += 5000;
                if (jarak >= 500) {
                    harga += 30000;
                } else if (jarak >= 250) {
                    harga += 20000;
                } else if (jarak >= 100) {
                    harga += 10000;
                } else if (jarak >= 0) {
                    harga += 5000;
                }
                if (berat >= 20) {
                    harga += 10000;
                } else if (berat >= 10) {
                    harga += 7500;
                } else if (berat >= 0) {
                    harga += 5000;
                }

                System.out.println("Total ongkos kirim: " + harga);
                break;

            default:
                System.out.println("Jenis yang dimasukkan salah.");
        }

        io.close();
    }
}
