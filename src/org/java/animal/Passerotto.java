package org.java.animal;

import org.java.amanager.Volare;
import org.java.animal.abs.Animal;

public class Passerotto extends Animal implements Volare{

	@Override
	public void verso() {
		System.out.println("Cinguettio");
	}

	@Override
	public void mangia() {
		System.out.println("Cereali");
	}

	@Override
	public void vola() {
		// TODO Auto-generated method stub
		System.out.println("Sono in grado di volare");
	}
}
