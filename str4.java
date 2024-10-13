package String;

public class str4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="dfdfdfd";
String s2="";
for(int i=0;i<s1.length();i++)
{
	if(s1.charAt(i)=='d')
		s2=s2+'c';
	else
		s2=s2+s1.charAt(i);
}
System.out.println(s2);
		
}
	}


