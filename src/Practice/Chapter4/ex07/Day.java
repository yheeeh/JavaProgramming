package Practice.Chapter4.ex07;

public class Day {
	private String work; // �Ϸ��� �� ���� ��Ÿ���� ���ڿ�
	public void set(String work) {this.work = work;}
	public String get() {return work;}
	public void show() {
		if(work == null) System.out.println("�����ϴ�.");
		else System.out.println(work + "�Դϴ�.");
	}
}
