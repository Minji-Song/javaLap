package Exam;

import java.util.Scanner;

public class SignPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		String result = (num > 0) ? "���" : (num < 0) ? "����" : "0";
		
		System.out.println(result + "�Դϴ�.");
	}

}
