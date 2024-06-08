package com.jdpattern.Icomposite.menuiterator;

import java.util.Iterator;
import java.util.ArrayList;

public class Menu extends MenuComponent {
	Iterator<MenuComponent> iterator = null;
	ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
	String name;
	String description;

	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public void add(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
	}

	public void remove(MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
	}

	public MenuComponent getChild(int i) {
		return menuComponents.get(i);
	}

	public ArrayList<MenuComponent> getAllChild() {
		return menuComponents;
	}


	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}


	public Iterator<MenuComponent> createIterator() {
		if (iterator == null) {
			iterator = new CompositeIterator(menuComponents.iterator());
		}

//		Iterator<MenuComponent> iterator2 = null;
//		iterator2 = new NewIterator();


		return iterator;
	}


	public void print() {
		System.out.print("\n" + getName());
		System.out.println(", " + getDescription());
		System.out.println("---------------------");

		Iterator<MenuComponent> iterator = menuComponents.iterator();
		while (iterator.hasNext()) {
			MenuComponent menuComponent = iterator.next();
			if(menuComponent instanceof Menu){
				System.out.print("***Menu");
//				menuComponent.print();

			}else{
				System.out.print("***MenuItem");
//				menuComponent.print();

			}
			menuComponent.print();
		}
	}
}
