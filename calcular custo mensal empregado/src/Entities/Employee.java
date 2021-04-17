package Entities;

public class Employee {
  private String Name;
  private int Hours;
  private Double valuePerHour;

 public Employee (){
 }


public Employee(String name, int hours, Double valuePerHour) {
	Name = name;
	Hours = hours;
	this.valuePerHour = valuePerHour;
	
}


public String getName() {
	return Name;
}


public void setName(String name) {
	Name = name;
}


public int getHours() {
	return Hours;
}


public void setHours( int hours) {
	Hours = hours;
}


public Double getValuePerHour() {
	return valuePerHour;
}


public void setValuePerHour(Double valuePerHour) {
	this.valuePerHour = valuePerHour;
}
 

 public double payment() {
		return valuePerHour * Hours;
	}


}
 

