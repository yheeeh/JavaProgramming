package Practice.Chapter4.ex12;

public class Seat {
	private char grade;
	private int number;
	private String name;
	
	public Seat(char grade, int number, String name) {
		this.grade = grade;
		this.number = number;
		this.name = name;
	}
	
	public void setGrade(char grade) {
		this.grade = grade;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGrade() {
		return grade;
	}

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}
	
}
