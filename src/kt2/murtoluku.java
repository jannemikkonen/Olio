package kt2;

public class murtoluku {

	private int osoittaja, nimittaja;
	
	public murtoluku() {
		
	this.osoittaja = 0;
	
	this.nimittaja = 1;
	}
	
	public murtoluku(int osoittaja, int nimittaja){
	this.osoittaja = osoittaja;
	this.nimittaja = nimittaja;
	if (this.nimittaja == 0){
	System.out.println("Nimittäjä ei 0. Asetetaan arvoon 1.");
	this.nimittaja = 1;
	}
	}
	
	public String toString() {
	return osoittaja + "/" + nimittaja;
	}

	public double toDouble() {
	return (double)osoittaja/nimittaja;
	}
	
	public murtoluku kertaa(murtoluku kertoja){
	return new murtoluku(osoittaja * kertoja.osoittaja, nimittaja * kertoja.nimittaja);
	}
	}
