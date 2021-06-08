package com.tugaspbo3;


import java.util.Scanner;

public class Zahra_Siswa  {


  public Zahra_Siswa() {

    final double n_mapel1 , n_mapel2 , n_mapel3 , n_mapel4 , n_rata;

    Scanner input = new Scanner(System.in);

    System.out.println(" Aplikasi Interface Menghitung Nilai Rata - Rata \n");

    System.out.print("Nilai Mapel 1: ");
    n_mapel1 = input.nextInt();

    System.out.print("Nilai Mapel 2 : ");
    n_mapel2 = input.nextInt();

    System.out.print("Nilai Mapel 3 : ");
    n_mapel3 = input.nextInt();

    System.out.print("Nilai Mapel 4 : ");
    n_mapel4 = input.nextInt();

    n_rata = (0.15 * n_mapel1 + 0.20 * n_mapel2 + 0.30 * n_mapel3 + 0.35 * n_mapel4);

    System.out.println(" memiliki nilai akhir "+n_rata);

  }

}
