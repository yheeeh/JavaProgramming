package OpenChallenge.Chapter4;

import java.util.Scanner;

public class Player {
	private String name;
	private Scanner sc;
	private String word;
	
	public Player(String name) {
		this.name = name;
		sc = new Scanner(System.in);
	}
	
	public String getName() {
		return name;
	}

	public String getWordFromUser() {
		System.out.print(getName()+">>");
		word = sc.next();		
		return word;
	}
	
	public boolean checkSuccess(String nextWord) {
		if(nextWord.charAt(nextWord.length()-1) == word.charAt(0)) {
			return true;
		}else {
			return false;
		}
	}
}
