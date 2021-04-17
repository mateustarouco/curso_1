package entities;

import entities.enums.Color;

public class Triangle extends Shape{
	private Double base;
	private Double heigth;

	public Triangle () {
		
	}
	
	
	public Triangle(Color color, Double base, Double heigth) {
		super(color);
		this.base = base;
		this.heigth = heigth;
	}


	public Double getBase() {
		return base;
	}


	public void setBase(Double base) {
		this.base = base;
	}


	public Double getHeigth() {
		return heigth;
	}


	public void setHeigth(Double heigth) {
		this.heigth = heigth;
	}


	@Override
	public double area() {
		
		return base * heigth / 2;
	}

}
