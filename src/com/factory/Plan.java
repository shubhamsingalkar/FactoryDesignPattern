package com.factory;

public abstract class Plan {
	
	double rate;
	
	 abstract void getRate();
	
	public void calculateBill(int Units) {
		
		double total=rate*Units;
		
		System.out.println(total);
	}

}


/*A Factory Pattern or Factory Method Pattern says that just define an interface or abstract class for creating an object 
but let the subclasses decide which class to instantiate. 
In other words, subclasses are responsible to create the instance of the class.*/