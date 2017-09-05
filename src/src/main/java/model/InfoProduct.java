package model;

import java.util.Date;

public class InfoProduct {
	private Date dateEstimated;
	private String menu;
	private Integer score;
	private Integer value;
	private Date dateOfSale;
	private Boolean wantDelivery;
	public Date getDateEstimated() {
		return dateEstimated;
	}
	public void setDateEstimated(Date dateEstimated) {
		this.dateEstimated = dateEstimated;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	public Date getDateOfSale() {
		return dateOfSale;
	}
	public void setDateOfSale(Date dateOfSale) {
		this.dateOfSale = dateOfSale;
	}
	public Boolean getWantDelivery() {
		return wantDelivery;
	}
	public void setWantDelivery(Boolean wantDelivery) {
		this.wantDelivery = wantDelivery;
	}
	
	
	
}
