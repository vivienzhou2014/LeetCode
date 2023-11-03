public class MergeSortedArray88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        m = m-1;
        n = n-1;
        for(int write = nums1.length-1; write >= 0; write--){
            if(m>=0 && n>=0) {
                if (nums1[m] > nums2[n]) {
                    nums1[write] = nums1[m];
                    m--;
                } else {
                    nums1[write] = nums2[n];
                    n--;
                }
            }else if(m>=0){
                nums1[write] = nums1[m];
                m--;
            }else if(n>=0){
                nums1[write] = nums2[n];
                n--;
            }

        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1,3,nums2,3);
        for(int i : nums1){
            System.out.println(i);
        }
    }
}
