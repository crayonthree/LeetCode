class Solution {
    public int romanToInt(String s) {
        int result = 0;
        char nextChar = ' ';
        char currentChar = ' ';
        int currValue = 0;
        int nextValue = 0;

        int index = 0;
        while(index<s.length()){

            currentChar = s.charAt(index);
            if(index+1 < s.length()){
                nextChar = s.charAt(index+1);
            }else{
                nextChar = ' ';
            }

            if(currentChar == 'I'){
                currValue = currValue + 1;
            }else if(currentChar == 'V'){
                currValue = currValue + 5;
            }else if(currentChar == 'X'){
                currValue = currValue + 10;
            }else if(currentChar == 'L'){
                currValue = currValue + 50;
            }else if(currentChar == 'C'){
                currValue = currValue + 100;
            }else if(currentChar == 'D'){
                currValue = currValue + 500;
            }else if(currentChar == 'M'){
                currValue = currValue + 1000;
            }

            if(nextChar != ' '){
                if(nextChar == 'I'){
                    nextValue = nextValue + 1;
                }else if(nextChar == 'V'){
                    nextValue = nextValue + 5;
                }else if(nextChar == 'X'){
                    nextValue = nextValue + 10;
                }else if(nextChar == 'L'){
                    nextValue = nextValue + 50;
                }else if(nextChar == 'C'){
                    nextValue = nextValue + 100;
                }else if(nextChar == 'D'){
                    nextValue = nextValue + 500;
                }else if(nextChar == 'M'){
                    nextValue = nextValue + 1000;
                }
            }else{
                nextValue = -1;
            }

            if(currValue < nextValue){
                result = result + (nextValue-currValue);
                index = index + 2;
            }else{
                result = result + currValue;
                index = index + 1;
            }

            currValue = 0;
            nextValue = 0;

        }

        return result;
        
    }
}

/* Time Complexity : O(n) */
/* Could make a function to remove repetitive code. */
