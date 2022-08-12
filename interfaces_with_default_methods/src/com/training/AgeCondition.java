package com.training;

public interface AgeCondition<T> {
	
	default boolean negate (Double age )
	{
		return age<58;
	}

}
