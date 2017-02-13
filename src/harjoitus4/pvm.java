package harjoitus4;

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
		public String tolongString(){
			return p�iv�+"."+KUUKAUDET[kuukausi-1]+"."+vuosi;
		}
		public static final String[] KUUKAUDET = {"tammikuu", "helmikuu",
			"maaliskuu", "huhtikuu", "toukokuu", "kes�kuu", "hein�kuu", "elokuu",
			"syyskuu", "lokakuu", "marraskuu", "joulukuu"};
		public pvm(){
			java.time.LocalDate tanaan = java.time.LocalDate.now();
			p�iv� = tanaan.getDayOfMonth();
			kuukausi = tanaan.getMonthValue();
			vuosi = tanaan.getYear();
		}
		public pvm(java.lang.String p�iv�ys){
			String[] osat = p�iv�ys.split("\\.");
				p�iv�=Integer.parseInt(osat[0]);
				kuukausi=Integer.parseInt(osat[1]);
				vuosi=Integer.parseInt(osat[2]);
		}
		public pvm(int p�iv�, int kuukausi, int vuosi){
			this.p�iv� = p�iv�;
			this.kuukausi = kuukausi;
			this.vuosi = vuosi;
		}
		public boolean equals(pvm toinen){
			return p�iv�==toinen.p�iv�&&kuukausi==toinen.kuukausi&&vuosi==toinen.vuosi;
		}
	
}
