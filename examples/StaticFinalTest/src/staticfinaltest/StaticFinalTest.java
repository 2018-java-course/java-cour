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
public class StaticFinalTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("At the very beginning of main");
        
        Airport palermoAirport;
        
        System.out.println("After declaration of Airport");
        
        Airport napoliAirport = new Airport("Capodichino");
        
        System.out.println("After the first new airport");
        
        Airport romaAirport = new Airport("Leonardo Da Vinci");
       
        System.out.println("Number of airports in Italy: " + Airport.getNumberOfAirports());
        
        AirportManager airMng = AirportManager.getInstance();
        airMng.incCounter();
        AirportManager airMng2 = AirportManager.getInstance();
        airMng2.incCounter();
        AirportManager airMng3 = AirportManager.getInstance();
        System.out.println("AirportManager counter: "+ airMng3.getCounter());
        
    }

}
