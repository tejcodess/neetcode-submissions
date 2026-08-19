class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int needed=target-nums[i];

            if(map.containsKey(needed)){
                return new int[]{map.get(needed),i};
            }
            map.put(nums[i],i);
        }
        return arr;

        // int[] arr=new int[2];
        // for(int i=0; i<nums.length; i++){
        //     for(int j=0; j<nums.length; j++){
        //         if(nums[i]+nums[j]==target){
        //             arr[0]=j;
        //             arr[1]=i;
        //             break;
        //         }
        //     }
        // }
        // return arr;
    }
}
