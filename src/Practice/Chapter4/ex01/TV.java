package Practice.Chapter4.ex01;

public class TV {
	String manf;
	int year;
	int size;
	
	public TV(String manf, int year, int size) {
		this.manf = manf;
		this.year = year;
		this.size = size;
	}
	
	public void show() {
		System.out.printf("%s���� ���� %d���� %d��ġ TV", manf, year, size);
	}

	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
	}
}
