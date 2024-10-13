package String;

public class str1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="hefshine";
String s2=" ";
for(int i=0;i<s1.length();i++)
{
	char ch=s1.charAt(i);
	         if(ch=='f')
	        	 s2=s2+ch;
}
System.out.println(s2.length());
}
}