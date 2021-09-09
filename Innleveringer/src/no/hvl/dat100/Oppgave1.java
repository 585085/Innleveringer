package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppgave1 {

	public static void main(String[] args) {

		String lonn = showInputDialog("Bruttoinntekt?");
		int inntekt = Integer.parseInt(lonn);

		int trinn0 = 164100;
		int trinn1 = 230950;
		int trinn2 = 580650;
		int trinn3 = 934050;

		if (inntekt > trinn0 && inntekt < trinn1) {

			double trinnskatt = inntekt * 0.0093;
			double nettolonn = inntekt - trinnskatt;
			showMessageDialog(null, "Bruttolønn: " + inntekt + "\n" + "Du må betale " + trinnskatt + " kr i skatt"
					+ "\n" + "Nettolønn: " + nettolonn);

		} else if (inntekt > trinn1 && inntekt < trinn2) {

			double trinnskatt = inntekt * 0.0241;
			double nettolonn = inntekt - trinnskatt;
			showMessageDialog(null, "Bruttolønn: " + inntekt + "\n" + "Du må betale " + trinnskatt + " kr i skatt"
					+ "\n" + "Nettolønn: " + nettolonn);

		} else if (inntekt > trinn2 && inntekt < trinn3) {

			double trinnskatt = inntekt * 0.1152;
			double nettolonn = inntekt - trinnskatt;
			showMessageDialog(null, "Bruttolønn: " + inntekt + "\n" + "Du må betale " + trinnskatt + " kr i skatt"
					+ "\n" + "Nettolønn: " + nettolonn);

		} else if (inntekt > trinn3) {

			double trinnskatt = inntekt * 0.1452;
			double nettolonn = inntekt - trinnskatt;
			showMessageDialog(null, "Bruttolønn: " + inntekt + "\n" + "Du må betale " + trinnskatt + " kr i skatt"
					+ "\n" + "Nettolønn: " + nettolonn);

		} else if (inntekt < trinn0) {

			showMessageDialog(null, "Du trenger ikke betale skatt");
		}

		System.out.println(inntekt); // Bare for å se hva som ble skrevet inn

	}

}
