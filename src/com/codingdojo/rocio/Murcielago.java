package com.codingdojo.rocio;

public class Murcielago extends Mamifero {

	public Murcielago() {
		super();
		this.nivelDeEnergia=300;
		// TODO Auto-generated constructor stub
	}
	public void volar() {
		System.out.println("Biff!!, a volar");
		nivelDeEnergia -= 50;
	}
	public void comerHumano() {
		System.out.println("Ñammm, a comer!!");
		nivelDeEnergia += 25;
		
	}
	public void atacarPueblo() {
		System.out.println("Aahhhh, cof cof, auxilio!!");
		nivelDeEnergia -= 100;		
	}

}
