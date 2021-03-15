package br.ufrn.imd.lp.pam.domain;

import java.util.ArrayList;

public class Company extends Contact {

	private double totalMonthlyAmount;
	private ArrayList<Tour> tours;
	private ArrayList<Client> clients;

	public Company(String name, String email, double totalMonthlyAmount, ArrayList<Tour> tours,
			ArrayList<Client> clients) {
		super(name, email);
		this.totalMonthlyAmount = totalMonthlyAmount;
		this.tours = new ArrayList<Tour>();
		this.clients = new ArrayList<Client>();
	}

	public double getTotalMonthlyAmount() {
		return totalMonthlyAmount;
	}

	public void setTotalMonthlyAmount(double totalMonthlyAmount) {
		this.totalMonthlyAmount = totalMonthlyAmount;
	}

	public ArrayList<Tour> getTours() {
		return tours;
	}

	public void setTours(ArrayList<Tour> tours) {
		this.tours = tours;
	}

	public ArrayList<Client> getClients() {
		return clients;
	}

	public void setClients(ArrayList<Client> clients) {
		this.clients = clients;
	}
	
	public void totalToursMonth() {
		
	}
}
