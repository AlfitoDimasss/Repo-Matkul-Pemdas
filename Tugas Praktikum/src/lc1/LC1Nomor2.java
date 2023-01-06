package lc1;

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
public class LC1Nomor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /* Program menghitung luas segitiga jika diketahui ketiga sisinya */

        Scanner io = new Scanner(System.in);

        // Input
        System.out.println("Silahkan input titik koordinat tiap sisi segitiga");
        System.out.print("x1 <spasi> y1\t: ");
        double x1 = io.nextDouble();
        double y1 = io.nextDouble();
        System.out.print("x2 <spasi> y2\t: ");
        double x2 = io.nextDouble();
        double y2 = io.nextDouble();
        System.out.print("x3 <spasi> y3\t: ");
        double x3 = io.nextDouble();
        double y3 = io.nextDouble();

        // Rumus hitung nilai sisi segitiga
        double sisi1 = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
        double sisi2 = Math.sqrt((Math.pow((x3 - x2), 2)) + (Math.pow((y3 - y2), 2)));
        double sisi3 = Math.sqrt((Math.pow((x1 - x3), 2)) + (Math.pow((y1 - y3), 2)));

        // Rumus luas segitiga = Sqrt(s(s-a)(s-b)(s-c)). s = (a+b+c) / 2
        double sisi = (sisi1 + sisi2 + sisi3) / 2;

        double area = sisi * (sisi - sisi1) * (sisi - sisi2) * (sisi - sisi3);
        area = Math.sqrt(area);

        // Output
        System.out.printf("Luas segitiga\t: %.2f cm2 \n", area);
        io.close();

    }
}
