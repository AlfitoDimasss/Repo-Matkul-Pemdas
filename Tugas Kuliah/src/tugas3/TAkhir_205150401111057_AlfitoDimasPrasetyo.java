package tugas3;

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
 * Nama 1: Alfito Dimas Prasetyo (205150401111057) Nama 2: Lintang Trisnadi
 * (205150401111050)
 * 
 * Tanggung jawab 1: Mengerjakan tugas akhir Tanggung jawab 2: Mengerjakan tugas
 * akhir
 */

public class TAkhir_205150401111057_AlfitoDimasPrasetyo {

    final static int MAX_SISWA = 10;
    final static int MAX_MATPEL = 10;
    final static int MAX_SEMESTER = 2;

    /* menyimpan nama siswa */
    static String[] siswa = new String[MAX_SISWA];
    /* menyimpan nama matpel per siswa tiap semester, semester ganjil=0, genap=1 */
    static String[][][] siswaMatpel = new String[MAX_SISWA][MAX_SEMESTER][MAX_MATPEL];
    /* menyimpan nilai matpel per siswa tiap semester, semester ganjil=0, genap=1 */
    static double[][][] siswaMatpelNilai = new double[MAX_SISWA][MAX_SEMESTER][MAX_MATPEL];
    /* menyimpan banyak siswa */
    static int banyakSiswa = 0;
    /* menyimpan banyak matpel */
    static int banyakSiswaMatpel = 0;

    // Method ini untuk mengubah nilai angka jadi nilai huruf
    public static String konversiNilai(double nilai) {
        String nilaiHuruf = "";
        if (nilai > 80 && nilai <= 100) {
            nilaiHuruf += "A";
        } else if (nilai > 75 && nilai <= 80) {
            nilaiHuruf += "B+";
        } else if (nilai > 69 && nilai <= 75) {
            nilaiHuruf += "B";
        } else if (nilai > 65 && nilai <= 69) {
            nilaiHuruf += "C+";
        } else if (nilai > 59 && nilai <= 65) {
            nilaiHuruf += "C";
        } else if (nilai > 55 && nilai <= 59) {
            nilaiHuruf += "D+";
        } else if (nilai > 40 && nilai <= 55) {
            nilaiHuruf += "D";
        } else {
            nilaiHuruf += "E";
        }
        return nilaiHuruf;
    }

    // Method ini untuk menambah jumlah siswa dan memasukkan nama siswa
    public static void tambahSiswa(String nama) {
        siswa[banyakSiswa] = nama;
        banyakSiswa++;
    }

    // Method ini untuk menambah jumlah mata pelajaran dan memasukkan nama mata
    // pelajaran
    public static void tambahMatpel(String matpel) {
        for (int i = 0; i <= banyakSiswa; i++) {
            siswaMatpel[i][0][banyakSiswaMatpel] = matpel;
            siswaMatpel[i][1][banyakSiswaMatpel] = matpel;
        }
        banyakSiswaMatpel++;
    }

    // Method ini untuk mencari nama siswa yang sesuai dengan yang ada di dalam
    // Array siswa dan mengembalikan indeks nama tsb.
    public static int cariSiswa(String nama) {
        int cari = 0;
        for (int i = 0; i < banyakSiswa; i++) {
            if (siswa[i].equals(nama)) {
                cari = i;
            }
        }
        return cari;
    }

    // Method ini untuk mencari nama mata pelajaran yang sesuai dengan yang ada di
    // dalam Array siswaMatpel dan mengembalikan indeks matpel tsb.
    public static int cariMatpel(String matpel) {
        int cari = 0;
        for (int i = 0; i < banyakSiswaMatpel; i++) {
            if (matpel.equals(siswaMatpel[0][0][i])) {
                cari = i;
            }
        }
        return cari;
    }

    /*
     * nama: nama siswa semester: semester, 0 untuk ganjil, 1 untuk genap matpel:
     * nama matpel nilai: nilai matpel tiap semester
     */

    // Method ini untuk memasukkan nilai kedalam array siswaMatpelNilai
    public static void isiDataSiswa(String nama, int semester, String matpel, int nilai) {
        siswaMatpelNilai[cariSiswa(nama)][semester][cariMatpel(matpel)] = nilai;
    }

    // Method ini untuk mencetak nama siswa yang sudah ditambahkan
    public static void printSiswa() {
        System.out.print("\n");
        System.out.print("Siswa: ");
        for (int i = 0; i < banyakSiswa; i++) {
            System.out.print(siswa[i] + " ");
        }
        System.out.print("\n");
    }

    // Method ini untuk mencetak nama mata pelajaran yang sudah ditambahkan
    public static void printMatpel() {
        System.out.print("\n");
        System.out.print("MATA PELAJARAN: ");
        for (int i = 0; i < banyakSiswaMatpel; i++) {
            System.out.print(siswaMatpel[0][0][i] + " ");
        }
        System.out.print("\n");
    }

