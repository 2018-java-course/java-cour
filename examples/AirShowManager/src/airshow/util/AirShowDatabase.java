/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airshow.util;

import airshow.AirShow;
import airshow.AirShowCategory;
import calendar.api.CalendarEvent;
import calendar.api.CalendarEventDatabase;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author claudio
 */
public class AirShowDatabase implements CalendarEventDatabase {

    @Override
    public void populate(ArrayList<CalendarEvent> events) {
        AirShow event;
        
        event = new AirShow("Festa dei piloti",LocalDate.of(2018, 6, 29));
        event.setCategory(AirShowCategory.FUN);
        events.add(event);
        
        event = new AirShow("Arona Air Show",LocalDate.of(2018, 6, 30));
        event.setCategory(AirShowCategory.BUSINESS);
        events.add(event);
        
        event = new AirShow("Palermo Air Show",LocalDate.of(2018, 7, 7));
        event.setCategory(AirShowCategory.BUSINESS);
        events.add(event);
    }
    
}
