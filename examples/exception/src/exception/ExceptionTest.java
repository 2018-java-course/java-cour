/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author claudio
 */
public class ExceptionTest {

    static double division(double num, double den) throws Exception {
        if (den == 0.0) {
            throw new Exception("Division by zero!!! :(");
        }
        System.out.println("in division dopo aver lanciato l'eccezione");
        return num / den;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            division(2.0, 0.0);
        } catch (Exception ex) {
            Logger.getLogger(ExceptionTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Sono ancora vivo!");
    }
}
