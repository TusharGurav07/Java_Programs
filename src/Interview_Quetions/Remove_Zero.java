package Interview_Quetions;

public class Remove_Zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str="83298109408282020404040230506506";
    char ch[]=str.toCharArray();
    StringBuilder sb=new StringBuilder();
    for(int i=0;i<str.length();i++) {
    	if(Character.getNumericValue(ch[i])!=0) {
    		sb.append(ch[i]);
    		
    	}
    }
    System.out.println(sb);
	}

}
