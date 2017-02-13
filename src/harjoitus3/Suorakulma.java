package harjoitus3;

public class Suorakulma {

	private double xa;
	private double xb;
	private double ya;
	private double yb;
	
	public Suorakulma (double _xa, double _xb, double _ya, double _yb){
		
		xa = _xa;
		xb = _xb;
		ya = _ya;
		yb = _yb;
					}
public Suorakulma (double _xb, double _yb){
		
		xb = _xb;
		yb = _yb;
}
	public Suorakulma(){
		xa = 1;
		xb = 1;
		ya = 0;
		yb = 0;
	}
	
	public double pituus (){
		return xb-xa;
	}
	
	public double korkeus (){
		return yb-ya;
	}
	
	public double pintaala(){
		return pituus()*korkeus();
	}
}

