/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author ACER
 */
public class TumpukanApp {
    public static void main(String[] args) {
        Tumpukan tumpukan =  new Tumpukan(10);
        tumpukan.push(50);
        tumpukan.baca();
        tumpukan.push(100);
        tumpukan.baca();
        tumpukan.pop();
        tumpukan.baca();
        tumpukan.push(60);
        tumpukan.baca();
        tumpukan.push(80);
        tumpukan.baca();
        tumpukan.pop();
        tumpukan.baca();
        long nilaitop = tumpukan.peek();
        System.out.print("nilaitop = " +nilaitop);
        System.out.println(" ");
        
    }
}
