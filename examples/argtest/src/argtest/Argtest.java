/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package argtest;

/**
 *
 * @author claudio
 */
public class Argtest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arg0 = Integer.parseInt(args[0]);
        int arg1 = Integer.parseInt(args[1]);
        System.out.println("Total is: " + (arg0 + arg1));
    }
    
}
