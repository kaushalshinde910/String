package String;

public class Demo13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="MAHARAJ";
String new_Str="";
for(int i=0;i<s.length();i++)
{
	new_Str=s.substring(i,i+1)+s.substring(i,i+1);
	System.out.print(new_Str);
}
	}

}
