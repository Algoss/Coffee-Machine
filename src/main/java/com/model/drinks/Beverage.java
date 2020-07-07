package com.model.drinks;

import java.util.HashMap;
import java.util.Map;

public abstract class Beverage {
	Map<String,Integer> ingredients = new HashMap<>();
	String name;

	public Map<String, Integer> getIngredients() {
		return ingredients;
	}

	public void setIngredients(Map<String, Integer> ingredients) {
		this.ingredients = ingredients;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
