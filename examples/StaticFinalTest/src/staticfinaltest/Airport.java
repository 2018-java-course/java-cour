/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticfinaltest;

/**
 *
 * @author claudio
 */
public class Airport {

    static int numberOfAirports = 0;
    
    static final int STATIC_FINAL_VAR;

    private final String name;

    static {
        System.out.println("Static block in Airport");
        numberOfAirports = 5;
        STATIC_FINAL_VAR = 0;
    }

    Airport(String name) {
        this.name = name;
        numberOfAirports++;
        System.out.println("Creating an instance of Airport with name " + name);
    }

    static int getNumberOfAirports() {
        return numberOfAirports;
    }
}
