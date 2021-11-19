package com.ferragnez.party;

import java.util.Scanner;


public class CheckGuest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String[] listaInvitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
		System.out.println("Buona sera e ben venuto alla Festa a casa Ferragnez ");
		System.out.print("Mi dica il suo nome: ");
		String persona = scan.nextLine();
		boolean nellaLista = false;
		int rigalista = 0;
		while (!nellaLista && rigalista < listaInvitati.length) {
			if (persona.equals(listaInvitati[rigalista]) ) {
				System.out.println("Eccoti qui, entra pure " + persona + ".");
				System.out.println("Ferragnez si trova al piano 1");
				nellaLista = true;
			}
			else {
				rigalista++;
			}
		}
		if (!nellaLista) {
			System.out.println("Mi dispiace ma non vedo il suo nome.");
			System.out.println("La prego di tornare a casa sua " + persona + ".");
			
		}
		scan.close();
		
		
	}

}
