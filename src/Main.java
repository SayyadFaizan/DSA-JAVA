import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class Main {
    public static String generatePassword(String email) {
        try {
            // Create a MessageDigest instance for hashing
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            // Hash the email address
            byte[] hashBytes = digest.digest(email.getBytes());

            // Convert the hash bytes to a Base64 encoded string
            String base64Hash = Base64.getEncoder().encodeToString(hashBytes);

            // Use the first 12 characters from the Base64 string as the password
            // Optionally, you can add more transformations or randomness here
            return base64Hash.substring(0, 12); // Ensure it’s the required length

        } catch (NoSuchAlgorithmException e) {
            // Handle the exception if the hashing algorithm is not found
            e.printStackTrace();
            return null; // Or handle the error as needed
        }
    }

    public static void main(String[] args) {
        // Example usage
        String email = "user@example.com";
        String email1 = "user@example123.com";
        String password = generatePassword(email);
        String password1 = generatePassword(email1);
        System.out.println("Generated Password: " + password);
        System.out.println("Generated Password: " + password1);
    }
}