
package tugas_1_tipedata_meivayusnita;  

import java.util.Scanner;

public class TUGAS_3_TIPEDATA_MEIVAYUSNITA {
    
    static Scanner masukkan = new Scanner(System.in);
    
    public static void main(String[] args) {
        double  luas, alas, tinggi = 0; 
        
       
        System.out.println("alas = ");
        alas = masukkan . nextDouble();
        
        System.out.println("tinggi = "+tinggi);
        tinggi = masukkan . nextDouble();
        
        luas = alas * tinggi /2; 
        System.out.println("Luas Segitiga = "+luas);
        luas = masukkan . nextDouble();
        

    }
 
}
