package org.java;

import org.java.amanager.AnimalManager;
import org.java.animal.Aquila;
import org.java.animal.Cane;
import org.java.animal.Delfino;
import org.java.animal.Passerotto;
import org.java.animal.abs.Animal;

public class Main {
	public static void main(String[] args) {
		Cane cane = new Cane();
		Passerotto passerotto = new Passerotto();
		Aquila aquila = new Aquila();
		Delfino delfino = new Delfino();
		
		Animal[] animals = {cane, passerotto, aquila, delfino};
		
		for (Animal animal : animals) {
			animal.dormi();
			animal.mangia();
			animal.verso();
			System.out.println("---------");
		}
		
		AnimalManager animalManager = new AnimalManager();
		System.out.print("Aquila: ");
		animalManager.faiVolare(aquila);
		
		System.out.print("Passerotto: ");
		animalManager.faiVolare(passerotto);
		
		System.out.print("Delfino: ");
		animalManager.faiNuotare(delfino);
		
		System.out.print("Cane: ");
		animalManager.faiNuotare(cane);
	}
}
