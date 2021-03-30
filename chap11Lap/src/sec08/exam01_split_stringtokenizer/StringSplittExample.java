package sec08.exam01_split_stringtokenizer;

public class StringSplittExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "È«±æµ¿&¼Û¹ÎÁö,Àå½Â¹Î,±èÀÚ¹Ù-±èÅÂ¿¬";
		String[] names = text.split("&|,|-");
		
		for (String name : names) {
			System.out.println(name);
		}
	}

}
