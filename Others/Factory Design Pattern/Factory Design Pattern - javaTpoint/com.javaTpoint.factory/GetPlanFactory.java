package com.javaTpoint.factory;

public class GetPlanFactory {
	Plan getPlan(String planType) {
		if (planType.equals("CommercialPlan")) {
			return new CommercialPlan();
		} else if (planType.equals("DomesticPlan")) {
			return new DomesticPlan();
		} else if (planType.equals("institutionalPlan")) {
			return new InstitutionalPlan();
		}
		return null;
	}
}
