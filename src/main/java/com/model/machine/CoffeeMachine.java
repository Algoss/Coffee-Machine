package com.model.machine;

import com.model.drinks.Beverage;


import java.util.HashMap;
import java.util.Map;

public class CoffeeMachine {
	private Map<String,Integer> total_ingredients = new HashMap<>();
	public CoffeeMachine()
	{
		total_ingredients.put("hot_water",500);
		total_ingredients.put("hot_milk",500);
		total_ingredients.put("tea_leaves_syrup",100);
		total_ingredients.put("ginger_syrup",100);
		total_ingredients.put("sugar_syrup",100);
		total_ingredients.put("coffee_syrup",100);
		total_ingredients.put("elaichi_syrup",50);
	}
	public boolean prepareDrink(Beverage beverage)
	{
		Map<String,Integer> bIngredients = beverage.getIngredients();

		for (Map.Entry<String,Integer> integerEntry : bIngredients.entrySet())
		{
			Integer total_quantity = total_ingredients.get(integerEntry.getKey());
			Integer required_quantity = integerEntry.getValue();
			if(total_quantity>=required_quantity)
			{
				total_ingredients.put(integerEntry.getKey(),total_quantity-required_quantity);
			}
			else
			{
				System.out.println(beverage.getName() + " cannot be prepared because " + integerEntry.getKey() +  " is not available");
				refill(integerEntry.getKey(),100);
				return false;
			}
		}
		System.out.println(beverage.getName() + " is prepared");
		return true;
	}

	public void refill(String ingredient_name, Integer quantity)
	{
		System.out.println("refilling " + ingredient_name);
		total_ingredients.put(ingredient_name,quantity);
	}
}
