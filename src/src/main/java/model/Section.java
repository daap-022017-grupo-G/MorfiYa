package model;
import java.util.ArrayList;
import java.util.List;

public class Section {
	private Integer credit;
	private List<InfoProduct> previousMenues;
	
	public Section() {
		this.previousMenues= new ArrayList<>();
	}

	public Integer getCredit() {
		return credit;
	}

	public void setCredit(Integer credit) {
		this.credit = credit;
	}

	public List<InfoProduct> getPreviousMenues() {
		return previousMenues;
	}

	public void setPreviousMenues(List<InfoProduct> previousMenues) {
		this.previousMenues = previousMenues;
	}

	
}
