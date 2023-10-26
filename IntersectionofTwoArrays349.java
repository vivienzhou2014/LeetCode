import java.util.Arrays;
import java.util.HashSet;

public class IntersectionofTwoArrays349 {
    public static int[] intersection1(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> array = new HashSet<>();
        for(int i : nums1){set.add(i);}
        for(int j : nums2){
            if(set.contains(j)){
                array.add(j);
            }
        }
        //return array.stream().mapToInt(i->i).toArray();
        int i = 0;
        int[] result = new int[array.size()];
        for(int e : array){
            result[i] = e;
            i++;
        }
        return result;
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] result = new int[n1 < n2? n1: n2];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, i1 = 0, i2 = 0;
        while(i1 < nums1.length && i2 < nums2.length){
            int num1 = nums1[i1];
            int num2 = nums2[i2];
            if(num1 == num2){
                if(i==0 || result[i - 1] != num1){
                    result[i] = num1;
                    i++;
                }
                i1++;
                i2++;
            }else if(num1 < num2){i1++;
            }else{i2++;}
        }
        return Arrays.copyOf(result, i);
    }

    public static void main(String[] args) {
        int[] nums1 = {4,9,5}, nums2 = {9,4,9,8,4};
        int[] res = intersection(nums1,nums2);
        for(int i :res){
            System.out.println(i);
        }
    }
}
