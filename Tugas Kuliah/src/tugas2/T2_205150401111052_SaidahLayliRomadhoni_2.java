/*
 Nama 1: Saidah Layli Romadhoni (205150401111052)
 Nama 2: Isfan Adheltyo (205150407111044)
 Tanggung Jawab 1: Menjawab soal, membuat source code, memberikan penjelasan, menulis jawaban pada template soal nomor 1, 2, 4, membuat flowchart soal nomor 1
 Tanggung Jawab 2: Menjawab soal, membuat source code, memberikan penjelasan, menyempurnakan penjelasan soal nomor 2, menulis jawaban pada template soal nomor 3, 5, membuat flowchart soal nomor 1
 */
package tugas2;

import java.util.Scanner;

public class T2_205150401111052_SaidahLayliRomadhoni_2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan baris = ");
        int tinggi = in.nextInt();
        int i, j, k, space;
        int s = (tinggi - 1) * 2;
        int x = 1;

        // Mencetak poros dari piramida (tinggi)
        for (i = 1; i <= Math.pow(2, (tinggi - 1)); i *= 2) {
            // Mencetak spasi dan memberikan angka 1
            for (space = s; space > 0; space--)
                System.out.print("  ");
            System.out.print("1");
            // Mencetak angka di sebelah poros
            for (j = 2; j <= i; j *= 2) {
                System.out.printf("%4d", j);
            }
            // Mencetak angka di kolom samping no 2 poros
            j = (j / 2);
            for (k = (j / 2); k >= 2; k = (k / 2)) {
                System.out.printf("%4d", k);
            }
            if (i > 1)
                System.out.printf("%4d", x);
            System.out.println("");
            s -= 2;
        }

    }

}
