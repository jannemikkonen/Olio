package harjoitus2;

public class pvm {

	private int p�iv�, kuukausi, vuosi;

	public int getP�iv�() {
		return p�iv�;
	}

	public void setP�iv�(int p�iv�) {
		this.p�iv� = p�iv�;
	}

	public int getKuukausi() {
		return kuukausi;
	}

	public void setKuukausi(int kuukausi) {
		this.kuukausi = kuukausi;
	}

	public int getVuosi() {
		return vuosi;
	}

	public void setVuosi(int vuosi) {
		this.vuosi = vuosi;
	}
	
	public String toString(){
		return p�iv�+"."+kuukausi+"."+vuosi;
	}
}
