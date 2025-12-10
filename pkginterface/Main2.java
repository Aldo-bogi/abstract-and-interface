/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkginterface;

/**
 *
 * @author aldo
 */
    public class Main {
 public static void main(String[] argv) {
  SegiEmpat se = new SegiEmpat();
  se.lebar = 10;
  se.panjang = 10;
  se.hitungLuas();
  se.hitungKeliling();
  System.out.println("Luas sebelum diperbesar = "+se.luas);
  System.out.println("Keliling sebelum diperbesar = "+se.keliling);
  se.perbesar();
  se.hitungLuas();
  se.hitungKeliling();
  System.out.println("Luas setelah diperbesar = "+se.luas);
  System.out.println("Keliling setelah diperbesar = "+se.keliling);
  // Output:
  // Luas sebelum diperbesar = 100.0
  // Keliling sebelum diperbesar = 40.0
  // Luas setelah diperbesar = 400.0
  // Keliling setelah diperbesar = 80.0
 }
}


