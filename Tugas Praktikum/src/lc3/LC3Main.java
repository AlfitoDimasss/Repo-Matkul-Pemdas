package lc3;

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
public class LC3Main {

    public static void main(String[] args) {

        /* Program Remote TV */

        // Inisialisasi dan Instantiasi
        Scanner io = new Scanner(System.in);

        System.out.println("===== PROGRAM REMOTE TV =====");
        System.out.println("Terdapat beberapa command, diantaranya: ");
        System.out.println("- POWER\t: Untuk menyalakan dan mematikan TV");
        System.out.println("- CHANNEL UP\t: Pindah satu channel keatas");
        System.out.println("- CHANNEL DOWN\t: Pindah satu channel kebawah");
        System.out.println("- CHANNEL (ANGKA)\t: Pindah ke channel tersebut");
        System.out.println("- PREV\t\t: Pindah ke channel sebelumnya");
        System.out.println("- MUTE\t\t: Mute volume");
        System.out.println("- UNMUTE\t: Unmute volume");
        System.out.println("- VOLUME UP\t: Menaikan volume");
        System.out.println("- VOLUME DOWN\t: Menurunkan volume");
        int ch = 1;
        int vol = 50;
        int stat = 0;
        int tmp = 1;
        int mute = 1;

        System.out.println("\n====Nyalakan Power Untuk Memulai=====\n");

        // Start Program
        while (true) {

            String p = io.next();
            if (p.equalsIgnoreCase("POWER") && stat == 0) {
                System.out.println("TV ON");
                stat += 1;
            } else if (p.equalsIgnoreCase("POWER") && stat == 1) {
                stat *= 0;
                System.out.println("TV OFF");
                break;
            }
            if (p.equalsIgnoreCase("CHANNEL") && stat == 1) {

                String q = io.next();
                switch (q) {
                    case "UP":
                        tmp = ch;
                        ch += 1;
                        if (ch > 30) {
                            System.out.println("Channel tidak valid");
                            ch = 1;
                            tmp = ch;
                        } else {
                            System.out.println("Channel sekarang: " + ch);
                        }
                        break;
                    case "DOWN":
                        tmp = ch;
                        ch -= 1;
                        if (ch == 0) {
                            System.out.println("Channel tidak valid");
                            ch = 1;
                        } else {
                            System.out.println("Channel sekarang: " + ch);
                        }
                        break;
                    case "1":
                        tmp = ch;
                        ch = 1;
                        System.out.println("Channel sekarang: " + ch);
                        break;
                    case "2":
                        tmp = ch;
                        ch = 2;
                        System.out.println("Channel sekarang: " + ch);
                        break;
                    case "3":
                        tmp = ch;
                        ch = 3;
                        System.out.println("Channel sekarang: " + ch);
                        break;
                    case "4":
                        tmp = ch;
                        ch = 4;
                        System.out.println("Channel sekarang: " + ch);
                        break;
                    case "5":
                        tmp = ch;
                        ch = 5;
                        System.out.println("Channel sekarang: " + ch);
                        break;
                    case "6":
                        tmp = ch;
                        ch = 6;
                        System.out.println("Channel sekarang: " + ch);
                        break;
                    case "7":
                        tmp = ch;
                        ch = 7;
                        System.out.println("Channel sekarang: " + ch);
                        break;
                    case "8":
                        tmp = ch;
                        ch = 8;
                        System.out.println("Channel sekarang: " + ch);
                        break;
                    case "9":
                        tmp = ch;
                        ch = 9;
                        System.out.println("Channel sekarang: " + ch);
                        break;
                    case "10":
                        tmp = ch;
                        ch = 10;
                        System.out.println("Channel sekarang: " + ch);
                        break;
                    case "11":
                        tmp = ch;
                        ch = 11;
                        System.out.println("Channel sekarang: " + ch);
                        break;
                    case "12":
                        tmp = ch;
                        ch = 12;
                        System.out.println("Channel sekarang: " + ch);
                        break;
                    case "13":
                        tmp = ch;
                        ch = 13;
                        System.out.println("Channel sekarang: " + ch);
                        break;
                    case "14":
                        tmp = ch;
                        ch = 14;
                        System.out.println("Channel sekarang: " + ch);
                        break;
                    case "15":
                        tmp = ch;
                        ch = 15;
                        System.out.println("Channel sekarang: " + ch);
                        break;
                    case "16":
                        tmp = ch;
                        ch = 16;
                        System.out.println("Channel sekarang: " + ch);
                        break;
                    case "17":
                        tmp = ch;
                        ch = 17;
                        System.out.println("Channel sekarang: " + ch);
                        break;
                    case "18":
                        tmp = ch;
                        ch = 18;
                        System.out.println("Channel sekarang: " + ch);
                        break;
                    case "19":
                        tmp = ch;
                        ch = 19;
                        System.out.println("Channel sekarang: " + ch);
                        break;
                    case "20":
                        tmp = ch;
                        ch = 20;
                        System.out.println("Channel sekarang: " + ch);
                        break;
                    case "21":
                        tmp = ch;
                        ch = 21;
                        System.out.println("Channel sekarang: " + ch);
                        break;
                    case "22":
                        tmp = ch;
                        ch = 22;
                        System.out.println("Channel sekarang: " + ch);
                        break;
                    case "23":
                        tmp = ch;
                        ch = 23;
                        System.out.println("Channel sekarang: " + ch);
                        break;
                    case "24":
                        tmp = ch;
                        ch = 24;
                        System.out.println("Channel sekarang: " + ch);
                        break;
                    case "25":
                        tmp = ch;
                        ch = 25;
                        System.out.println("Channel sekarang: " + ch);
                        break;
                    case "26":
                        tmp = ch;
                        ch = 26;
                        System.out.println("Channel sekarang: " + ch);
                        break;
                    case "27":
                        tmp = ch;
                        ch = 27;
                        System.out.println("Channel sekarang: " + ch);
                        break;
                    case "28":
                        tmp = ch;
                        ch = 28;
                        System.out.println("Channel sekarang: " + ch);
                        break;
                    case "29":
                        tmp = ch;
                        ch = 29;
                        System.out.println("Channel sekarang: " + ch);
                        break;
                    case "30":
                        tmp = ch;
                        ch = 30;
                        System.out.println("Channel sekarang: " + ch);
                        break;
                    default:
                        System.out.println("Channel yang dimasukkan tidak valid");
                }

            }

            if (p.equalsIgnoreCase("PREV") && stat == 1) {
                String q = io.next();
                if (q.equalsIgnoreCase("CHANNEL")) {
                    System.out.println("Channel sekarang: " + tmp);
                    ch = tmp;
                }
            }

            if (p.equalsIgnoreCase("MUTE") && stat == 1) {
                mute = 0;
                System.out.println("Volume mute");
            } else if (p.equalsIgnoreCase("UNMUTE") && stat == 1 && mute == 0) {
                mute = 1;
                System.out.println("Volume sekarang: " + vol);
            }

            if (p.equalsIgnoreCase("VOLUME") && stat == 1) {
                String q = io.next();
                if (q.equalsIgnoreCase("UP")) {
                    mute = 1;
                    vol += 5;
                    if (vol > 100) {
                        System.out.println("Volume tidak valid");
                        vol = 100;
                    } else {
                        System.out.println("Volume sekarang: " + vol);
                    }
                } else if (q.equalsIgnoreCase("DOWN")) {
                    mute = 1;
                    vol -= 5;
                    if (vol < 0) {
                        System.out.println("Volume tidak valid");
                        vol = 0;
                    } else {
                        System.out.println("Volume sekarang: " + vol);
                    }
                }
            }
        }
        io.close();
    }
}
