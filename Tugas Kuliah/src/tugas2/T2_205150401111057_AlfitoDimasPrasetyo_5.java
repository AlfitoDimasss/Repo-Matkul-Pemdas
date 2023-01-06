package tugas2;

//
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */

/*
 * Nama 1: Alfito Dimas Prasetyo (205150401111057) Nama 2: Ariyo Tejo Sumarto
 * (205150407111043)
 * 
 * Tanggung jawab 1: Mengerjakan soal nomor 2, nomor 4, dan nomor 5 Tanggung
 * jawab 2: Mengerjakan soal nomor 1 dan soal nomor 3, serta membuat flowchart
 * dan pseudocode untuk nomor 1
 */

public class T2_205150401111057_AlfitoDimasPrasetyo_5 {

    public static void main(String[] args) {

        /* Program menghitung simpangan baku berat badan */

        // Deklarasi, Inisialiasi, dan Instantiasi
        Scanner io = new Scanner(System.in);
        double angka, mean, stdDev1;
        double sum1 = 0;
        double sum2 = 0;
        int totAngka = 0;

        // Input
        System.out.print("Masukkan berat badan, input berakhir bila diisi 0: ");

        while (true) {
            angka = io.nextDouble();
            if (angka == 0) {
                break;
            }
            totAngka++;
            sum1 += angka;
            sum2 += Math.pow(angka, 2);
        }

        // Output
        if (totAngka != 0) {

            // Rumus
            mean = sum1 / totAngka;
            stdDev1 = (sum2 - (Math.pow(sum1, 2) / totAngka)) / (totAngka - 1);
            stdDev1 = Math.sqrt(stdDev1);
            System.out.printf("Banyaknya orang adalah %s \n", totAngka);
            System.out.printf("Rata - ratanya adalah %.2f \n", mean);
            System.out.printf("Simpangan bakunya adalah %.2f \n", stdDev1);
        } else {
            System.out.println("Tidak ada angka yang dihasilkan kecuali 0");
        }
        io.close();
    }
}
