package sec08.exam01_split_stringtokenizer;

public class StringSplittExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "ȫ�浿&�۹���,��¹�,���ڹ�-���¿�";
		String[] names = text.split("&|,|-");
		
		for (String name : names) {
			System.out.println(name);
		}
	}

}
