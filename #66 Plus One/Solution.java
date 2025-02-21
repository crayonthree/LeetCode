class Solution {
    public int[] plusOne(int[] digits) {
        int remainder = 1;
        int currentDigit = 0;
        for(int i=digits.length-1;i>=0;i--){
            currentDigit = digits[i];
            currentDigit = currentDigit + remainder;
            if(currentDigit>=10){
                currentDigit = currentDigit % 10;
                remainder = 1;
            }else{
                remainder = 0;
            }
            digits[i] = currentDigit;
        }

        int numberOfDigits = digits.length;
        if(remainder > 0){
            numberOfDigits++;
        }

        int[] result = new int[numberOfDigits];

        for(int i=0;i<numberOfDigits;i++){

            if(remainder == 1){
                if(i==0){
                    result[i] = remainder;
                }else{
                    result[i] = digits[i-1];
                }
            }else{
                result[i] = digits[i];
            }
        }

        return result;
    }
}

/* Time Complexity : O(n) */