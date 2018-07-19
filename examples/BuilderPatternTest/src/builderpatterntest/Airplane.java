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
public class Airplane {

    private int passengersCapacity;
    private String name;
    private String code;
    private double currentFuel;
    
    private Airplane() {
        
    }

    public int getPassengersCapacity() {
        return passengersCapacity;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public double getCurrentFuel() {
        return currentFuel;
    }
    
    

//    private Airplane(int passengersCapacity, String name, String code) {
//        this.passengersCapacity = passengersCapacity;
//        this.name = name;
//        this.code = code;
//    }

    public static class Builder {
        private Airplane airplane;
        public Builder() {
            this.airplane = new Airplane();
        }
        public Builder setPassengersCapacity(int passengersCapacity) {
            this.airplane.passengersCapacity = passengersCapacity;
            return this;
        }
        public Builder setName(String name) {
            this.airplane.name = name;
            return this;
        }
        public Builder setCode(String code) {
            this.airplane.code = code;
            return this;
        }
        public Airplane build() {
            return this.airplane;
        }
    }
}
