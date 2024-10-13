package String;

public class strrevn1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s="kaushal is studying in mca";
    String rev1=" ";
    String a[] =s.split(" ");
    for(int i=a.length-1;i>=0;i--) {
    	rev1=rev1+a[i]+" ";
    }
    System.out.println(rev1);
    	
    }
	}


