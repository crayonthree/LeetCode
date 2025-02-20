class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2 != 0 || arr[i] == 1){
                j++;
            }else{
                j = 0;
            }
            if(j>2){
                return true;
            }
        }
        return false;
    }
}

/* Time Complexity: O(n) */