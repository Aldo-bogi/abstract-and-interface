/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstrak;
/**
 *
 * @author jauza
 */
public  class Main {
    public static void main(String[]argv){
        SegitigaSamaKaki stsk = new SegitigaSamaKaki() {};
        stsk.alas = 10;
        stsk.tinggi = 4;
        stsk.hitungLuas();
        stsk.hitungKeliling();
        System.out.println("Luas STSK = "+stsk.luas);
        System.out.println("Keliling STSK = "+stsk.keliling);
    }
}
