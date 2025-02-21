class Solution {
    public boolean isNumber(String s) {
        int signCheck = 0;
        int sign = 0;
        int decimalCheck = 0;
        int expCheck = 0;
        int integerCheck = 0;
        char lastChar = ' ';

        for(int i=0;i<s.length();i++){
            char currentChar = s.charAt(i);
            if(currentChar == '-' || currentChar == '+'){
                
                if((integerCheck == 1 || decimalCheck == 1) && expCheck == 0){
                    return false;
                }

                if(expCheck == 1 && (lastChar != 'e' && lastChar != 'E') ){
                    return false;
                }

                if(signCheck == 1 && expCheck == 0){
                    return false;
                }else{
                    signCheck = 1;

                }

            }else if(currentChar == 'e' || currentChar == 'E'){
                
                if(integerCheck == 0 || expCheck == 1){
                    return false;
                }else{
                    expCheck = 1;
                    decimalCheck = 0;
                }

            }else if(currentChar == '.'){
                
                if(expCheck == 1 || decimalCheck == 1){
                    return false;
                }else{
                    decimalCheck = 1;
                }

            }else if(currentChar >= '0' && currentChar <='9'){

                if(decimalCheck == 1 && sign == 1){
                    return false;
                }
                
                integerCheck = 1;

            }else{
                
                return false;

            }

            lastChar = currentChar;

        }

        if(lastChar == 'e' || lastChar == 'E' || lastChar == '-' || lastChar == '+'){
            return false;
        }

        if(lastChar == '.' && integerCheck == 0){
            return false;
        }

        return true;
        
    }
}

/* Time Complexity : O(n) */
