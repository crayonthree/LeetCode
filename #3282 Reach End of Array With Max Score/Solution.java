class Solution {
    public long findMaximumScore(List<Integer> nums) {

        long currentScore = 0;
        int currentIndex = 0;
        long currentValue = 0;
        
        for(int i=0;i<nums.size();i++){
            
            if(i==0){
                currentIndex = i;
                currentValue = nums.get(i);
            }else if(i==nums.size()-1){
                currentScore = currentScore + ( (i - currentIndex) * currentValue);

            }else{

                if(nums.get(i) > currentValue){
                    currentScore = currentScore + ( (i - currentIndex) * currentValue);
                    currentIndex = i;
                    currentValue = nums.get(i);
                }

            }

        }

        return currentScore;
        
    }
}