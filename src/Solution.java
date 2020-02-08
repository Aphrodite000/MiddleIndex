public class Solution {
    //思路2 算出数组总和，算出左边的总和，看左边的总*2加上当前位置的数字是否等于总和
    public int pivotIndex(int[] nums) {
        int sum1=0;
        int sum2=0;
        for(int i=0;i<nums.length;i++){
            sum1=0;
            sum2=0;
            for(int j=0;j<i;j++){
                sum1=sum1+nums[j];
            }
            for(int p=i+1;p<nums.length;p++){
                sum2=sum2+nums[p];
            }
            if(sum1==sum2){
                return i;
            }
        }
        return -1;
    }
    /*
    public int pivotIndex(int[] nums) {
        int Sum=0;
        for(int i=0;i<nums.length;i++){
            Sum=Sum+nums[i];
        }
        int rightSum=Sum;
        for(int i=0;i<nums.length;i++){
            rightSum=rightSum-nums[i];
            if(rightSum*2==Sum-nums[i]){
                return i;
            }
        }
        return -1;
    }
     */
}
