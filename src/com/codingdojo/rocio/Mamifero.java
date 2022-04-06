package com.codingdojo.rocio;

public class Mamifero {
	protected int nivelDeEnergia=100;
	
	public Mamifero() {
		super();
	}

	public Mamifero(int nivelDeEnergia) {
		super();
		this.nivelDeEnergia = nivelDeEnergia;
	}

	public int getNivelDeEnergia() {
		return nivelDeEnergia;
	}

	public void setNivelDeEnergia(int nivelDeEnergia) {
		this.nivelDeEnergia = nivelDeEnergia;
	}
	
	public int mostrarEnergia() {
		System.out.println("Nivel de Energía:"+nivelDeEnergia);
		return nivelDeEnergia;
	}

	

}
