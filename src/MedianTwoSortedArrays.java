import java.util.Arrays;

public class MedianTwoSortedArrays {
    public static void runMediamTwoArrays() {
        int[] nums1 = new int[]{1,2};
        int[] nums2 = new int[]{3,4};

        findMedianSortedArrays(nums1, nums2);
    }

    // RUNTIME: O(m + n) (lengths of each array)
    // TARGET RUNTIME: O(log(m + n))
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double ans = 0;
        int[] mergedArray = new int[nums1.length+nums2.length];
        int i = 0, j = 0, k = 0;

        while (i < nums1.length && j < nums2.length) {
            mergedArray[k++] = nums1[i] < nums2[j] ? nums1[i++] : nums2[j++];
        }

        while (i < nums1.length) {
            mergedArray[k++] = nums1[i++];
        }

        while (j < nums2.length) {
            mergedArray[k++] = nums2[j++];
        }

        if (mergedArray.length % 2 == 0) {
            ans = mergedArray[mergedArray.length/2] + mergedArray[(mergedArray.length/2)-1];
            ans /= 2;

            return ans;
        }
        int medianIndex = (mergedArray.length / 2);
        ans = mergedArray[medianIndex];
        return ans;
    }
}
