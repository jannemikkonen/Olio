package harjoitus2;

import java.util.Scanner;

public class reppu {

			public static void main(String[] args) {
				
				int lkm;
				
				Scanner input = new Scanner (System.in);
				lkm = input.nextInt();
				main_reppu[] main_reppu = new main_reppu[lkm];
				
				main_reppu asiat = new main_reppu();
				System.out.println("ilmoita nimi");
				asiat.setNimi (input.nextLine());
				System.out.println("ilmoita hinta");
				asiat.setHinta (input.nextDouble());
				System.out.println("ilmoita m‰‰r‰");
				asiat.setM‰‰r‰ (input.nextDouble());
				System.out.println("hinta yhteens‰"+ asiat.yhteishinta());
				

			}

			public void setNimi(String nextLine) {
				// TODO Auto-generated method stub
				
			}

			public void setHinta(double nextDouble) {
				// TODO Auto-generated method stub
				
			}

			public void setM‰‰r‰(double nextDouble) {
				// TODO Auto-generated method stub
				
			}

			public String getNimi() {
				// TODO Auto-generated method stub
				return null;
			}

			public String yhteishinta() {
				// TODO Auto-generated method stub
				return null;
			}

		}

