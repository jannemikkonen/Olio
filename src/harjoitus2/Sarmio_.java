package harjoitus2;

import java.util.Scanner;


public class Sarmio_ {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		Sarmio luvut = new Sarmio();
		System.out.println("ilmoita leveys");
		luvut.leveys = input.nextDouble();
		System.out.println("ilmoita pituus");
		luvut.pituus = input.nextDouble();
		System.out.println("ilmoita korkeusa");
		luvut.korkeus = input.nextDouble();
		System.out.println("tilavuus"+ luvut.särmiöntilavuus());
		

	}

}




	
