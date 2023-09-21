package org.lessons.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
		Stream<Character> charStream = word.chars()
			    .mapToObj(c -> (char) c); //Creazione stream da Stringa
					//Creazione Map con caratteri raggruppati e conteggio dei caratteri
		Map<Character, Long> charCounter2 = charStream.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println("\nBonus\n");
		
		for (Character key : charCounter2.keySet()) {
			Long n = charCounter2.get(key);
			System.out.println(key + ":" + n);
		}
		
	

}}
