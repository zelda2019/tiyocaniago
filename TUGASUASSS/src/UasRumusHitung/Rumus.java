/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UasRumusHitung;

/**
 *
 * @author lab3
 */
public class Rumus {

    public int Rumus(int n1) {
         int x = Integer.valueOf(n1);
         String hitung = Integer.toBinaryString(x);
         int test = Integer.valueOf(hitung);
        return test;
    }
    
    public String Rumus(String n1) {
        int angka = Integer.parseInt(n1);
        String hex = Integer.toHexString(angka);
        return hex;
    }


}
