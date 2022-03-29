package com.factory;

import java.util.Scanner;

public class GeneratBill {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please Enter your plan Name (Domestic/Industry): ");
		
		String PlanName=sc.next();
		
		GetPlanFactory gpf= new GetPlanFactory();
		
		try {
			
		Plan p = gpf.getPlan(PlanName);
		
		System.out.println("Enter number of Units consumed: ");
		
		int units=sc.nextInt();
		
		
		
		System.out.println("The bill generated for "+PlanName+" plan for "+units+" units is:");
		p.getRate();
		p.calculateBill(units);
		
		}catch (Exception e) {
			//e.printStackTrace();
			System.out.println("Please enter valid plan name ");
		}
		//main(null); //for continuation
		
	}

}
