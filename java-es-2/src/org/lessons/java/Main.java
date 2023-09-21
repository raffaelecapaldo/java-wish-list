package org.lessons.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Conteggio caratteri di una parola");
		System.out.print("Inserisci una parola: ");
		String word = sc.nextLine();
		sc.close();
		
		Map<Character, Integer> charCounter = new HashMap<>();
		
		for (int i = 0; i < word.length(); i++) {
			char wordChar = word.toLowerCase().charAt(i);
			if (charCounter.containsKey(wordChar)) {
				charCounter.put(wordChar, charCounter.get(wordChar) + 1);
			}
				else {
					charCounter.put(wordChar, 1);
				}
			}
		
		for (Character key : charCounter.keySet()) {
			Integer n = charCounter.get(key);
			System.out.println(key + ":" + n);
		}
		}
		
	

}
