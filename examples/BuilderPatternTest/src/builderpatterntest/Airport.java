/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpatterntest;

/**
 *
 * @author claudio
 */
public class Airport {

    static Airport create(int a, int b, String s) {
        return new Airport(a, b, s);
    }
    private int a;
    private int b;
    private String s;
    
    private Airport(int a, int b, String s) {
        this.a = a;
        this.b = b;
        this.s = s;
    }
}
