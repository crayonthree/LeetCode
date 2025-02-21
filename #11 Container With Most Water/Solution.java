/*Multiple pointers*/
class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int area = 0;
        int leftPointer = 0;
        int rightPointer = height.length-1;
        while(leftPointer != rightPointer){
            int lowerHeight = 0;
            int base = rightPointer - leftPointer;
            if(height[leftPointer]<height[rightPointer]){
                lowerHeight = height[leftPointer];
                leftPointer++;
            }else{
                lowerHeight = height[rightPointer];
                rightPointer--;
            }

            area = lowerHeight*base;
            if(area>maxWater){
                maxWater = area;
            }
        }

        return maxWater;
        
    }
}

/* Time Complexity : O(n) */