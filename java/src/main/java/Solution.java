//class Solution {
//    int findPeakElement(int[] nums) {
//        int index = 0;
//        if (nums == null || nums.length == 0) {
//            return 0;
//        }
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i-1] < nums[i] && nums[i+1] < nums[i]) {
//                index = i;
//            }
//        }
//        System.out.println("index:" + index);
//        return index;
//    }
//}

class Solution {
    public int reverse(int x) {

        // int intAsAbsolute = Math.abs(x);
        String absoluteAsString = String.valueOf(x);
        int length = absoluteAsString.length();
        boolean isNegative = false;
        String reversed = "";

        for (int i = (length - 1); i >= 0; i--) {
            if (absoluteAsString.charAt(i) == "-") {
                isNegative = true;
            } else {
                reversed += absoluteAsString.charAt(i);
            }

        }
        return reversed = isNegative ? Integer.parseInt("-" + reversed) : Integer.parseInt(reversed);
    }
}