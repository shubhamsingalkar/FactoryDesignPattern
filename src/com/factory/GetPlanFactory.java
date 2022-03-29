package com.factory;



public class GetPlanFactory {


	public Plan getPlan(String planType) {


		if(planType==null) {

			return null;
		}

		if(planType.equalsIgnoreCase("Domestic")) {

			return new DomesticPlan();
		}

		else if(planType.equalsIgnoreCase("INDUSTRY")) {

			return new IndustryPlan();
		}
		return null;


	}

}

