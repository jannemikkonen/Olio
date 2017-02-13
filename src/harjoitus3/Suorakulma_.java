package harjoitus3;

public class Suorakulma_ {

	public static void main(String[] args) {
		
		Suorakulma M = new Suorakulma (0,10,0,20);
		System.out.println("suorakulmion pituus on"+M.pituus());
		System.out.println("suorakulmion korkeus on"+M.korkeus());
		System.out.println("suorakulmion pintaala on"+M.pintaala());
		
		Suorakulma K = new Suorakulma ();
		System.out.println("suorakulmion pituus on"+K.pituus());
		System.out.println("suorakulmion korkeus on"+K.korkeus());
		System.out.println("suorakulmion pintaala on"+K.pintaala());
		
		Suorakulma N = new Suorakulma (20,30);
		System.out.println("suorakulmion pituus on"+N.pituus());
		System.out.println("suorakulmion korkeus on"+N.korkeus());
		System.out.println("suorakulmion pintaala on"+N.pintaala());
		

	}

}

