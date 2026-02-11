package Interview_Quetions;

public class Palindrome_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="madam";
		String original=str;
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);	
		}
		String pali=(rev.equals(original))? "String is Palindrome":"String is Not Palindrome";	
		System.out.println(pali);

	}

}
