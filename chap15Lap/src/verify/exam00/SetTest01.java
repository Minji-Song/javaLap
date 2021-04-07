package verify.exam00;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Set s = new HashSet();
		// TreeSet s = new TreeSet();
		Random r = new Random();
		
		n = 6;
		while (n > 0) {
			int num = r.nextInt(45) + 1;
			if (s.add(num) == false) continue;
			n--;
		}
		System.out.println(s.toString());
		
		
		
		while(s.size() != 6) {
			n = r.nextInt(45) + 1;
			s.add(n);
		}
		System.out.println(s);
	}
}
