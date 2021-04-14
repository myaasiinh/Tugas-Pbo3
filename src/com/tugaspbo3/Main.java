package com.tugaspbo3;

import java.util.Scanner;

public class Main {

    private static Object Siswa;

    public static void main(String[] hady) {


        //Membuat objek Hp
        Siswa Yaasiin = (com.tugaspbo3.Siswa) new Zahra_Siswa();
        Siswa_Kelas Amelia = new Siswa_Kelas(Yaasiin);

        //Coba nyalakan Hp
        Amelia.mata_pelajaran1();

        Scanner input = new Scanner(System.in);
        String aksi;

        while (true) {

            System.out.println("Aplikasi Interface");
            System.out.println("1.Nilai mapel 1");
            System.out.println("2.Nilai mapel 2");
            System.out.println("3.Nilai  mapel 3");
            System.out.println("4.Nilai mapel 4");
            System.out.println("5.Keluar");
            System.out.println("Pejet salah satu pilihan :");
            aksi = input.nextLine();


            if (aksi.equalsIgnoreCase("1")) {
                Amelia.mata_pelajaran1();
            } else if (aksi.equalsIgnoreCase("2")) {
                Amelia.mata_pelajaran2();
            } else if (aksi.equalsIgnoreCase("3")) {
                Amelia.mata_pelajaran3();
            } else if (aksi.equalsIgnoreCase("4")) {
                Amelia.mata_pelajaran4();
            } else if (aksi.equalsIgnoreCase("5")) {
                System.exit(5);
            } else {
                System.out.println("Kamu salah pilih");
            }
        }
    }
}
