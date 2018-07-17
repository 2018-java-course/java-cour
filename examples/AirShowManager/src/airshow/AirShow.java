/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airshow;

import calendarmanager.CalendarEvent;
import java.time.LocalDate;

/**
 *
 * @author claudio
 */
public class AirShow implements CalendarEvent {
    
    
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
    private String category;

    AirShow(String name, LocalDate startDate, LocalDate endDate) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    AirShow(String name, LocalDate date) {
        this(name, date, date);
    }

    public String getName() {
        return name;
    }

    
    @Override
    public LocalDate getStartDate() {
        return startDate;
    }

    @Override
    public LocalDate getEndDate() {
        return endDate;
    }

    @Override
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String getTitle() {
        return getName();
    }

}
