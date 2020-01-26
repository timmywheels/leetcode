public class RomanToInteger {
    public int romanToInt(String s) {

        int temp = 0;
        int length = s.length();

        for (int i = length - 1; i >= 0; i--) {

            char currentChar = s.charAt(i);
            char charBefore = 0;
            char charAfter = 0;

            try {
                charBefore = s.charAt(i - 1);
            } catch (Exception e) {
                System.out.println("charBefore out of bounds...");
            }

            try {
                charAfter = s.charAt(i + 1);
            } catch (Exception e) {
                System.out.println("charAfter out of bounds...");
            }

            try {

                if (currentChar == 'V') {
                    if (charBefore == 'I') {
                        System.out.println("char: 4");
                        temp += 4;
                    } else {
                        System.out.println("char: 5");
                        temp += 5;
                    }
                }

                if (currentChar == 'X') {
                    if (charBefore == 'I') {
                        System.out.println("char: 9");
                        temp += 9;
                    }
                    else if (charAfter != 'C' && charAfter != 'L'){
                        temp += 10;
                        System.out.println("char: 10");
                    }
                }

                if (currentChar == 'L') {
                    if (charBefore == 'X') {
                        System.out.println("char: 40");
                        temp += 40;
                    } else {
                        System.out.println("char: 50");
                        temp += 50;
                    }
                }

                if (currentChar == 'C') {
                    if (charBefore == 'X') {
                        System.out.println("char: 90");
                        temp += 90;
                    } else if (charAfter == 'M' || charAfter == 'D') {
                        System.out.println("char: 0");
                        temp += 0;
                    } else {
                        System.out.println("char: 100");
                        temp += 100;
                    }
                }

                if (currentChar == 'D') {
                    if (charBefore == 'C') {
                        System.out.println("char: 400");
                        temp += 400;
                    } else {
                        System.out.println("char: 500");
                        temp += 500;
                    }
                }

                if (currentChar == 'M') {
                    if (charBefore == 'C') {
                        System.out.println("char: 900");
                        temp += 900;
                    } else {
                        System.out.println("char: 1000");
                        temp += 1000;
                    }
                }

                if (currentChar == 'I' && charAfter != 'V' && charAfter != 'X') {
                    System.out.println("char: 1");
                    temp += 1;
                }
            } catch (Exception e) {
                System.out.println("Error...");
            }

        }

//        System.out.println(Integer.parseInt(number));
//        System.out.println("Temp: " + temp);
        System.out.println("temp: " + temp);
        return temp;
//        return Integer.parseInt(number);
    }
}
