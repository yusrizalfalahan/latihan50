/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo0210117043_latihan50_energikinetik;

/**
 *NAMA       : Yusrizal Falahan
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117043
 * DESKRIPSI PROGRES : Program ini berisi program untuk MENAMPILKAN PERHITUNGAN ENERGIKINETIK
 * @author Acer
 */
public class PBO0210117043_latihan50_Energikinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        energi bola = new energi();
        bola.setMassa(145);
        bola.setKecepatan(25);
        System.out.println("sebuah bola baseball dengan massa: " + bola.getMassa()+"g");
        System.out.println("Bola baeball tersebut dilempar dengan kecepatan: " + bola.getKecepatan()+"m/s");
        double massa = bola.getMassa();
        double kecepatan = bola.getKecepatan();
        System.out.println("A. energi kinetik = " + bola.hitungenergikinetik1(massa, kecepatan));
        System.out.println("B. usaha pada bola  = " + bola.usaha() );
        System.out.println("P.S nilai usaha tetap,karena dimulai dari keadaan diam");
    }
    
}
