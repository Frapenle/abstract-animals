package org.java.animal;

import org.java.amanager.Nuotare;
import org.java.animal.abs.Animal;

public class Delfino extends Animal implements Nuotare{

	@Override
	public void verso() {
		System.out.println("clicks, burst pulsed sound");
	}

	@Override
	public void mangia() {
		System.out.println("Pesce");
	}

	@Override
	public void nuota() {
		// TODO Auto-generated method stub
		System.out.println("So nuotare");
	}
}
