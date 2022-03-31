package customeException;

public class Voting2 {
public static void main(String[] args) {
	int age=17;
	try {
		
	if (age<18) 
	{
		throw new UncheckedCustomeException();
	}
	else 
	{
		System.out.println("You can vote...");
	}
	}
	catch(Exception e) 
	{
		e.printStackTrace();
	}System.out.println("hello.....");	
}
}
