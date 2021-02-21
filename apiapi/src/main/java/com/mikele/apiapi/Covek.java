package com.mikele.apiapi;




public class Covek {
	
	private String name;
	private int ocena;

	public Covek() {

		
	}
	public Covek(String name, int ocena) {

		this.name = name;
		this.ocena = ocena;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
