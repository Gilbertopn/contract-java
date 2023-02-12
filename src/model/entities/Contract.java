package model.entities;

import java.util.Date;

public class Contract {

	private Integer number;
	private Date date;
	private Double totalValue;
	
	private Installment instalments;

	public Contract() {
		
	}
	
	public Contract(Integer number, Date date, Double totalValue, Installment instalments) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
		this.instalments = instalments;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public Installment getInstalments() {
		return instalments;
	}

	public void setInstalments(Installment instalments) {
		this.instalments = instalments;
	}
	
	
	
}
