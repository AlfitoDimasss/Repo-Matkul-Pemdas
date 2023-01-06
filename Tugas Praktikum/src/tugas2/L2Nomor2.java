package tugas2;

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
public class L2Nomor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
         * Ini adalah program untuk menentukan hadiah pemenang giveaway, dimana pemenang
         * harus memiliki username ig valid yaitu diawali dengan @ dan tiap username
         * memilik hadiah yang berbeda tergantung dengan jumlah username dan huruf
         * username setelah @
         */

        Scanner io = new Scanner(System.in);

        // Input
        System.out.print("Masukkan username\t: ");
        String user = io.next();
        String user1 = user.substring(1, 2); // Mengambil char setelah @
        String reward = "";
        boolean isTrue = false;

        // Seleksi kondisi menentukan hadiah
        if (user.charAt(0) == '@' && ((user.length() - 1) % 2) == 0) {
            switch (user1) {
                case "a":
                case "i":
                case "u":
                case "e":
                case "o":
                    reward += "Meet n Greet";
                    isTrue = true;
                    break;
                default:
                    reward += "Iphone";
                    isTrue = true;
            }
        } else if (user.charAt(0) == '@' && ((user.length() - 1) % 2) != 0) {
            switch (user1) {
                case "a":
                case "i":
                case "u":
                case "e":
                case "o":
                    reward += "E-Money";
                    isTrue = true;
                    break;
                default:
                    reward += "Pulsa";
                    isTrue = true;
            }
        } else {
            System.out.println("Username tidak valid.");
        }

        // Output
        if (isTrue) {
            System.out.println("Reward anda\t\t: " + reward);
        }

        io.close();
    }
}
