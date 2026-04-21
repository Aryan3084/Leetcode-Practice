class RotateArray_1 {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] arr = new int[n];
        k = k % n;
        int s = n - k;
        int cnt = 0;

        for (int i = s; i < n; i++) {
            arr[cnt++] = nums[i];
        }
        for (int j = 0; j < s; j++) {
            arr[cnt++] = nums[j];
        }
        for (int i = 0; i < n; i++) {
            nums[i] = arr[i];
        }
    }

    public static void main(String[] args) {
        RotateArray_1 obj = new RotateArray_1();

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        obj.rotate(nums, k);

        System.out.print("Rotated Array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}