/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118085.latihan6;

/**
 * @author 
 * NAMA                 : RISKY IRFRANSYAH
 * KELAS                : IF-2
 * NIM                  : 10118085
 * DESKRIPSI PROGRAM    : Kambing static & konstanta
 * @author RISKY
 */
public class KambingStatic {
    
// NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING = "MIDUN";
    
    public static void main(String[] args) {
        Mamalia.jumlahKambing = 485000; 
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak " + Mamalia.jumlahKambing);
    }
    
}
