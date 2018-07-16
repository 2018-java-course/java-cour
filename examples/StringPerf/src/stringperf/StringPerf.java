/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringperf;

/**
 *
 * @author claudio
 */
public class StringPerf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Use profile project on netbeans to test performances
        int nIterations =200_000;
        
        // Leave uncommented only one of the following two blocks,
        // and run performances test
        
        // String concat implementation
        String s1 = "";
        for (int idx = 0; idx < nIterations; idx++) {
            s1 = s1.concat(".");
        }
        System.out.println(s1.length());
        
        // String builder implementation
//        StringBuilder sb = new StringBuilder();
//        for (int idx = 0; idx < nIterations; idx++) {
//            sb.append(".");
//        }
//        String s2 = sb.toString();
//        System.out.println(s2.length());
        
    }
    
}
