class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for(int i=0;i<words.length;i++){
            String currentString = words[i];

            if(currentString.length()>=pref.length()){

                if((currentString.substring(0,pref.length())).compareTo(pref) == 0){
                    count++;
                }

            }
        }
        return count;
        
    }
}