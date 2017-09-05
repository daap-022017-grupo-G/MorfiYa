package model;

import java.util.Date;

public class UserService {
	private User user;
	private Integer credit;
	private String previousMenues;
	private Date dateEstimated;
	private String menu;
	private Integer value;
	
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getCredit() {
		return credit;
	}

	public void setCredit(Integer credit) {
		this.credit = credit;
	}

	public String getPreviousMenues() {
		return previousMenues;
	}

	public void setPreviousMenues(String previousMenues) {
		this.previousMenues = previousMenues;
	}

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

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
	
}
