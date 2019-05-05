package com.java.examples.objectoriented.coffee;

import java.util.List;

public class Menu {
	private List<MenuItem> items;

	public Menu(List<MenuItem> items) {
		this.items = items;
	}

	public MenuItem choose(String name) {
		for (MenuItem each : items) {
			if (each.getName().equals(name)) {
				return each;
			}
		}
		return null;
	}
}
