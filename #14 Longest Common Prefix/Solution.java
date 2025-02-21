class Solution {
    public String longestCommonPrefix(String[] strs) {

        int remainingElements = 1;
        char commonChar = ' ';
        char currentStringChar = ' ';
        int index = 0;
        boolean consensus = true;
        String consensusResult = "";
        
        while(remainingElements == 1){
            System.out.println(index);
            commonChar = ' ';
            for(int i=0;i<strs.length;i++){
                if(index < strs[i].length()){
                    currentStringChar = strs[i].charAt(index);
                    if(commonChar == ' '){
                        commonChar = currentStringChar;
                    }else if(commonChar != currentStringChar ){
                        consensus = false;
                    }
                }else{
                    consensus = false;
                }

                if((index+1) >= strs[i].length()){
                    remainingElements = 0;
                }
            }
            

            if(consensus == true){
                if(commonChar != ' '){
                    consensusResult = consensusResult + commonChar;
                }
            }
            index++;
        }

        return consensusResult;
        
    }
}

/* Time Complexity : O(m+n) */
/* Need a better solution. */
