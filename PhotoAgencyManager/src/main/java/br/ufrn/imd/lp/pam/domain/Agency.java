package br.ufrn.imd.lp.pam.domain;

public class Agency extends Contact {

	private double totalMonthlyAmount;
	private double expense;
	private double fund;
	private double totalPaidCompany;

	public Agency(String name, String phone, double totalMonthlyAmount, double expense, double fund,
			double totalPaidCompany) {
		super(name, phone);
		this.totalMonthlyAmount = totalMonthlyAmount;
		this.expense = expense;
		this.fund = fund;
		this.totalPaidCompany = totalPaidCompany;
	}

	public double getTotalMonthlyAmount() {
		return totalMonthlyAmount;
	}

	public void setTotalMonthlyAmount(double totalMonthlyAmount) {
		this.totalMonthlyAmount = totalMonthlyAmount;
	}

	public double getExpense() {
		return expense;
	}

	public void setExpense(double expense) {
		this.expense = expense;
	}

	public double getFund() {
		return fund;
	}

	public void setFund(double fund) {
		this.fund = fund;
	}

	public double getTotalPaidCompany() {
		return totalPaidCompany;
	}

	public void setTotalPaidCompany(double totalPaidCompany) {
		this.totalPaidCompany = totalPaidCompany;
	}

}
