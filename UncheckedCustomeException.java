package customeException;

public class UncheckedCustomeException extends RuntimeException
{
	UncheckedCustomeException(){
		super("you not eligible ot vote");
	}
	UncheckedCustomeException(String message)
	{
		super("message");
	}
}

