package String;

public class cntdig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String s="123www";
          if(s.matches("[0-9]+"))
          {
        	  System.out.println("only digit cnt");
        	 
          }
          else if(s.matches("[a-z]+"))
          {
        	  System.out.println("cnt char and dig");
          }
          else
          {
        	  System.out.println("Str contain both");
          }
	}

}
