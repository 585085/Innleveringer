package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppgave3 {

	public static void main(String[] args) {

		String heltall = showInputDialog("Skriv inn tall som skal regnes ut");
		int tall = Integer.parseInt(heltall);
		int sum = 1;

		if (tall > 0) {

			for (int i = tall; i >= 1; i--) {

				sum = sum * i;

			}

			showMessageDialog(null, "Svaret er " + sum);

		} else {

			showMessageDialog(null, "Ulovlig tall");
		}

	}

}
