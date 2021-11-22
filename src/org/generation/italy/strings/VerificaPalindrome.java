package org.generation.italy.strings;

import java.util.Scanner;

public class VerificaPalindrome {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String word = "";
		
		System.out.print("Inserisci di seguito una parola: ");
		word = scan.nextLine();
		String wordReverse = "";
		
		for(int i = word.length() - 1; i >= 0; i--) {
			wordReverse = wordReverse + word.charAt(i);
		}
		
		if(wordReverse.equals(word)) {
			System.out.println("La parola inserita � palindroma");
		} else {
			System.out.println("Non � una parola palindroma");
		}
		
		System.out.println("La parola � lunga: " + word.length());
		
		scan.close();
	}

}
