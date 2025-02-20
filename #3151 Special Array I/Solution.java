class Solution {
    public boolean isArraySpecial(int[] nums) {
        int parity = 0;
        for(int i=0;i<nums.length-1;i++){
            if(((nums[i]%2==0) && (nums[i+1]%2!=0)) || ((nums[i+1]%2==0) && nums[i]%2!=0)){

            }else{
                parity = 1;
            }
        }
        if(parity == 0){
            return true;
        }else{
            return false;
        }
        
    }
}

/* Time Complexity: O(n) */
