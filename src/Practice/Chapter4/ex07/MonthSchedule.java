package Practice.Chapter4.ex07;

import java.util.Scanner;

public class MonthSchedule {
	// 답지에서는 한 달의 일수도 필드로 받음 -> private int nDays;
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
		System.out.print("날짜(1~30)?");
		int date = sc.nextInt();
		System.out.print("할일(빈칸없이입력)?");
		String work = sc.next();
		
//		if(day < 0 || date > nDays) { // 0~29 만 유효
//			System.out.println("날짜 잘못 입력하였습니다.!");			
//			return;
//		}
		
		days[date - 1].set(work);
	}
	
	public void view() {
		System.out.print("날짜(1~30)?");
		int date = sc.nextInt();
		
//		if(day < 0 || date > nDays) { // 0~29 만 유효
//		System.out.println("날짜 잘못 입력하였습니다.!");			
//		return;
//	}
		
		Day day = days[date - 1];
		System.out.print(date + "일의 할 일은 ");
		day.show();
	}
	
	public void finish() {
		System.out.println("프로그램을 종료합니다.");
	}
	
	public void run() {
		System.out.println("이번달 스케쥴 관리 프로그램.");
		while(true) {
			System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
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
//				System.out.println("잘못입력하였습니다.");
//			}
			
			System.out.println();
		}
	}

	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30); // 4월달의 할일
		april.run();

	}

}
