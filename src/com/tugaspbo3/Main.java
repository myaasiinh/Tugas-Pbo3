package com.tugaspbo3;

import java.util.Scanner;

public class Main {

    private static Object Siswa;

    public static void main(String[] hady) {


        //Membuat objek Hp
        Zahra_Siswa Yaasiin = new Zahra_Siswa();
        Siswa_Kelas Amelia = new Siswa_Kelas();


        Scanner input = new Scanner(System.in);
        String aksi;

        while (true) {

            aksi = input.nextLine();
           if (aksi.equalsIgnoreCase("0")) {
                System.exit(0);
            } else {
                System.out.println("Kamu salah pilih");
            }

            System.out.println("0.Keluar");

        }
    }
}
