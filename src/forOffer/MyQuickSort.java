package forOffer;

public class MyQuickSort {
    private static int myPartition(int start, int end, int[] nums) {
        int target = nums[end];
        int small = start - 1;
        for (int i = start; i < end; i++) {
            if (nums[i] < target) {
                ++small;
                if (small != i) {
                    int tmp = nums[small];
                    nums[small] = nums[i];
                    nums[i] = tmp;
                }
            }
        }
        small++;
        int tmp = nums[small];
        nums[small] = nums[end];
        nums[end] = tmp;

        return small;
    }

    private static void myquickSort(int[] nums, int start, int end) {
        if (start < end) {
            int x = myPartition(start, end, nums);
            myquickSort(nums, start, x - 1);
            myquickSort(nums, x + 1, end);
        }

    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 89, 7, 42, 154,2, 5456, 1234, 5123, 12145, 1};
        myquickSort(nums, 0, nums.length - 1);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
