class Solution {
    public String countAndSay(int n) {
        if(n==1){
            return String.valueOf(n);
        }else{
            String returnString = countAndSay(n-1);
            char currentElement = ' ';
            int count = 0;
            String result = "";
            for(int i=0;i<returnString.length();i++){
                if(currentElement == ' '){
                    currentElement = returnString.charAt(i);
                    count++;
                }else{

                    if(returnString.charAt(i) == currentElement){
                        count++;
                    }else{
                        result = result + count+currentElement;
                        currentElement = returnString.charAt(i);
                        count=1;
                    }

                }
            }
            result = result + count+currentElement;
            return result;
        }
        
    }
}