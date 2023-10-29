package com.bridgelabz.hotelreservation;

public class Hotel {
    public int hotelRatings;
    public String hotelName;
    public int hotelWeekdayRegularCosutumer;

    public int hotelWeekendRegularCosutumer;

    public Hotel(String hotelName, int hotelWeekdayRegularCoustumer, int hotelWeekendRegularCosutumer, int hotelRatings) {

        this.hotelName = hotelName;
        this.hotelWeekdayRegularCosutumer = hotelWeekdayRegularCoustumer;
        this.hotelWeekendRegularCosutumer = hotelWeekendRegularCosutumer;
        this.hotelRatings = hotelRatings;
    }

    public int getHotelWeekendRegularCosutumer() {
        return hotelWeekendRegularCosutumer;
    }

    public String getHotelName() {
        return hotelName;
    }

    public int getHotelRatings() {
        return hotelRatings;
    }

    public int getHotelWeekdayRegularCosutumer() {
        return hotelWeekdayRegularCosutumer;
    }


    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", hotelWeekdayRegularCostumer=" + hotelWeekdayRegularCosutumer +
                ", hotelWeekendRegularCosutumer=" + hotelWeekendRegularCosutumer +
                ",hotelRatings=" + hotelRatings +
                '}';
    }

    public int rateCalculation(String day) {
        if (day.equals("MONDAY") || day.equals("TUESDAY") || day.equals("WEDNESAY") || day.equals("THURSDAY") || day.equals("FRIDAY")) {
            return getHotelWeekdayRegularCosutumer();
        } else {
            return getHotelWeekendRegularCosutumer();
        }

    }
}
