package customeException;

  public class UnderAgeException extends Exception 
 {
	UnderAgeException()
	{
		super("You are under Age");
	}
   UnderAgeException(String message)
   {
	super(message);
   }

}
