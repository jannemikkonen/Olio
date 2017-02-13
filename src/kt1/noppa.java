package kt1;

public class noppa {

	public void yritys() {
		arpakuutio kuutio1 = new arpakuutio();
		arpakuutio kuutio2 = new arpakuutio();
		arpakuutio kuutio3 = new arpakuutio();
		arpakuutio kuutio4 = new arpakuutio();
		int heitto = 0;
		
		do {
			kuutio1.heittaa();
			kuutio2.heittaa();
			kuutio3.heittaa();
			kuutio4.heittaa();
			heitto++;
			System.out.println("heitto" + heitto + ":"
				+ kuutio1.Silmaluku() + " & "
				+ kuutio2.Silmaluku() + " & "
				+ kuutio3.Silmaluku() + " & "
				+ kuutio4.Silmaluku());
			}
		while(kuutio1.Silmaluku() != kuutio2.Silmaluku() || kuutio1.Silmaluku() != kuutio3.Silmaluku() || kuutio1.Silmaluku() != kuutio4.Silmaluku());
		}
	public static void main(String[] args) {
		noppa show = new noppa();
		show.yritys();
	}
}					
