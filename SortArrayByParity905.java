public class SortArrayByParity905 {
    public int[] sortArrayByParity(int[] nums) {
        //use i to go through the array and j to mark the next index of even number
        int i = 0;
        int j = 0;
        while(i < nums.length){
            //if number is odd, we go to next one
           /* if(nums[i] % 2 != 0){
                i++;
            }else{
            //otherwise we put the even number to the front(j)
                swap(i,j,nums);
                i++;
                j++;
            } */
            //make the code more readable
            //if even number, put it to the front(j)
            if(nums[i] % 2 == 0){
                swap(i,j,nums);
                j++;
            }
            i++;
        }
        return nums;
    }
    public void swap(int a, int b, int[] arr){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
