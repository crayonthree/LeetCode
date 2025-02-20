class Solution {
    public int reverse(int x) {
        int currentValue = 0;
        int positivity = 0;
        int signConsidered = 0;
        int numberOfDigits = 0;
        String currentNumber = String.valueOf(x);
        for(int i=currentNumber.length()-1;i>=0;i--){
            char currentChar  = currentNumber.charAt(i);
            if(currentChar == '-'){
                positivity = 1;
                signConsidered = 1;
            }else if(currentChar == '+'){
                positivity = 0;
                signConsidered = 1;
            }else{
                int currentDigit = currentChar - '0';
                if(currentValue <= Integer.MAX_VALUE/10){
                    currentValue = currentValue*10 + currentDigit;
                    numberOfDigits++;
                }else{
                    return 0;
                }
            }

            if(currentValue < 0){
                return 0;
            }
        }

        if(positivity == 1){
            return (0-currentValue);
        }

        return currentValue;
        
    }
}
