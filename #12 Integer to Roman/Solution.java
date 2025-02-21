class Solution {
    public String intToRoman(int num) {
        String resultString = "";
        while(num>0){
            if(num >= 1000){
                num = num - 1000;
                resultString = resultString + "M";
            }else if(num >= 500){
                if(num/100 == 9){
                    num = num - 900;
                    resultString = resultString + "CM";
                }else{
                    num = num - 500;
                    resultString = resultString + "D";
                }

            }else if(num >= 100){
                if(num/100 == 4){
                    num = num - 400;
                    resultString = resultString + "CD";
                }else{
                    num = num - 100;
                    resultString = resultString + "C";
                }

            }else if(num >= 50){
                if(num/10 == 9){
                    num = num - 90;
                    resultString = resultString + "XC";
                }else{
                    num = num - 50;
                    resultString = resultString + "L";
                }

            }else if(num >= 10){
                if(num/10 == 4){
                    num = num - 40;
                    resultString = resultString + "XL";
                }else{
                    num = num - 10;
                    resultString = resultString + "X";
                }

            }else if(num >= 5){
                if(num == 9){
                    num = num - 9;
                    resultString = resultString + "IX";
                }else{
                    num = num - 5;
                    resultString = resultString + "V";
                }

            }else if(num >= 1){
                if(num == 4){
                    num = num - 4;
                    resultString = resultString + "IV";
                }else{
                    num = num - 1;
                    resultString = resultString + "I";
                }
            }
        }

        return resultString;
        
    }
}

/* Time Complexity : O(n) */
/* This can be improved with arrays storing strings to add and the values (1,5,10,etc.) */
