
package tugas_1_tipedata_meivayusnita;

import java.util.Scanner;

public class TUGAS_6_TIPEDATA_MEIVAYUSNITA {
    
    static Scanner masukkan = new Scanner(System.in);
            
    public static void main(String[] args) {
        double r,phi,volume;
        
        System.out.println("r= ");
        r = masukkan.nextInt();
        
        phi= 3.14;
        System.out.println("phi= "+phi);
        
        volume= phi *(r*r*r) *4/3;
        System.out.println("volume bola= "+volume);
        
    }
}
