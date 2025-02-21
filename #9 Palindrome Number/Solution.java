class Solution {
    public boolean isPalindrome(int x) {
        String currentNumber = String.valueOf(x);

        for(int i=0;i<((currentNumber.length()-1) - i);i++){
            char currentChar = currentNumber.charAt(i);
            if(currentChar != currentNumber.charAt((currentNumber.length()-1) - i)){
                return false;
            }
        }

        return true;
    }
}

/* Time Complexity : O(n) */