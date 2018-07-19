/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package varargstest;

/**
 *
 * @author claudio
 */
public class VarArgsTest {

    static int sum(String str, double boh, int... ints) {
        int finalSum = 0;
        for (int aInt : ints) {
            finalSum += aInt;
        }
        return finalSum;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        System.out.println("somma: "+ sum());
//        System.out.println("somma: "+ sum(1));
//        System.out.println("somma: "+ sum(1,2));
//        System.out.println("somma: "+ sum(1,2,3));
        int[] ints = {1, 2, 3};
//        System.out.println("somma: " + sum(ints));
        System.out.println("somma: " + sum("somma", 0.0, 1, 2, 3, 4));

    }

}
