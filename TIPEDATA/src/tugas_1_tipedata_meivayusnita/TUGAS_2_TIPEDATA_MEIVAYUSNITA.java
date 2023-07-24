
package tugas_1_tipedata_meivayusnita;

public class TUGAS_2_TIPEDATA_MEIVAYUSNITA {
    public static void main(String[] args) {
        int volume, tinggiSegitiga, alasSegitiga, luasAlas, tinggiLimas;
        
        alasSegitiga = 6;
        tinggiSegitiga = 8;
        tinggiLimas = 8; 
        
        luasAlas = alasSegitiga * tinggiSegitiga / 2; 
        volume = luasAlas * tinggiLimas / 3; 
        
        System.out.println("Alas Segitiga = "+alasSegitiga);
        System.out.println("Tinggi Segitiga = "+tinggiSegitiga);
        System.out.println("Luas Alas = "+luasAlas);
        System.out.println("Tinggi Limas = "+tinggiLimas);    
        System.out.println("Volume Limas = "+volume);
                
    }
}
