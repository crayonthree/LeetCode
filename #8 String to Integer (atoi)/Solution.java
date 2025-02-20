class Solution {
    public int myAtoi(String s) {
        long stringValue = 0;
        int signConsidered = 0;
        int positivity = 0;
        for(int i=0;i<s.length();i++){
            char currentChar = s.charAt(i);
            if(currentChar == ' ' && signConsidered == 0){

            }else if(currentChar == '-' && signConsidered == 0){
                positivity = 1;
                signConsidered = 1;
            }else if(currentChar == '+' && signConsidered == 0){
                positivity = 0;
                signConsidered = 1;
            }else if(currentChar >= '0' && currentChar <='9'){
                int currentDigit = currentChar - '0';
                stringValue = stringValue*10 + currentDigit;
                signConsidered = 1;
            }else{
                break;
            }

            if(positivity == 0 && stringValue > (Math.pow(2,31)-1)){
                return (int) (Math.pow(2,31)-1);
            }else if(positivity == 1 && stringValue > (Math.pow(2,31))){
                return (int) (0 - Math.pow(2,31));
            }
        }

        if(positivity == 1){
            return (int)(0-stringValue);
        }


        return (int)stringValue;
        
    }
}