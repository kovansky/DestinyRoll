package me.f4dev.destinyroll.errors;

public class RequiredFieldsEmptyException extends Exception {
  private String message = null;
  
  public RequiredFieldsEmptyException() {
    super();
  }
  
  public RequiredFieldsEmptyException(String message) {
    super(message);
    this.message = message;
  }
  
  public RequiredFieldsEmptyException(Throwable cause) {
    super(cause);
  }
  
  @Override
  public String toString() {
    return message;
  }
  
  @Override
  public String getMessage() {
    return message;
  }
}
