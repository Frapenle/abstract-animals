package org.java.animal;

import org.java.amanager.Nuotare;
import org.java.animal.abs.Animal;

public class Cane extends Animal implements Nuotare{

	@Override
	public void verso() {
		System.out.println("Bau...");
	}

	@Override
	public void mangia() {
		System.out.println("Carne");
	}

	@Override
	public void nuota() {
		// TODO Auto-generated method stub
		System.out.println("So nuotare");
	}
}
