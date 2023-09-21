package org.lessons.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

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
		
		
		//LAMBDA
		Map<Character,Integer> charCounter2 = charCounter.keySet().stream()//Apri stream sul keyset precedentemente ottenuto
				.collect(Collectors.groupingBy(k -> k, Collectors.summingInt(i -> 1))); //raggruppa tutte le key uguali sommando di 1 per ogni nuova key nell'insieme

		System.out.println("\nBonus\n");
		
		for (Character key : charCounter2.keySet()) {
			Integer n = charCounter2.get(key);
			System.out.println(key + ":" + n);
		}
		
	

}}
