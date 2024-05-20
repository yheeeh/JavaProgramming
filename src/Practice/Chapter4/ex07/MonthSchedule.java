package Practice.Chapter4.ex07;

import java.util.Scanner;

public class MonthSchedule {
	// ���������� �� ���� �ϼ��� �ʵ�� ���� -> private int nDays;
 	private Day[] days;
	private Scanner sc;
	
	public MonthSchedule(int days) {
		this.days = new Day[days];
		for(int i=0; i<this.days.length; i++) {
			this.days[i] = new Day();
		}
		sc = new Scanner(System.in);
	}
	
	public void input() {
		System.out.print("��¥(1~30)?");
		int date = sc.nextInt();
		System.out.print("����(��ĭ�����Է�)?");
		String work = sc.next();
		
//		if(day < 0 || date > nDays) { // 0~29 �� ��ȿ
//			System.out.println("��¥ �߸� �Է��Ͽ����ϴ�.!");			
//			return;
//		}
		
		days[date - 1].set(work);
	}
	
	public void view() {
		System.out.print("��¥(1~30)?");
		int date = sc.nextInt();
		
//		if(day < 0 || date > nDays) { // 0~29 �� ��ȿ
//		System.out.println("��¥ �߸� �Է��Ͽ����ϴ�.!");			
//		return;
//	}
		
		Day day = days[date - 1];
		System.out.print(date + "���� �� ���� ");
		day.show();
	}
	
	public void finish() {
		System.out.println("���α׷��� �����մϴ�.");
	}
	
	public void run() {
		System.out.println("�̹��� ������ ���� ���α׷�.");
		while(true) {
			System.out.print("����(�Է�:1, ����:2, ������:3) >>");
			int choice = sc.nextInt();
			if(choice == 3) {
				finish();
				break;
			}else if(choice == 1) {
				input();
			}else {
				view();
			}
			
//			switch(choice) {
//			case 1: input(); break;
//			case 2: view(); break;
//			case 3: finish(); return;
//			default : 
//				System.out.println("�߸��Է��Ͽ����ϴ�.");
//			}
			
			System.out.println();
		}
	}

	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30); // 4������ ����
		april.run();

	}

}
