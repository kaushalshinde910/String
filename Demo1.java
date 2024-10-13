package String;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] a= {'1','2','3','4'};
		String s1=String.copyValueOf(a,0,4);
		String s2=("my book name is java " + "having " +s1 +" pages");
		System.out.println(s2);

	}

}
