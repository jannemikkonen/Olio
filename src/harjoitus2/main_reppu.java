package harjoitus2;

import java.util.Scanner;

public class main_reppu {

	 
		public static void main(String[] args) {
		Scanner M = new Scanner(System.in);
		int lkm;
		
		System.out.println("tuotteiden m‰‰r‰");
		lkm = M.nextInt();
		reppu[] rivit = new reppu[lkm];
		
		for(int i=0; i < lkm; i++) {
			M.nextLine();
			rivit[i] = new reppu();
			System.out.println("tuotteiden tiedot");
			rivit[i].setNimi(M.nextLine());
			System.out.println("tuotteiden hinta");
			rivit[i].setHinta(M.nextDouble());
			System.out.println("tuotteiden m‰‰r‰");
			rivit[i].setM‰‰r‰(M.nextDouble());
		}
		
		System.out.println("tuotteiden keskiarvo");
		for(int i=0; i < lkm; i++){
			System.out.println("tuote"+ rivit[i].getNimi()+"tilausrivi"+rivit [i].yhteishinta());
		}
		}

	

	public void setM‰‰r‰(double nextDouble) {
		// TODO Auto-generated method stub
		
	}

	public void setHinta(double nextDouble) {
		// TODO Auto-generated method stub
		
	}

	public void setNimi(String nextLine) {
		// TODO Auto-generated method stub
		
	}

	public String yhteishinta() {
		// TODO Auto-generated method stub
		return null;
	}
}

