package br.ufrn.imd.lp.pam.domain;

import java.util.ArrayList;
import java.util.Date;

public class Tour {

	private String name;
	private Date date;
	private int peopleAmout;
	private double totalSalesValue;
	private Photographer photographer;
	private int salesAmount;
	private Company company;
	private ArrayList<Order> orders;
	private TourType tourType;
	
	public Tour(String name, Date date, int peopleAmout, double totalSalesValue, Photographer photographer,
			int salesAmount, Company company, ArrayList<Order> orders, TourType tourType) {
		super();
		this.name = name;
		this.date = date;
		this.peopleAmout = peopleAmout;
		this.totalSalesValue = totalSalesValue;
		this.photographer = photographer;
		this.salesAmount = salesAmount;
		this.company = company;
		this.orders = new ArrayList<Order>();
		this.tourType = tourType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getPeopleAmout() {
		return peopleAmout;
	}
	public void setPeopleAmout(int peopleAmout) {
		this.peopleAmout = peopleAmout;
	}
	public double getTotalSalesValue() {
		return totalSalesValue;
	}
	public void setTotalSalesValue(double totalSalesValue) {
		this.totalSalesValue = totalSalesValue;
	}
	public Photographer getPhotographer() {
		return photographer;
	}
	public void setPhotographer(Photographer photographer) {
		this.photographer = photographer;
	}
	public int getSalesAmount() {
		return salesAmount;
	}
	public void setSalesAmount(int salesAmount) {
		this.salesAmount = salesAmount;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public ArrayList<Order> getOrders() {
		return orders;
	}
	public void setOrders(ArrayList<Order> orders) {
		this.orders = orders;
	}
	public String getTourType() {
		return tourType.getInfo();
	}
}
