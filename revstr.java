package String;

public class revstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="you all are very very very good students";
String[] sa = s1.split(" ");
for(int i=0;i<sa.length;i++)
{
	String temp=sa[i];
	String s2=" ";
	for(int j=temp.length()-1;j>=0;j--)
	{
		s2=s2+temp.charAt(j);
	}
	sa[i]=s2;
	
}
String s3="";
for(int i=0;i<sa.length;i++)
{
	s3=s3+sa[i]+" ";
}
System.out.println(s3);
	}

}
