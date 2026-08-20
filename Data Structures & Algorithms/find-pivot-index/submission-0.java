class Solution {
    public int pivotIndex(int[] nums) {
        int pivot=0;
        for(int i=0; i<nums.length; i++){
            int sum_left=0;
            int sum_right=0;
            int j;
            for(j=0; j<pivot; j++){
                sum_left+=nums[j];
            }
            for(j=pivot+1; j<nums.length; j++){
                sum_right+=nums[j];
            }
            if(sum_left==sum_right){
                break;
            }
            pivot++;
        }
        if(pivot==nums.length) return -1;
        return pivot;
    }
}