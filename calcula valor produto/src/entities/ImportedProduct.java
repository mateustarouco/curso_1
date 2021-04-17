package entities;


public class ImportedProduct extends Product  {
  private Double custonFee;
  
  public ImportedProduct () {
	  super();
  }

public ImportedProduct(String name, Double price, Double custonFee2) {
	super(name, price);
	this.custonFee = custonFee2;
}

public Double getCustonFee() {
	return custonFee;
}

public void setCustonFee(Double custonFee) {
	this.custonFee = custonFee;
}
 
@Override
public Double priceTag() {
	super.priceTag() ;
	return super.priceTag() + custonFee;
}
}
