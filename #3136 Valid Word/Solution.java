class Solution {
    public boolean isValid(String word) {

        if(word.length() < 3){
            return false;
        }

        word = word.toLowerCase();

        int countVowels = 0;
        int countLetters = 0;
        for(int i=0;i<word.length();i++){

            char currentChar = word.charAt(i);

            if(currentChar == 'a' || currentChar == 'e'  || currentChar == 'i'  || currentChar == 'o' || currentChar == 'u' ){
                countVowels++;
                countLetters++;
            }else if (currentChar>='a' && currentChar<='z'){
                countLetters++;
            }else if (currentChar>='0' && currentChar<='9'){
                
            }else{
                return false;
            }        

        }

        if(countVowels>0 && (countLetters-countVowels)>0){
            return true;
        }

        return false;
        
    }
}