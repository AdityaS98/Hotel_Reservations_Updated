package com.bridgelabz.hotelreservation;

import java.io.IOException;

public class Hotel {
    public int hotelRatings;
    public String hotelName;
    public int hotelWeekdayRegularCosutumer;

    public int hotelWeekendRegularCosutumer;
    public int hotelWeekdayRewardCostumer;
    public int hotelWeekendRewardCostumer;

    public Hotel(String hotelName, int hotelWeekdayRegularCoustumer, int hotelWeekendRegularCosutumer, int hotelRatings, int hotelWeekdayRewardCostumer, int hotelWeekendRewardCostumer) {

        this.hotelName = hotelName;
        this.hotelWeekdayRegularCosutumer = hotelWeekdayRegularCoustumer;
        this.hotelWeekendRegularCosutumer = hotelWeekendRegularCosutumer;
        this.hotelRatings = hotelRatings;
        this.hotelWeekdayRewardCostumer = hotelWeekdayRewardCostumer;
        this.hotelWeekendRewardCostumer = hotelWeekendRewardCostumer;
    }

    public int getHotelWeekendRegularCosutumer() {
        return hotelWeekendRegularCosutumer;
    }

    public int getHotelWeekdayRewardCostumer() {
        return hotelWeekdayRewardCostumer;
    }

    public int getHotelWeekendRewardCostumer() {
        return hotelWeekendRewardCostumer;
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
                ",hotelWeekdayRewardCostumer=" + hotelWeekdayRewardCostumer +
                ",hotelWeekendRewardCostumer=" + hotelWeekendRewardCostumer +
                '}';
    }

    public int rateCalculation(String day, int x) {

        try {


            if (day.equals("MONDAY") || day.equals("TUESDAY") || day.equals("WEDNESAY") || day.equals("THURSDAY") || day.equals("FRIDAY")) {
                if (x == 1) {

                    return getHotelWeekdayRegularCosutumer();

                } else {
                    return getHotelWeekdayRewardCostumer();
                }
            } else {
                if (x == 1) {
                    return getHotelWeekendRegularCosutumer();
                } else {
                    return getHotelWeekendRewardCostumer();

                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return 0;
    }
}