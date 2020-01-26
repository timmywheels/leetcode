class FindPeakElement {
    int findPeakElementMethod(int[] nums) {
        int index = 0;
        if (nums == null || nums.length == 0) {
            return 0;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] < nums[i] && nums[i+1] < nums[i]) {
                index = i;
            }
        }
        System.out.println("index:" + index);
        return index;
    }
}