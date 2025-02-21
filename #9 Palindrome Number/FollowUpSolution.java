class Solution {
    public boolean isPalindrome(int x) {
        int reverseOfx = 0;
        int copyOfx = x;

        if(x < 0){
            return false;
        }

        while(copyOfx>0){
            reverseOfx = (reverseOfx * 10) + (copyOfx % 10);
            copyOfx = copyOfx / 10;
        }

        if(reverseOfx != x){
            return false;
        }

        return true;
    }
}

/* Time Complexity : O(n) */
