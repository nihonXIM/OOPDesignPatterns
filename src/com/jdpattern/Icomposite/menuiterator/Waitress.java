package com.jdpattern.Icomposite.menuiterator;

import java.util.Iterator;
  
public class Waitress {
	MenuComponent allMenus;
 
	public Waitress(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}
 
	public void printMenu() {
		allMenus.print();
	}
	
	public void printMenuV(){
		allMenus.printV();
	}
  
	
	public void printVegetarianMenu() {
		Iterator iterator = allMenus.createIterator(); //CompositeIterator

		System.out.println("\nVEGETARIAN MENU\n----");
		while (iterator.hasNext()) { //Composite iterator hasNext();
			MenuComponent menuComponent = 
					(MenuComponent)iterator.next(); //CompositeIterator next();
			//menuComponent.print();
			try {
				if (menuComponent.isVegetarian()) {
					menuComponent.print();
				}
			} catch (UnsupportedOperationException e) { System.out.println("Unsupperted"); }
		}
	}
}
