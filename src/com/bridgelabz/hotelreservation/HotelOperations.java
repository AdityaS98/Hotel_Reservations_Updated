package com.bridgelabz.hotelreservation;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class HotelOperations {
    static ArrayList<Hotel> hotelArrayList = new ArrayList<>();

    public static void main(String[] args) {
        HotelOperations operations = new HotelOperations();
        System.out.println("Welcome to the hotel reservation system");

        Hotel Lakewood = new Hotel("LakeWood", 110, 90, 3);
        Hotel Bridgewood = new Hotel("Bridgewood", 160, 80, 4);
        Hotel Ridgewood = new Hotel("Ridgewood", 220, 150, 5);
        hotelArrayList.add(Lakewood);
        hotelArrayList.add(Bridgewood);
        hotelArrayList.add(Ridgewood);
        System.out.println(hotelArrayList);
        operations.findCheapestHotel();
    }

    public void findCheapestHotel() {

        LocalDate date = LocalDate.of(2020, Month.SEPTEMBER, 11);
        LocalDate date1 = LocalDate.of(2020, Month.SEPTEMBER, 12);
        DayOfWeek localDate1 = date.getDayOfWeek();
        DayOfWeek localDate2 = date1.getDayOfWeek();
        String day1 = String.valueOf(localDate1);
        String day2 = String.valueOf(localDate2);
        System.out.println(day2);
        System.out.println(day1);
        int sum1 = hotelArrayList.get(0).rateCalculation(day1) + hotelArrayList.get(0).rateCalculation(day2);
        int sum2 = hotelArrayList.get(1).rateCalculation(day1) + hotelArrayList.get(1).rateCalculation(day2);
        int sum3 = hotelArrayList.get(2).rateCalculation(day1) + hotelArrayList.get(2).rateCalculation(day2);


        if (sum1 < sum2 && sum1 < sum3) {
            System.out.println("This Rate is for Hotel Lakewood");
            System.out.println("Minimum Rates For The Hotel is :- " + sum1 + "$");

        } else if (sum2 < sum1 && sum2 < sum3) {
            System.out.println("This Rate is for Hotel Bridgewood");
            System.out.println("Minimum Rates For The Hotel is :- " + sum2 + "$");

        } else {
            System.out.println("This Rate is for Hotel Ridgewood");
            System.out.println("Minimum Rates For The Hotel is :- " + sum3 + "$");

        }
    }


}

