package org.campus02.zinsen.biz;

public class Zinsen {

	private double Kapital;
	private int Tage;
	private double Zinssatz;

	public Zinsen(double Kapital, int Tage, double Zinssatz) {
		this.Kapital = Kapital;
		this.Tage = Tage;
		this.Zinssatz = Zinssatz;
	}

	public double getKapital() {
		return Kapital;
	}

	public void setKapital(double kapital) {
		Kapital = kapital;
	}

	public int getTage() {
		return Tage;
	}

	public void setTage(int tage) {
		Tage = tage;
	}

	public double getZinssatz() {
		return Zinssatz;
	}

	public void setZinssatz(double zinssatz) {
		Zinssatz = zinssatz;
	}

	public double Zinsberechnung() {
		return Kapital * Tage * Zinssatz / 36000.0;
	}

}
