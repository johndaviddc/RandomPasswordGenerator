import java.security.SecureRandom;

public class RandomPasswordGenerator {
	private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
	private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String DIGITS = "0123456789";
	private static final String SPECIAL_CHARACTERS = "!@#$%^&*()-_=+[]{}|;:,.<>?";
	
	public static void main(String[] args) {
		int length = 12; // You can adjust the defeated length of the password
		
		String randomPassword = generateRandomPassword(length);
		System.out.println("Generate Password: " + randomPassword);
	}
	
	public static String generateRandomPassword(int length) {
		SecureRandom random = new SecureRandom();
		StringBuilder password = new StringBuilder();
		
		String allCharacters = LOWERCASE + UPPERCASE + DIGITS + SPECIAL_CHARACTERS;
		
		for (int i = 0; i < length; i++) {
			int randomIndex = random.nextInt(allCharacters.length());
			password.append(allCharacters.charAt(randomIndex));
		}
		
		return password.toString();
	}

}
