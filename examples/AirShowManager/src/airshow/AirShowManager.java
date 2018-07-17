/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airshow;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 *
 * @author claudio
 */
public class AirShowManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AirShow[] events= new AirShow[3];
        
        events[0] = new AirShow("Festa dei piloti",LocalDate.of(2018, 6, 29));
        events[0].setCategory(AirShowCategory.FUN);
        
        events[1] = new AirShow("Arona Air Show",LocalDate.of(2018, 6, 30));
        events[0].setCategory(AirShowCategory.BUSINESS);
        
        events[2] = new AirShow("Palermo Air Show",LocalDate.of(2018, 7, 7));
        events[0].setCategory(AirShowCategory.BUSINESS);        
        
        for (AirShow event : events) {
            System.out.format("Event: %s, from %s to %s, category %s%n", event.getTitle(),event.getStartDate().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)),event.getEndDate().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)),event.getCategory()==null?"none":event.getCategory());
        }
    }
    
}
