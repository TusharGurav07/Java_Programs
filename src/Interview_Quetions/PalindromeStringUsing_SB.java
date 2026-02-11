package Interview_Quetions;

public class PalindromeStringUsing_SB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str="madam";
      String rev=new StringBuilder(str).reverse().toString();
      if(rev.equals(str)) {
    	  System.out.println("String Is Palindrome");
      }else {
    	  System.out.println("String Is Not Palindrome");
      }
	}

}
