package entities;


public class UsedProduct extends Product{
	private String manufacturedDate;
	
	public UsedProduct () {
		super();
	}

	public UsedProduct(String name, Double price, String date) {
		super(name, price);
		this.manufacturedDate = date;
	}

	public String  getManufacturedDate() {
		return manufacturedDate;
	}

	public void setManufacturedDate(String manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}

	@Override
	public Double priceTag() {
		return super.priceTag();
	}

}
