package com.codingdojo.rocio;

public class Gorila extends Mamifero {

	public Gorila() {
		super();
		// TODO Auto-generated constructor stub
	}
	public  void lanzarAlgo() {
		
		System.out.println("Ups, en modo tirando cosas");
		this.nivelDeEnergia -= 5;
		
	}
	public   void comerBananas() {
		System.out.println("Deliciosa banana!, me recargue de energ�a");
		this.nivelDeEnergia += 10;
		
	}
	public  void escalar() {
		System.out.println("Me trepe a un super �rbol! me siento cansado");
		this.nivelDeEnergia -= 10;
		
	
	}
	
	
	
}
