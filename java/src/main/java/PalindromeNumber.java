public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String intAsString = String.valueOf(x);
        int length = intAsString.length();
        String reversed = "";

        for (int i = (length - 1); i >= 0; i--) {
            reversed += intAsString.charAt(i);
        }

        try {
            return x == Integer.parseInt(reversed);
        } catch (Exception e) {
            System.out.println("Integer overflow...");
            return false;
        }
    }
}
