/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo0210117043_latihan50_energikinetik;

/**
 *
 * @author Acer
 */
public class energi {
    private double massa;
    private double kecepatan;
    private double energikinetik1;
    private double energikinetik2;

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }
    public double hitungenergikinetik1(double n, double k){
      energikinetik1 = 0.5 * n * (k*k);
      return energikinetik1;
    }
   public void hitungenergikinetik2(double m){
       this.energikinetik2= 0.5*m*0;
   }
   public double usaha (){
       return energikinetik1 - energikinetik2;
   }
    
}