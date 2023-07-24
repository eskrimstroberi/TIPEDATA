
package tugas_1_tipedata_meivayusnita;

import java.util.Scanner;

public class TUGAS_4_TIPEDATA_MEIVAYUSNITA {
  
    static Scanner masukkan = new Scanner(System.in);
    
    public static void main(String[] args) {
        double volume, tinggiSegitiga, alasSegitiga, luasAlas, tinggiLimas;
       
        System.out.println("Alas Segitiga = ");
        alasSegitiga = masukkan . nextDouble();
        
        System.out.println("Tinggi Segitiga = ");
        tinggiSegitiga = masukkan . nextDouble();
        
        luasAlas = alasSegitiga * tinggiSegitiga / 2; 
        System.out.println("Luas Alas = "+luasAlas);
       
        System.out.println("Tinggi Limas = "); 
        tinggiLimas = masukkan . nextDouble();
        
        volume = luasAlas * tinggiLimas / 3; 
        System.out.println("Volume Limas = "+volume);
    }
}
