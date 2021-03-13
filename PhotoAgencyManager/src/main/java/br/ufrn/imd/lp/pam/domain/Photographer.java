package br.ufrn.imd.lp.pam.domain;

import java.util.ArrayList;

public class Photographer extends Contact {

	private int salesAmount;
	private ArrayList<Tour> tours;
	
	public Photographer(String name, String phone, int salesAmount) {
		super(name, phone);
		this.salesAmount = salesAmount;
		this.tours = new ArrayList<Tour>();
	}
	public int getSalesAmount() {
		return salesAmount;
	}
	public void setSalesAmount(int salesAmount) {
		this.salesAmount = salesAmount;
	}
	public ArrayList<Tour> getTours() {
		return tours;
	}
	public void setTours(ArrayList<Tour> tours) {
		this.tours = tours;
	}
}
