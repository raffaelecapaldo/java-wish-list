package org.java.lessons;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		List<Gift> gifts = new ArrayList<>();
		
		boolean adding = true;
		Scanner sc = new Scanner(System.in);
		
		while (adding) {
			System.out.println("----AGGIUNTA REGALO ALLA LISTA----");
			System.out.print("Inserisci il nome del regalo: ");
			String name = sc.nextLine();
			System.out.print("Inserisci il destinatario del regalo: ");
			String recipient = sc.nextLine();
			gifts.add(new Gift(name, recipient));
			System.out.println("REGALO AGGIUNTO");
			
			System.out.println("Numero regali: " + gifts.size());
			String answer = "";
			boolean error = false;
			do {
			System.out.print("\nVuoi inserire un nuovo regalo? S/N: ");
			answer = sc.nextLine().toLowerCase();
			error = !answer.equals("s") && !answer.equals("n");
			if (error) System.out.println("INSERIRE SOLO S O N");
			} while (error);
			if (answer.equals("n")) adding = false;
			System.out.println("\n");
		}

		
		
		System.out.println("Lista regali\n");

		for (Gift gift : gifts) {
			System.out.println(gift + "\n");
		}
	

	}}
