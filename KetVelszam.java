// Hozz létre metódust, amely legenerál 2 db. véletlen számot 1-10 között, majd eldönti, hogy 
// a szorzatuk páros vagy páratlan! Az ellenőrzéshez a generált két számot is írjuk ki! 

package ket_velszam;

import java.util.Random;

public class KetVelszam {

    public static void main(String[] args) {
        checkRandomProduct();
    }
    
    public static void checkRandomProduct() {
        Random r = new Random();
        
        int num1 = r.nextInt(10) + 1;
        int num2 = r.nextInt(10) + 1;
        
        System.out.println("A generált számok: " + num1 + " és " + num2 + ".");
        
        int product = num1 * num2;
        
        if (product%2 == 0) {
            System.out.println("A szorzatuk (" + product + ") páros.");
        } else {
            System.out.println("A szorzatuk (" + product + ") páratlan.");
        }
    }
}