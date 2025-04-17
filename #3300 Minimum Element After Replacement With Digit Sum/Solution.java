class Solution {
    public int minElement(int[] nums) {

        int min = 10000;
        for(int i=0;i<nums.length;i++){

            int sum = 0;
            String number = Integer.toString(nums[i]);

            for(int j=0;j<number.length();j++){
                sum = sum + (number.charAt(j) - '0');
            }

            nums[i] = sum;

            if(sum<min){
                min = sum;
            }

        }

        return min;
        
    }
}