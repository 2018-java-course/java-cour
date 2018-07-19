/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpatterntest;

import java.util.Locale;

/**
 *
 * @author claudio
 */
public class BuilderPatternTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Airplane boeing = new Airplane.Builder()
                .setPassengersCapacity(100)
                .setName("Boeing 747")
                .setCode("Ax123")
                .build();
        
        Airplane.Builder airplaneBuilder = new Airplane.Builder();
        airplaneBuilder.setCode("AB444");
        airplaneBuilder.setName("Airbus A380");
        Airplane airbus = airplaneBuilder.build();
        
        System.out.println("Boeing name: "+boeing.getName());
        System.out.println("Airbus name: "+airbus.getName());
                
    }
    
}
