/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wrapperclasses;

/**
 *
 * @author claudio
 */
public class WrapperClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = Integer.parseInt("20");
        String f = "false";
        boolean b = Boolean.valueOf(f);
        
        if (b) {} // this is OK, b is boolean
        
        // if (f) {} // this line do not compile, f is String
        
        System.out.println(a);
        System.out.println(b); // b is converted into String here
    }
    
}
