package ezen.shoppingmall;

public class Cookies extends Item {
	private String expirationDate;

	public Cookies() {
	}

	public Cookies(int id, String name, int price, String expirationDate) {
		super(id, name, price);
		this.expirationDate = expirationDate;
	}

	public String getExpirationDate() {
		return expirationDate;
	}


	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	
	public String toString() {
		return super.toString()+"\t"+expirationDate;
	}

}
