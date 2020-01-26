class ReverseInteger {
    int reverse(int x) {
        String absoluteAsString = String.valueOf(x);
        int length = absoluteAsString.length();
        boolean isNegative = false;
        String reversed = "";

        for (int i = (length - 1); i >= 0; i--) {
            if (absoluteAsString.charAt(i) == '-') {
                isNegative = true;
            } else {
                reversed += absoluteAsString.charAt(i);
            }

        }
        reversed = isNegative ? '-' + reversed : reversed;
        return Integer.parseInt(reversed);
    }
}