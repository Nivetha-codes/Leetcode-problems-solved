class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        //TC - O(m+n) (we are iterating through all elements in nums1 & nums2)
        //SC - O(1) - no extra space used
        //another way is to simply merge nums2 with nums1 and sort nums1 - TC - O((m+n) log (m+n)).
        //another way - merge two array in sorted order in another array and copy it to nums1 

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i>=0 && nums1[i] > nums2[j]) {

                nums1[k] = nums1[i];
                i--;

            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

    }
}