package customexceptions;

public class MainPresenter {

	public static void main(String[] args) {
		BusinessLayer p1= new BusinessLayer();
		String email="abcd@gmal.com";
		try {
			if(p1.isValidEmail(email)) {
				System.out.println("Enterd Email is valid");
			}
		} 
		catch(InvalidEmailException e){
			System.out.println(e.getMessage());
		}
		
		try {
			if(p1.isValdDebitCardNum("1124556445854569"))
				System.out.println("Enterd Debit card number is valid");
			}
		 
		catch(InvalidDCardException e){
			System.out.println(e.getMessage());
		}
	}
}
	
	


