package org.campus02.zinsen.app;

import org.campus02.zinsen.biz.Zinsen;

public class Zinsendemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Zinsen rechner = new Zinsen(1000, 3, 0.75);

		System.out.println("Zinsen = " + rechner.Zinsberechnung());

	}

}
