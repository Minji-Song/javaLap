package sec07.exam02_method;

public class StringLengthExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ints = new int[3];
		
		String ssn = "9701272121212";
		int length = ssn.length();
		if(length == 13) {
			System.out.println("�ֹι�ȣ �ڸ����� �½��ϴ�.");
		} else {
			System.out.println("�ֹι�ȣ �ڸ����� Ʋ���ϴ�.");
		}
	}

}
