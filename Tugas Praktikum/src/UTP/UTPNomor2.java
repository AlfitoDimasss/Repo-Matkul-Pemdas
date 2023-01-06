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
public class UTPNomor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Input
        Scanner io = new Scanner(System.in);
        System.out.println("====== Terdapat Beberapa Faktor ======");
        System.out.println("Cuaca: Cerah, Mendung, Hujan");
        System.out.println("Suhu: Panas, Sedang, Dingin");
        System.out.println("Kelembaban: Tinggi, Normal, Rendah");
        System.out.println("Angin: Labil, Stabil");
        System.out.println("Hari: Pagi, Siang, Malam");
        System.out.println("Mood: Bagus, Buruk");
        System.out.println("\n=====================================\n");
        System.out.print("Input cuaca: ");
        String cuaca = io.next();
        System.out.print("Input suhu: ");
        String suhu = io.next();
        System.out.print("Input kelembaban: ");
        String lembab = io.next();
        System.out.print("Input status angin: ");
        String angin = io.next();
        System.out.print("Input waktu hari: ");
        String hari = io.next();
        System.out.print("Input mood: ");
        String mood = io.next();
        int poin = 0;

        // Seleksi kondisi
        if (mood.equals("bagus")) {
            System.out.println("Toni pergi berlatih");
        } else if (cuaca.equals("hujan")) {
            System.out.println("Toni tidak pergi berlatih");
        } else if (cuaca.equals("cerah") && suhu.equals("panas") && hari.equals("siang")) {
            System.out.println("Toni tidak pergi berlatih");
        } else if (suhu.equals("sedang") && angin.equals("labil")) {
            System.out.println("Toni pergi berlatih");
        } else {
            switch (cuaca) {
                case "cerah":
                    poin += 1;
                    break;
                case "mendung":
                    poin += 1;
                    break;
                case "hujan":
                    poin += 0;
                    break;
            }
            switch (suhu) {
                case "panas":
                    poin += 0;
                    break;
                case "sedang":
                    poin += 1;
                    break;
                case "dingin":
                    poin += 0;
                    break;
            }
            switch (lembab) {
                case "tinggi":
                    poin += 0;
                    break;
                case "normal":
                    poin += 1;
                    break;
                case "rendah":
                    poin += 0;
                    break;
            }
            switch (angin) {
                case "labil":
                    poin += 0;
                    break;
                case "stabil":
                    poin += 1;
                    break;
            }
            switch (hari) {
                case "pagi":
                    poin += 1;
                    break;
                case "siang":
                    poin += 1;
                    break;
                case "malam":
                    poin += 0;
                    break;
            }
            switch (mood) {
                case "bagus":
                    poin += 1;
                    break;
                case "buruk":
                    poin += 0;
                    break;
            }

            // Output
            if (poin >= 3) {
                System.out.println("Toni pergi berlatih");
            } else {
                System.out.println("Toni tidak pergi berlatih");
            }
        }
        io.close();
    }
}
