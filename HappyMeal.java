
public class HappyMeal {
    private String name;
    private String[] toys = { "Ronald McDonald Doll", "McWrist Wallet", "Diener Keshi Figures", "McDonaldland Cookies",
            "McNugget Buddies", "Berenstain Bears", "Chip 'n Dale Rescue Rangers", "Muppet Babies",
            "Mickey's Birthdayland Racers", "Ty Teenie Beanie Babies", "Power Rangers", "Hot Wheels" };

    public HappyMeal(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    // Reverses a string
    public String reverseString(String s) {
        int len = s.length();
        String reverse = "";

        for (int i = len - 1; i >= 0; i--) {
            reverse += s.charAt(i) + "";
        }

        return reverse;
    }

    // Returns true if String has duplicate
    public boolean hasDuplicate(String s) {
        char[] charArr = s.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            for (int j = i; j < charArr.length; j++) {
                if (j != i && charArr[j] == charArr[i])
                    return true;
            }
        }
        return false;
    }

    // Checks if String contains a letter
    public boolean hasLetter(String s, String val) {
        char[] charArr = s.toCharArray();
        for (char c : charArr) {
            String cStr = c + "";
            if (cStr.equals(val))
                return true;
        }
        return false;
    }

    public boolean hasLetter(String s, char val) {
        char[] charArr = s.toCharArray();
        for (char c : charArr) {
            if (c == val)
                return true;
        }
        return false;
    }

    // Checks if string has same letter throughout
    // Precondition: s must have a length of at least 1
    // Postcondition: returns a boolean value (true if all letters are same, false
    // otherwise)
    public boolean isSameLetter(String s) {
        char startingChar = s.charAt(0);

        for (char c : s.toCharArray()) {
            if (c != startingChar)
                return false;
        }

        return true;
    }

    // Shifts letters to the left by 1
    public String shiftToLeft(String s) {
        char[] charArray = s.toCharArray();
        String shifted = "";

        for (int i = 1; i < charArray.length; i++) {
            shifted += charArray[i] + "";
        }

        shifted += charArray[0] + "";
    }

    // Returns boolean if integer is evenly divisible by another integer
    public boolean isDivisibleBy(int quotient, int divisor) {
        return quotient % divisor == 0;
    }

    // Identifies the individual digits in an integer.
    public char[] toDigitArray(int n) {
        return Integer.toString(n).toCharArray();
    }
}