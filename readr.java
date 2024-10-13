package String;

public class readr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcdd";
		for(char ch='a';ch<='z';ch++)
		{
			int cnt=0;
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					cnt++;
				}
			}
			if(cnt !=0)
			{
				System.out.println("char "+cnt);
			}
		}
		

	}

}
