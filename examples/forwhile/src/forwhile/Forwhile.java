/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forwhile;

import java.util.ArrayList;

/**
 *
 * @author claudio
 */
public class Forwhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[][] ints = new int[5][3];
        ArrayList<String> myArrayList = new ArrayList();
        myArrayList.remove("ciao");

        for (int[] aIntArray : ints) {
            for (int aInt : aIntArray) {
                System.out.print("x");
            }
            System.out.println("");
        }
        
        // `while` and `for` are theoretically interchangable
        // use the control flow that makes more sense to your case
        boolean b = true;
        // this form
        for (;b == true;){}
        // is perfectly equivalent to this
        while (b==true) {}
        
        
    }

}
