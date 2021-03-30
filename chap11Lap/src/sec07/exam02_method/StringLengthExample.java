package sec07.exam02_method;

public class StringLengthExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ints = new int[3];
		
		String ssn = "9701272121212";
		int length = ssn.length();
		if(length == 13) {
			System.out.println("주민번호 자리수가 맞습니다.");
		} else {
			System.out.println("주민번호 자리수가 틀립니다.");
		}
	}

}
