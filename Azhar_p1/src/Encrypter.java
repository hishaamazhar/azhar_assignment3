public class Encrypter {
	public int encrypt(int code) {
		
		int firstDigitSub = code % 1000;
		int thousand = code - firstDigitSub;
		int firstDigit = thousand / 1000;
		
		int secondDigitSub = code % 100;
		int hundred = code - thousand - secondDigitSub;
		int secondDigit = hundred / 100;
		
		int thirdDigitSub = code % 10;
		int ten = code - thousand - hundred - thirdDigitSub;
		int thirdDigit = (code - thousand - hundred - thirdDigitSub) / 10;
		
		int fourthDigit = (code - thousand - hundred - ten);
		
		
		firstDigit += 7;
		secondDigit += 7;
		thirdDigit += 7;
		fourthDigit += 7;
		
		
		firstDigit %= 10;
		secondDigit %= 10;
		thirdDigit %= 10;
		fourthDigit %= 10;
		
		
		int temporaryFirst = firstDigit;
		int temporarySecond = secondDigit;
		
		
		firstDigit = thirdDigit;
		secondDigit = fourthDigit;
		thirdDigit = temporaryFirst;
		fourthDigit = temporarySecond;
		
		String codeOutput = String.format("%04d", code);
		
		return code = (firstDigit * 1000) + (secondDigit * 100) + (thirdDigit * 10) + (fourthDigit);
	}
}