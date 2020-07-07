package com.model.main;

import com.model.drinks.Black_Tea;
import com.model.drinks.Coffee;
import com.model.drinks.Elaichi_Tea;
import com.model.drinks.Ginger_Tea;
import com.model.machine.CoffeeMachine;

public class MainApp {
	public static void main(String[] args) {

		CoffeeMachine coffeeMachine = new CoffeeMachine();
		for(int i=1;i<=5;i++) {
			coffeeMachine.prepareDrink(new Black_Tea());
			coffeeMachine.prepareDrink(new Coffee());
			coffeeMachine.prepareDrink(new Elaichi_Tea());
			coffeeMachine.prepareDrink(new Ginger_Tea());
		}
	}
}
