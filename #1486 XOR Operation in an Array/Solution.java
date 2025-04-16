class Solution {
    public int xorOperation(int n, int start) {

        int XORsum = 0;

        for(int i=0;i<n;i++){
            if(i==0){
                XORsum = start + 2 * i;
            }else{
                XORsum = XORsum ^ (start + 2 * i);
            }
        }

        return XORsum;
        
    }
}