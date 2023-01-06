package tugas3;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Illuminare
 */
public class L3Nomor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /* Program untuk mencetak bilangan prima */

        // Deklarasi, Inisialisai, dan Instantiasi
        Scanner io = new Scanner(System.in);
        boolean cek;
        int jum = 0;
        String prima = "";

        // Input
        System.out.print("Masukkan jumlah angka prima yang ingin dicetak\t: ");
        int tot = io.nextInt();

        // Proses Cetak dan Menampilkan Bilangan Prima
        for (int i = 2;; i++) {
            cek = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    cek = false;
                    break;
                }
            }
            if (cek) {
                prima += i + " ";
                jum++;
            }
            if (jum == tot) {
                break;
            }
        }

        // Output
        System.out.println("Bilangan Prima\t\t\t\t\t: " + prima);
        io.close();
    }
}
