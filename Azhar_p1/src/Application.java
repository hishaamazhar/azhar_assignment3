import java.util.Scanner;
public class Application {
	public static void main (String args[]) {
		
		System.out.println("Please enter code you would like to encrypt:");
		Scanner codeInput = new Scanner(System.in);
		int code = codeInput.nextInt();
		
		Encrypter Encrypter = new Encrypter();
		Encrypter.encrypt(code);
		
		System.out.println(Encrypter.encrypt(code));
		
		System.out.println("Please enter code you would like to decrypt:");
		Scanner codeInputDec = new Scanner(System.in);
		int codeDec = codeInput.nextInt();
		
		Decrypter Decrypter = new Decrypter();
		Decrypter.decrypt(codeDec);
		
		System.out.println(Decrypter.decrypt(codeDec));
	}
}