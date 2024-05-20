package OpenChallenge.Chapter4;

import java.util.Scanner;

public class WordGameApp {
	private String startWord = "�ƹ���";
	private Player[] players;
	private Scanner sc;
	
	public WordGameApp() {
		sc = new Scanner(System.in);
	}
	
	public void createPlayers() {
		System.out.print("���ӿ� �����ϴ� �ο��� �� ���Դϱ�>>");
		int nPlayer = sc.nextInt();
		players = new Player[nPlayer];
		for(int i = 0; i < nPlayer; i++) {
			System.out.print("�������� �̸��� �Է��ϼ���>>");
			players[i] = new Player(sc.next());
		}
		
	}
	
	public void run() {
		System.out.println("�����ձ� ������ �����մϴ�...");
		String nextWord = startWord;
		createPlayers();
		System.out.println("�����ϴ� �ܾ�� "+nextWord+"�Դϴ�.");
		int next = 0;
		while(true) {
			String newWord = players[next].getWordFromUser();
			if(!players[next].checkSuccess(nextWord)) {
				System.out.println(players[next].getName()+"��/�� �����ϴ�.");
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
