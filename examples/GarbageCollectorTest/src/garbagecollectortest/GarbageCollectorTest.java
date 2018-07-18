/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garbagecollectortest;

/**
 *
 * @author claudio
 */
public class GarbageCollectorTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Profile this application with the "Profile Project" and Telemetry
        // This application has an endless loop, you have to stop it manually
        // in the profiler window (red square)
        
        while (true) {
            
            // Comment/decomment the bigclass or smallClass case
            
//            BigClass bigClass = new BigClass();    
//            System.out.println("hello " + bigClass.lotsOfNumbers.length);

            SmallClass smallClass = new SmallClass();
            System.out.println("hello " + smallClass.fewNumbers.length);

        }

    }

    private static class BigClass {

        int[] lotsOfNumbers = new int[1_000_000];

        public BigClass() {
        }
    }

    private static class SmallClass {

        int[] fewNumbers = new int[10];

        public SmallClass() {
        }
    }

}
