/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menukar.pkg2.buah.bilangan;

/**
 *
 * @author USER
 */
public class Menukar2BuahBilangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Menukar 2 Buah Bilangan
        int a=34, b=3, c;
        System.out.println("Sebelum Ditukar");
        System.out.println("a = "+a+"b = "+b);
        c=a;a=b;b=c;
        System.out.println("Setelah Ditukar");
        System.out.println("a = "+a+"b = "+b);
    }
    
}
