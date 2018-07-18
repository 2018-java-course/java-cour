/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming;

/**
 *
 * @author claudio
 */
public class Programming {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 0xff; // exadecimal
        System.out.println("a: "+a);
        // we can create code blocks wherever we want
        {
            int b = 0b100; // binary
            System.out.println("b: "+b);
            {
                int c = a+b;
                System.out.println("c: "+c);
            }
//            System.out.println(c); // doesn't work, we do not see c here
        }
        
    }
    
}
