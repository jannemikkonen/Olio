package harjoitus4;

import java.util.Scanner;

public class pvm_main {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		pvm olio=new pvm();
		pvm olio2=new pvm(31,1,2017);
		System.out.println("anna p�iv�ys");
		String p�iv�ys=input.next();
		pvm olio3=new pvm(p�iv�ys);
		/*System.out.println("anna p�iv�");
		olio.setP�iv�(input.nextInt());
		System.out.println("anna kuukausi");
		olio.setKuukausi(input.nextInt());
		System.out.println("anna vuosi");
		olio.setVuosi(input.nextInt());*/
		System.out.println(olio.toString());
		System.out.println(olio2.toString());
		System.out.println(olio.equals(olio2));
		System.out.println(olio3.tolongString());
		}
	}



