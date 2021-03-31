package verify.exam00;

import java.io.InputStream;
import java.util.Scanner;
import java.util.regex.Pattern;

public class JuminCheck01 {

	// �ֹι�ȣ Ÿ�缺 �˻��ϴ� �޼ҵ�
	public boolean juminCheck(String jumin) {
		// �ۼ���ġ
//		1. �ֹι�ȣ �� �ڸ��� �ش� ���ڸ� ���Ѵ�.
//		2. 1���� ���� ����� 11�� ����� �������� ���Ѵ�.
//		3. 11���� ������ ���� �� �� "üũ�� ��ȣ��" ���ؼ� ������ �ùٸ� �ֹι�ȣ, �׷��� ������ Ʋ�� �ֹι�ȣ

		String checkJumin = "234567892345";

		int a, b;
		int sum = 0;
		for (int i = 0; i < checkJumin.length(); i++) {
			a = Integer.parseInt(checkJumin.substring(i, i+1));
			b = Integer.parseInt(jumin.substring(i, i+1));
			sum += a*b;
		}
		
		int restVal = 11 - (sum % 11);
		if(restVal >= 10) restVal %= 10;

		if(Integer.parseInt(jumin.substring(12)) == restVal) return true;
		else return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JuminCheck01 jc = new JuminCheck01();
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		System.out.println("�ֹι�ȣ ���ڸ��� �Է� �ϼ���?");
		String jumin1 = sc.next(); // 111111
		System.out.println("�ֹι�ȣ ���ڸ��� �Է� �ϼ���?");
		String jumin2 = sc.next(); // 1111011
		if (jumin1.length() != 6) {
			System.out.println("�ֹι�ȣ ���ڸ��� 6�ڸ� �Է�");
		} else if (jumin2.length() != 7) {
			System.out.println("�ֹι�ȣ ���ڸ��� 7�ڸ� �Է�");
		} else if (!jc.juminCheck(jumin1 + jumin2)) {
			System.out.println("�߸��� �ֹι�ȣ �Դϴ�.");
		} else {
			System.out.println("�ùٸ� �ֹι�ȣ �Դϴ�");
		}
	}
}