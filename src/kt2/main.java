package kt2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	System.out.println("Parametrittomalla konstruktorilla:");
	murtoluku a = new murtoluku();
	
	System.out.println(a.toString() + ", arvo " + a.toDouble());
	int o, n;
	
	System.out.println("Parametrillisella konstruktorilla:");
	
	System.out.print("Anna osoittaja: ");
	o = input.nextInt();
	
	System.out.print("Anna nimittäjä: ");
	n = input.nextInt();
	
	murtoluku b = new murtoluku(o, n);
	System.out.println(b.toString() + ", arvo " + b.toDouble());
	System.out.print("Anna osoittaja: ");
	o = input.nextInt();
	
	System.out.print("Anna nimittäjä: ");
	n = input.nextInt();
	
	murtoluku c = new murtoluku(o, n);
	System.out.println(c.toString() + ", arvo " + c.toDouble());
	System.out.println("Kertolasku:");
	
	murtoluku tulo = b.kertaa(c);
	System.out.println(b.toString() + " * " + c.toString()
	+ " = " + tulo.toString());
	}
	}
