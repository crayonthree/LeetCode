class Solution {
    public int getLucky(String s, int k) {

        String result= "";
        String sum = "";
        for(int i=0;i<s.length();i++){

            char currentChar = s.charAt(i);
            sum = sum + ((int)(currentChar)-96);

        }


        for(int i=0;i<k;i++){

            int intSum = 0;
            for(int j=0;j<sum.length();j++){

                char currentChar = sum.charAt(j);
                intSum = intSum + (int)(currentChar - '0');

            }
            sum = Integer.toString(intSum);

        }

        return Integer.valueOf(sum);
        
    }
}