    // Method ini untuk mencetak raport siswa
    public static void printRaportSiswa(String nama) {
        int cariNama = cariSiswa(nama);
        System.out.print("\n");
        System.out.println(">> BEGIN RAPORT << \n");
        System.out.println("Nama: " + siswa[cariNama]);
        System.out.println("Semester: Ganjil");
        System.out.printf("%s\t|%10s\t|%12s\n", "Mata Pelajaran", "Nilai", "Nilai Huruf");
        System.out.println("-----------------------------------------------");
        for (int i = 0; i < banyakSiswaMatpel; i++) {
            System.out.printf("%-16s|%10s\t|%12s\n", siswaMatpel[cariNama][0][i], siswaMatpelNilai[cariNama][0][i],
                    konversiNilai(siswaMatpelNilai[cariNama][0][i]));
        }
        System.out.println();
        System.out.println("Semester: Genap");
        System.out.printf("%s\t|%10s\t|%12s\n", "Mata Pelajaran", "Nilai", "Nilai Huruf");
        System.out.println("-----------------------------------------------");
        for (int i = 0; i < banyakSiswaMatpel; i++) {
            System.out.printf("%-16s|%10s\t|%12s\n", siswaMatpel[cariNama][0][i], siswaMatpelNilai[cariNama][1][i],
                    konversiNilai(siswaMatpelNilai[cariNama][1][i]));
        }
        System.out.println();
        System.out.print(">> END RAPORT << \n");
    }

    // Method ini untuk mencari juara dengan cara mencari siswa dengan jumlah nilai
    // tertinggi
    public static int cariJuara(int semester) {
        int[] tmp = new int[banyakSiswaMatpel];
        int max = Integer.MIN_VALUE;
        int indeks = 0;
        for (int i = 0; i < banyakSiswa; i++) {
            for (int j = 0; j < banyakSiswaMatpel; j++) {
                tmp[i] += siswaMatpelNilai[i][semester][j];
            }
        }
        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i] > max) {
                max = tmp[i];
                indeks = i;
            }
        }

        return indeks;
    }

    // Method ini untuk menghitung jumlah nilai huruf siswa
    public static void hitungNilai(int semester) {
        int jmlA = 0;
        int jmlBp = 0;
        int jmlB = 0;
        int jmlCp = 0;
        int jmlC = 0;
        int jmlDp = 0;
        int jmlD = 0;
        int jmlE = 0;
        for (int i = 0; i < banyakSiswa; i++) {
            for (int j = 0; j < banyakSiswaMatpel; j++) {

                if (konversiNilai(siswaMatpelNilai[i][semester][j]).equalsIgnoreCase("A")) {
                    jmlA += 1;
                } else if (konversiNilai(siswaMatpelNilai[i][semester][j]).equalsIgnoreCase("B+")) {
                    jmlBp += 1;
                } else if (konversiNilai(siswaMatpelNilai[i][semester][j]).equalsIgnoreCase("B")) {
                    jmlB += 1;
                } else if (konversiNilai(siswaMatpelNilai[i][semester][j]).equalsIgnoreCase("C+")) {
                    jmlCp += 1;
                } else if (konversiNilai(siswaMatpelNilai[i][semester][j]).equalsIgnoreCase("C")) {
                    jmlC += 1;
                } else if (konversiNilai(siswaMatpelNilai[i][semester][j]).equalsIgnoreCase("D+")) {
                    jmlDp += 1;
                } else if (konversiNilai(siswaMatpelNilai[i][semester][j]).equalsIgnoreCase("D")) {
                    jmlD += 1;
                } else {
                    jmlE += 1;
                }
            }
        }

        for (int i = 0; i < banyakSiswa; i++) {
            System.out.print(siswa[i] + " ");
            if (jmlA != 0) {
                System.out.print("A:" + jmlA + " ");
            }
            if (jmlBp != 0) {
                System.out.print("B+:" + jmlBp + " ");
            }
            if (jmlB != 0) {
                System.out.print("B:" + jmlB + " ");
            }
            if (jmlCp != 0) {
                System.out.print("C+:" + jmlCp + " ");
            }
            if (jmlC != 0) {
                System.out.print("C:" + jmlC + " ");
            }
            if (jmlDp != 0) {
                System.out.print("D+:" + jmlDp + " ");
            }
            if (jmlD != 0) {
                System.out.print("D:" + jmlD + " ");
            }
            if (jmlE != 0) {
                System.out.print("E:" + jmlE + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        String input;
        while (true) {
            input = io.nextLine();
            if (input.equalsIgnoreCase("")) {
                break;
            } else {
                String[] inputSplit = input.split(" ");
                switch (inputSplit[0]) {
                    case "SISWA":
                        tambahSiswa(inputSplit[1]);
                        break;
                    case "PRINT_SISWA":
                        printSiswa();
                        break;
                    case "PRINT_MATPEL":
                        printMatpel();
                        break;
                    case "NILAI":
                        int semester;
                        if (inputSplit[2].equalsIgnoreCase("GANJIL")) {
                            semester = 0;
                            isiDataSiswa(inputSplit[1], semester, inputSplit[3], Integer.parseInt(inputSplit[4]));
                            break;
                        } else {
                            semester = 1;
                            isiDataSiswa(inputSplit[1], semester, inputSplit[3], Integer.parseInt(inputSplit[4]));
                            break;
                        }
                    case "MATPEL":
                        tambahMatpel(inputSplit[1]);
                        break;
                    case "CARI_JUARA":
                        int semesterr;
                        if (inputSplit[1].equalsIgnoreCase("GANJIL")) {
                            semesterr = 0;
                        } else {
                            semesterr = 1;
                        }
                        System.out.print("JUARA_1 " + inputSplit[1] + " ");
                        System.out.print(siswa[cariJuara(semesterr)]);
                        System.out.println("");
                        break;
                    case "PRINT_RAPORT":
                        printRaportSiswa(inputSplit[1]);
                        break;
                    case "HITUNG_NILAI":
                        int semesterrr;
                        if (inputSplit[1].equalsIgnoreCase("GANJIL")) {
                            semesterrr = 0;
                        } else {
                            semesterrr = 1;
                        }
                        hitungNilai(semesterrr);
                        break;
                }
            }
        }
        io.close();
    }
}
