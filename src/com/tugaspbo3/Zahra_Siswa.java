package com.tugaspbo3;


import java.util.Scanner;

public class Zahra_Siswa extends Siswa_Kelas {


  public Zahra_Siswa() {
    super();

    final double n_mat , n_bindo , n_binggris , n_ipa , n_rata;

    Scanner input = new Scanner(System.in);

    System.out.println("===== Menghitung Nilai Rata - Rata =====\n");

    System.out.print("Nilai tugas : ");
    n_mat = input.nextInt();

    System.out.print("Nilai kuis : ");
    n_bindo = input.nextInt();

    System.out.print("Nilai uts : ");
    n_binggris = input.nextInt();

    System.out.print("Nilai uas : ");
    n_ipa = input.nextInt();

    n_rata = (0.15 * n_mat + 0.20 * n_bindo + 0.30 * n_binggris + 0.35 * n_ipa);

    System.out.println(" memiliki nilai akhir "+n_rata);


  }

  @Override
  public void mata_pelajaran1() {

  }

  @Override
  public void mata_pelajaran2() {

  }

  @Override
  public void mata_pelajaran3() {

  }

  @Override
  public void mata_pelajaran4() {

  }

}
