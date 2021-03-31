package verify.exam00;

import java.io.InputStream;
import java.util.Scanner;
import java.util.regex.Pattern;

public class JuminCheck01 {

	// 주민번호 타당성 검사하는 메소드
	public boolean juminCheck(String jumin) {
		// 작성위치
//		1. 주민번호 각 자리에 해당 숫자를 곱한다.
//		2. 1번의 연산 결과를 11로 나누어서 나머지를 구한다.
//		3. 11에서 나머지 값을 뺀 후 "체크용 번호와" 비교해서 같으면 올바른 주민번호, 그렇지 않으면 틀린 주민번호

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
		System.out.println("주민번호 앞자리를 입력 하세요?");
		String jumin1 = sc.next(); // 111111
		System.out.println("주민번호 뒷자리를 입력 하세요?");
		String jumin2 = sc.next(); // 1111011
		if (jumin1.length() != 6) {
			System.out.println("주민번호 앞자리는 6자리 입력");
		} else if (jumin2.length() != 7) {
			System.out.println("주민번호 뒷자리는 7자리 입력");
		} else if (!jc.juminCheck(jumin1 + jumin2)) {
			System.out.println("잘못된 주민번호 입니다.");
		} else {
			System.out.println("올바른 주민번호 입니다");
		}
	}
}