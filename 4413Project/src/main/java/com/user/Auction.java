package com.user;

import java.util.ArrayList;

public class Auction {

	private int price; 
	public int getPrice() {
		return price;
	}
	public User getBidder() {
		return bidder;
	}
	public ArrayList<Item> getItems() {
		return items;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setBidder(User bidder) {
		this.bidder = bidder;
	}
	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}
	User bidder;
	private ArrayList<Item> items;
	
}
