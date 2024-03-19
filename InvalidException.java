package Exception;

public class InvalidException extends RuntimeException{
 private String message;
 public InvalidException(String message)
 {
	 this.message=message;
 }
 @Override
 public String getMessage()
 {
	 return message;
 }
}
