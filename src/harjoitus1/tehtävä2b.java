package harjoitus1;

import java.util.Arrays;
import java.util.Scanner;

public class tehtävä2b {

	
	public static void main(String[] args) {
	Scanner input=new Scanner (System.in);
	double keskiarvo;
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
Arrays.sort(luvut);

for ( int i =0; i < lkm; i++)
{
	System.out.println(luvut[i]);
	
}
keskiarvo = (double)summa/lkm;
System.out.println(keskiarvo);
	}
}

