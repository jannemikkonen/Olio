package harjoitus1;

import java.util.Scanner;

public class teht�v�2a {
		
		public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
	
	int lkm;
	int summa=0;
	System.out.println("montako lukua");
	lkm=input.nextInt();
	int luvut[]=new int[lkm];

	for ( int i =0; i < lkm; i++)
	{
		System.out.println("anna luku");
		luvut [i]=input.nextInt(); 
		summa = summa+luvut[i];
	}


	for ( int i =0; i < lkm; i++)
	{
		System.out.println(luvut[i]);
		
		}
	}
}



