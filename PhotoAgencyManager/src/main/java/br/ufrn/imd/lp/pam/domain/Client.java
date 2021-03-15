package br.ufrn.imd.lp.pam.domain;

import java.util.ArrayList;

public class Client extends Contact {

	private ArrayList<Order> ordersPlaced;

	public Client(String name, String phone) {
		super(name, phone);
		this.ordersPlaced = new ArrayList<Order>();
	}

	public ArrayList<Order> getOrdersPlaced() {
		return ordersPlaced;
	}

	public void setOrdersPlaced(ArrayList<Order> ordersPlaced) {
		this.ordersPlaced = ordersPlaced;
	}

}
