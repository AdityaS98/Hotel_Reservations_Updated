package com.bridgelabz.hotelreservation;

import java.util.ArrayList;

public class HotelOperations {
    public static void main(String[] args) {
        System.out.println("Welcome to the hotel reservation system");

        ArrayList<Hotel> hotelArrayList = new ArrayList<>();
        Hotel Lakewood = new Hotel("LakeWood", 110);
        Hotel Bridgewood = new Hotel("Bridgewood", 160);
        Hotel Ridgewood = new Hotel("Ridgewood", 220);
        hotelArrayList.add(Lakewood);
        hotelArrayList.add(Bridgewood);
        hotelArrayList.add(Ridgewood);
        System.out.println(hotelArrayList);
    }
}
