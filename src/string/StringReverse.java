package string;

public class StringReverse {
	public String reverse(String message) {
		String returnStr="";
		for(int i=0;i<message.length();i++)
		{
			char num=message.charAt(i);
			returnStr=num+returnStr;
		}
		return returnStr;
	}
	
	public static void main(String[] args) {
		String message="123456";
		StringReverse  stringReverse =new StringReverse();
		System.out.println(stringReverse.reverse(message));
	}
}
