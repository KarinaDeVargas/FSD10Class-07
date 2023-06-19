package June15th;

import java.util.Scanner;

public class Class15June {
	/* 	length = 8 char
	only letters and digits	
	at least 2 digits*/

	public static void main(String[] args) {
	
	public static final int PASSWORD_LENGTH = 8; 		
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Input password: ");
		String password = kb.next();
		
				
		

		
	}
	
		public static boolean is_validPassword(String password) {
		if(password.length() < PASSWORD_LENGTH) {
			return false;
		}
		int charCount = 0, numCount = 0;
		
		for(int i = 0; i < password.lenth(); i++) {
			char ch = password.charAt(i)  // rec - aprox 40min
	}
		
	
		public static boolean is_letter(char ch) {
			ch = Character.toUpperCase(ch);
			if(ch>'A' && ch <'Z') {
				return true;
			}else{
				return false;
			}
		}
	
		public static boolean is_number(char c)	{
			if(c >= '0' && c <= '9')
				return true;
		}else{
			return false;
		}


}
}
		
		
		
		
	
}
