package Exam;

import java.util.Scanner;

public class SignPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		String result = (num > 0) ? "양수" : (num < 0) ? "음수" : "0";
		
		System.out.println(result + "입니다.");
	}

}
