package Item3;

public class Sales {
	private double price;
	private double discountRate;
	
	public void setSale(double set_price, double set_disc) {
		price = set_price;
		discountRate = set_disc;
	}
	
	public double getPrice() {
		return (price*(100-discountRate))/100;
	}
	
	public double getDiscountRate() {
		return discountRate;
	}
}
