import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== PASSWORD GENERATOR =====");

        System.out.print("Enter password length: ");
        int length = scanner.nextInt();

        System.out.print("* Include Uppercase letters? (true/false): ");
        boolean useUpper = scanner.nextBoolean();

        System.out.print("* Include Lowercase letters? (true/false): ");
        boolean useLower = scanner.nextBoolean();

        System.out.print("* Include Numbers? (true/false): ");
        boolean useNumbers = scanner.nextBoolean();

        System.out.print("* Include Special Characters? (true/false): ");
        boolean useSpecial = scanner.nextBoolean();

        PasswordGenerator generator = new PasswordGenerator(
                length, useUpper, useLower, useNumbers, useSpecial);

        String password = generator.generatePassword();

        System.out.println("\nGenerated Password: " + password);

        PasswordStrengthChecker checker = new PasswordStrengthChecker();
        System.out.println("Password Strength: " + checker.checkStrength(password));

        scanner.close();
    }
}