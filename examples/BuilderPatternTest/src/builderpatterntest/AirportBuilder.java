/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpatterntest;


public class AirportBuilder {

    private int a;
    private int b;
    private String s;

    public AirportBuilder() {
    }

    public AirportBuilder setA(int a) {
        this.a = a;
        return this;
    }

    public AirportBuilder setB(int b) {
        this.b = b;
        return this;
    }

    public AirportBuilder setS(String s) {
        this.s = s;
        return this;
    }

    public Airport createAirport() {
        return Airport.create(a, b, s);
    }
    
}
