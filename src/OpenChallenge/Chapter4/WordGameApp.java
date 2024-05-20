package OpenChallenge.Chapter4;

import java.util.Scanner;

public class WordGameApp {
	private String startWord = "아버지";
	private Player[] players;
	private Scanner sc;
	
	public WordGameApp() {
		sc = new Scanner(System.in);
	}
	
	public void createPlayers() {
		System.out.print("게임에 참가하는 인원은 몇 명입니까>>");
		int nPlayer = sc.nextInt();
		players = new Player[nPlayer];
		for(int i = 0; i < nPlayer; i++) {
			System.out.print("참가자의 이름을 입력하세요>>");
			players[i] = new Player(sc.next());
		}
		
	}
	
	public void run() {
		System.out.println("끝말잇기 게임을 시작합니다...");
		String nextWord = startWord;
		createPlayers();
		System.out.println("시작하는 단어는 "+nextWord+"입니다.");
		int next = 0;
		while(true) {
			String newWord = players[next].getWordFromUser();
			if(!players[next].checkSuccess(nextWord)) {
				System.out.println(players[next].getName()+"이/가 졌습니다.");
				break;
			}else {
				next++;
				next %= players.length;
				nextWord = newWord;
			}
		}
	}

	public static void main(String[] args) {
		new WordGameApp().run();
	}
}
