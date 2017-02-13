package harjoitus2;

public class Sarmio {
	
	
	public double leveys;
	public double pituus;
	public double korkeus;

	public double särmiöntilavuus(){
		
		double tilavuus;
		tilavuus = leveys*pituus*korkeus;
		return tilavuus;
	}

	
}
