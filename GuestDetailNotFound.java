package Exception;

public class GuestDetailNotFound extends RuntimeException {
  private String message;
  public GuestDetailNotFound(String message)
  {
	  this.message=message;
  }
  public String getMessage()
  {
	  return message;
  }
}
