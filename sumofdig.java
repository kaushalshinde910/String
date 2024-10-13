package String;

public class sumofdig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc123";
		int sum=0;
		char[] a=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(Character.isDigit(a[i]))
			{
				int value=Character.getNumericValue(a[i]);
				sum=sum+value;
			
			}
		}
		System.out.println(sum);

	}

}
