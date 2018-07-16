/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringreferences;

/**
 *
 * @author claudio
 */
public class StringReferences {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s1 = "Hello!";
        String s2 = "Hello!";
        System.out.println("s1 reference: " + Integer.toHexString(System.identityHashCode(s1)));
        System.out.println("s2 reference: " + Integer.toHexString(System.identityHashCode(s2)));
        System.out.println("s2 reference: " + Integer.toHexString(System.identityHashCode("Hello!")));
        
        String s3 = new String("Hello!");
        String s4 = new String();
        s4 = s4.concat("Hello!");
        
        System.out.println("s3 reference: " + Integer.toHexString(System.identityHashCode(s3)));
        System.out.println("s4 reference: " + Integer.toHexString(System.identityHashCode(s4)));        
        
        if (s3 == s4) {  // this is false
            System.out.println("EQUALS");        
        }
    }
    
}
