package br.ufrn.imd.lp.pam.domain;

import java.util.Date;

public class Order {

	private Client client;
	private PhotoPack photoPack;
	private Date requestDate;
	private Date deliveryDate;
	private double totalAmount;
	private Tour tour;
	private OrderStatus orderStatus;

	public Order(Client client, PhotoPack photoPack, Date requestDate, Date deliveryDate, double totalAmount, Tour tour,
			OrderStatus orderStatus) {
		this.client = client;
		this.photoPack = photoPack;
		this.requestDate = requestDate;
		this.deliveryDate = deliveryDate;
		this.totalAmount = totalAmount;
		this.tour = tour;
		this.orderStatus = orderStatus;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public PhotoPack getPhotoPack() {
		return photoPack;
	}

	public void setPhotoPack(PhotoPack photoPack) {
		this.photoPack = photoPack;
	}

	public Date getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Tour getTour() {
		return tour;
	}

	public void setTour(Tour tour) {
		this.tour = tour;
	}

	public String getOrderStatus() {
		return orderStatus.getInfo();
	}
}
