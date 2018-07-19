/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equalshashtest;

import java.util.Objects;

/**
 *
 * @author claudio
 */
public class Airplane {
    private final int capacity = 480;
    private final String name = "Boeing 707";
    private double currentFuel = 0.0;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.capacity;
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.currentFuel) ^ (Double.doubleToLongBits(this.currentFuel) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Airplane other = (Airplane) obj;
        if (this.capacity != other.capacity) {
            return false;
        }
        if (Double.doubleToLongBits(this.currentFuel) != Double.doubleToLongBits(other.currentFuel)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    
}
