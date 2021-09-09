package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppgave2 {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {

			String poengsum = showInputDialog("Poengsum");
			int poeng = Integer.parseInt(poengsum);

			if (poeng < 0 || poeng > 100) {
				showMessageDialog(null, "Ulovlig poengsum");
				i--;
			} else if (poeng <= 100 && poeng >= 90) {
				showMessageDialog(null, "Karakter A");
			} else if (poeng <= 89 && poeng >= 80) {
				showMessageDialog(null, "Karakter B");
			} else if (poeng <= 79 && poeng >= 60) {
				showMessageDialog(null, "Karakter C");
			} else if (poeng <= 59 && poeng >= 50) {
				showMessageDialog(null, "Karakter D");
			} else if (poeng <= 49 && poeng >= 40) {
				showMessageDialog(null, "Karakter E");
			} else if (poeng <= 39 && poeng >= 0) {
				showMessageDialog(null, "Karakter F");
			}

			System.out.println(poeng + " Person " + i); // Bare for å se hvor mange personer som er tastet inn

		}

	}

}
