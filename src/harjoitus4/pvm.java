package harjoitus4;

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
		public String tolongString(){
			return päivä+"."+KUUKAUDET[kuukausi-1]+"."+vuosi;
		}
		public static final String[] KUUKAUDET = {"tammikuu", "helmikuu",
			"maaliskuu", "huhtikuu", "toukokuu", "kesäkuu", "heinäkuu", "elokuu",
			"syyskuu", "lokakuu", "marraskuu", "joulukuu"};
		public pvm(){
			java.time.LocalDate tanaan = java.time.LocalDate.now();
			päivä = tanaan.getDayOfMonth();
			kuukausi = tanaan.getMonthValue();
			vuosi = tanaan.getYear();
		}
		public pvm(java.lang.String päiväys){
			String[] osat = päiväys.split("\\.");
				päivä=Integer.parseInt(osat[0]);
				kuukausi=Integer.parseInt(osat[1]);
				vuosi=Integer.parseInt(osat[2]);
		}
		public pvm(int päivä, int kuukausi, int vuosi){
			this.päivä = päivä;
			this.kuukausi = kuukausi;
			this.vuosi = vuosi;
		}
		public boolean equals(pvm toinen){
			return päivä==toinen.päivä&&kuukausi==toinen.kuukausi&&vuosi==toinen.vuosi;
		}
	
}
