package harjoitus2;

import java.util.Scanner;

public class main_pvm {

public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	pvm olio=new pvm();
	System.out.println("anna päivä");
	olio.setPäivä(input.nextInt());
	System.out.println("anna kuukausi");
	olio.setKuukausi(input.nextInt());
	System.out.println("anna vuosi");
	olio.setVuosi(input.nextInt());
	System.out.println(olio.toString());
	}
}
