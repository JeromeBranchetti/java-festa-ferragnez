package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuestBonus {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String[] listaInvitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
		System.out.println("Buona sera e ben venuto alla Festa a casa Ferragnez ");
		System.out.print("Mi dica il suo nome: ");
		String persona = scan.nextLine();
		String risultato = "non trovato";

		for (int rigaLista = listaInvitati.length - 1 ; rigaLista >= 0; rigaLista--) {
			if (persona.equals(listaInvitati[rigaLista])) {
				System.out.println("Eccoti qui, entra pure " + persona + ".");
				System.out.println("Ferragnez si trova al piano 1");
				risultato = "trovato";
			}			
		}
		if (risultato.equals("non trovato")) {
			System.out.println("Mi dispiace ma non vedo il suo nome.");
			System.out.println("La prego di tornare a casa sua " + persona + ".");
			
		}
		scan.close();
	}

}
