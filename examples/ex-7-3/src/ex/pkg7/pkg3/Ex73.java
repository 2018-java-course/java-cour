/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg7.pkg3;

/**
 *
 * @author claudio
 */
public class Ex73 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int int1;
        
        long l = 1_000_000_000L;
        float f = 0.123456789f;
        char c = 'C';
        
        System.out.println("Long is: " + l);
        
        int1 = (int)l;
        System.out.println("Int is: " + int1);
        
        // Note that last digits are different
        System.out.format("Float is :%.10f%n", f);
        
        System.out.println("Char is: " + c);
    }
    
}
