package com.avn.tns.abstraction;

public interface Restaurant {
	 void placeOrder(String dish);
	 void cancelOrder(String dish);
	 int MAX_ORDER = 10;
	 String RESTAURANT_NAME = "AVN Gourmet";
	 default void restaurantTimings() {
	        System.out.println("Restaurant timings: 11 AM to 11 PM");
	    }
	 static void info() {
		 System.out.println("Restaurant: " + RESTAURANT_NAME);
	        System.out.println("Max items per order: " + MAX_ORDER);
			}

	    }



