package verify.exam00;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class YearCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("������ �Է� �ϼ���?");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();

		// �ۼ���ġ : GregorianCalendar�� �޼ҵ带 �̿��Ͽ� ���������� �ľ��Ѵ�.
		GregorianCalendar cal = new GregorianCalendar();
		if (cal.isLeapYear(year)) {
			System.out.println(year + "���� ����");
		} else {
			System.out.println(year + "���� ���");
		}

	}

}
