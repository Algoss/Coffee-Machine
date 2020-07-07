package com.model.drinks;



public class Coffee extends Beverage{

	public Coffee()
	{
		name = "coffee";
		ingredients.put("hot_water",50);
		ingredients.put("hot_milk",10);
		ingredients.put("coffee_syrup",10);
		ingredients.put("sugar_syrup",10);
	}
}
