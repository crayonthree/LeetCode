class Solution {
    public boolean backspaceCompare(String s, String t) {

        for(int i=0;i<s.length();i++){

            char currentChar = s.charAt(i);

            if(currentChar == '#'){

                if(i > 0){

                    if(i == s.length()-1){
                        s = s.substring(0,i-1);
                    }else{
                        s = s.substring(0,i-1) + s.substring(i+1);
                        i = i-2;
                    }
                }

            }

        }

        for(int i=0;i<t.length();i++){

            char currentChar = t.charAt(i);

            if(currentChar == '#'){

                if(i > 0){

                    if(i == t.length()-1){
                        t = t.substring(0,i-1);
                    }else{
                        t = t.substring(0,i-1) + t.substring(i+1);
                        i = i-2;
                    }
                }

            }

        }

        s = s.replaceAll("#","");
        t = t.replaceAll("#","");

        if(s.compareTo(t) == 0){
            return true;
        }else{
            return false;
        }
        
    }
}