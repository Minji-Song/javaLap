package verify.exam00;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class YearCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("연도를 입력 하세요?");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();

		// 작성위치 : GregorianCalendar의 메소드를 이용하여 윤년인지를 파악한다.
		GregorianCalendar cal = new GregorianCalendar();
		if (cal.isLeapYear(year)) {
			System.out.println(year + "년은 윤년");
		} else {
			System.out.println(year + "년은 평년");
		}

	}

}
