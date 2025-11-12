package com.avn.tns.abstraction;

public class Customer implements Restaurant {
	public void placeOrder(String dish) {
        if (currentOrders < MAX_ORDER) {
            currentOrders++;
            System.out.println("Order placed: " + dish + ". Total orders: " + currentOrders);
        } else {
            System.out.println("⚠ Cannot place more than " + MAX_ORDER + " items in one order!");
        }
    }


}
