package verify.exam08;

import java.util.StringTokenizer;

public class SplitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "아이디,이름,패스워드";
		// 작성 위치
		// #1: split() 메소드 이용
		String[] tokens = str.split(",");
		for (String token : tokens) {
			System.out.println(token);
		}
		
		System.out.println();
		// #2: StringTokenizer 이용
		StringTokenizer st = new StringTokenizer(str, ",");
		while (st.hasMoreElements()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}
}
