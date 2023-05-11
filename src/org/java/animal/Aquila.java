package org.java.animal;

import org.java.amanager.Volare;
import org.java.animal.abs.Animal;

public class Aquila extends Animal implements Volare{
	@Override
	public void verso() {
		System.out.println("Grido/strido");
	}

	@Override
	public void mangia() {
		System.out.println("Carne");
	}

	@Override
	public void vola() {
		// TODO Auto-generated method stub
		System.out.println("So volare");
	}

}
