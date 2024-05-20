package Practice.Chapter4.ex12;

public class ReservationSystem {
	
	private Seat[][] seats = new Seat[3][10];
	
	public ReservationSystem() {
		char[] grades = {'S', 'A', 'B'};
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 10; j++) {
				seats[i][j] = new Seat(grades[i], j+1, "---");
			}
		}
//		for(Seat s[]:seats) {
//			for(Seat x:s) {
//				System.out.println(x.getGrade()+" "+x.getNumber()+" "+x.getName());
//			}
//		}
	}

	public static void main(String[] args) {
		new ReservationSystem();
		
	}

}
