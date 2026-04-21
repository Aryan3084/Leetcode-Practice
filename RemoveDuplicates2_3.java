class RemoveDuplicates2_3 {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;

        if (n <= 2) {
            return n;
        }

        int j = 2;

        for (int i = 2; i < n; i++) {
            if (nums[i] != nums[j - 2]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        RemoveDuplicates2_3 obj = new RemoveDuplicates2_3();

        int[] nums = {1, 1, 1, 2, 2, 3};

        int k = obj.removeDuplicates(nums);

        System.out.println("New length: " + k);
        System.out.print("Array after removing duplicates: ");

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}