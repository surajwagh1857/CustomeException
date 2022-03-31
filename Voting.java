package customeException;



public class Voting {
public static void main(String[] args) {
	
	int age=17;
	
	try 
	{
	    if(age<18) 
	     {
		   throw new UnderAgeException(); //constructor calls to  no-arg underAgeException ... 
	     }
	    else {
	    	System.out.println("you can vote...");
	    }
    }
	catch (Exception e)
	{
		e.printStackTrace();
		
		
	}System.out.println("hello..");
}
}
