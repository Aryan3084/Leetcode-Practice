class MajorityElement_2 {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) candidate = nums[i];

            if (nums[i] == candidate) count = count + 1;
            else count = count - 1;
        }
        return candidate;
    }

    public static void main(String[] args) {
        MajorityElement_2 obj = new MajorityElement_2();

        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        int result = obj.majorityElement(nums);

        System.out.println("Majority Element: " + result);
    }
}