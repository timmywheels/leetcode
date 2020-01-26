class ReverseInteger {
    int reverse(int x) {
        String absoluteAsString = String.valueOf(x);
        int length = absoluteAsString.length();
        boolean isNegative = false;
        String reversed = "";
        int reversedAsInt = 0;

        for (int i = (length - 1); i >= 0; i--) {
            if (absoluteAsString.charAt(i) == '-') {
                isNegative = true;
            } else {
                reversed += absoluteAsString.charAt(i);
            }
        }
        reversed = isNegative ? '-' + reversed : reversed;

        try {
            reversedAsInt = Integer.parseInt(reversed);
        } catch (Exception e) {
            System.out.println("Input overflowed");
            return 0;
        }
        System.out.println("passed");
        return Integer.parseInt(reversed);

    }
}