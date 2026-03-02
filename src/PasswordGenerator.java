import java.util.Random;

public class PasswordGenerator {

    private int length;
    private boolean useUpper;
    private boolean useLower;
    private boolean useNumbers;
    private boolean useSpecial;

    private final String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final String lower = "abcdefghijklmnopqrstuvwxyz";
    private final String numbers = "0123456789";
    private final String special = "!@#$%^&*()-_+=<>?/";

    public PasswordGenerator(int length, boolean useUpper,
                             boolean useLower, boolean useNumbers,
                             boolean useSpecial) {
        this.length = length;
        this.useUpper = useUpper;
        this.useLower = useLower;
        this.useNumbers = useNumbers;
        this.useSpecial = useSpecial;
    }

    public String generatePassword() {

        if (!useUpper && !useLower && !useNumbers && !useSpecial) {
            return "Error: At least one option must be selected.";
        }

        StringBuilder characterPool = new StringBuilder();

        if (useUpper) characterPool.append(upper);
        if (useLower) characterPool.append(lower);
        if (useNumbers) characterPool.append(numbers);
        if (useSpecial) characterPool.append(special);

        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characterPool.length());
            password.append(characterPool.charAt(index));
        }

        return password.toString();
    }
}