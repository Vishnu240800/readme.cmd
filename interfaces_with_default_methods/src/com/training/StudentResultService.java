package com.training;

import com.training.ifaces.Conditional;

public class StudentResultService implements Conditional<Double>,AgeCondition<Double> {

	@Override
	public boolean test(Double t) {
	
		return t>80;
	}

	@Override
	public boolean negate(Double value) {
		// TODO Auto-generated method stub
		
		
		if (value > 100)
		{
			return true;
			
		}
		else 
		{
			return false;
		}
		
		
		//calling one of the super type
		/*boolean result1 = Conditional.super.negate(value);
		return result1;
		*/
		
		//calling both of the super type
		/*boolean result2 = AgeCondition.super.negate(value);
		if (result1 && result2)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}*/
	

	}
}
