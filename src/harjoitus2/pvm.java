package harjoitus2;

public class pvm {

	private int päivä, kuukausi, vuosi;

	public int getPäivä() {
		return päivä;
	}

	public void setPäivä(int päivä) {
		this.päivä = päivä;
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
		return päivä+"."+kuukausi+"."+vuosi;
	}
}
