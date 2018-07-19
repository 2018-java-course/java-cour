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
public class AirportManager {

    private int counter = 0;
    static AirportManager singleton = new AirportManager();

    private AirportManager() {

    }

    public int getCounter() {
        return counter;
    }

    public void incCounter() {
        counter++;
    }

    public static AirportManager getInstance() {
        return singleton;
    }

}
