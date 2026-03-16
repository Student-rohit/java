package basic;

public class CrypticNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=1234;
		String str=String.valueOf(num);
		String rs="";
		
		for(int i=0 ; i<str.length();i++) {
			int digit=str.charAt(i)-'0';
			char ch=(char)('A' + digit-1);
			rs +=ch;
		}
		System.out.println("cryptic code :" + rs);

	}

}
