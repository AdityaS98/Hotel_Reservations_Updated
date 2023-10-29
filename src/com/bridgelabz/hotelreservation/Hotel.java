package com.bridgelabz.hotelreservation;

public class Hotel {

    public String hotelName;
    public int hotelWeekdayRegularCosutumer;

    public Hotel(String hotelName, int hotelWeekdayRegularCoustumer) {

        this.hotelName = hotelName;
        this.hotelWeekdayRegularCosutumer = hotelWeekdayRegularCoustumer;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", hotelWeekdayRegularCostumer=" + hotelWeekdayRegularCosutumer +
                '}';
    }
}
