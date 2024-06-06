package com.jdpattern.Icomposite.menuiterator;

 
import java.util.*;
  
public class CompositeIterator implements Iterator {
	Stack stack = new Stack();
   
	public CompositeIterator(Iterator iterator) {
		stack.push(iterator); //menuComponent.iterator()
	}
   
	public Object next() {
		if (hasNext()) {
			Iterator iterator = (Iterator) stack.peek(); //allmenu menuComponent.iterator() -> pancake CompositeIterator
			MenuComponent component = (MenuComponent) iterator.next(); //allmenu menuComponent.iterator() -> pancake CompositeIterator -> pancake menuComponent.iterator()
			System.out.println(component.getName()); //
			if (component instanceof Menu) {
				stack.push(component.createIterator()); //CompositeIterator를 넣음
			}
			return component;
		} else {
			return null;
		}
	}
  
	public boolean hasNext() {
		if (stack.empty()) {
			return false;
		}else {
			System.out.println("1");
			Iterator iterator = (Iterator) stack.peek(); //menuComponents.iterator() allmenu -> pancake CompositeIterator -> pancake menuComponent.iterator()
			if (!iterator.hasNext()) { //메뉴가 없으면
				stack.pop();
				return hasNext();
			} else {
				return true;
			}
		}
	}
    
	public void remove() {
		throw new UnsupportedOperationException();
	}
}