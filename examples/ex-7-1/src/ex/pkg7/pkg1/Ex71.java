/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg7.pkg1;

/**
 *
 * @author claudio
 */
public class Ex71 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String custName = "Steve Smith";
        int spaceIdx = custName.indexOf(' ');
        String firstName = custName.substring(0,spaceIdx);
        
        System.out.println("Index of the first space: " + spaceIdx);
        System.out.println("Customer first name: " + firstName);
           
    }
    
}
