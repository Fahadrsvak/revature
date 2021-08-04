package customexceptions;

public class BusinessLayer {
	public boolean isValidEmail(String email) throws InvalidEmailException {
		if(email.endsWith("@gmail.com")) {
			return true;
		}
		else {
			throw new InvalidEmailException(email+" is an invalid mail id");
		}
	}
	
	public boolean isValdDebitCardNum(String cardNum) throws InvalidDCardException{
		if(cardNum!=null && cardNum.matches("[0-9]{16}")) {
			return true;
		}
		else {
			throw new InvalidDCardException(cardNum+" is an invalid debitcard number");
		}
	}
}
