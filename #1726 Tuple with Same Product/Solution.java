class Solution {
    public int tupleSameProduct(int[] nums) {

        HashMap<Integer, Integer> productFreq = new HashMap<Integer, Integer>();
        
        for(int i=0;i<nums.length;i++){

            for(int j=i+1;j<nums.length;j++){


                if(productFreq.containsKey(nums[i]*nums[j])){

                    int currentFreq = productFreq.get(nums[i]*nums[j]);
                    productFreq.put(nums[i]*nums[j],currentFreq+1);

                }else{

                    productFreq.put(nums[i]*nums[j],1);

                }

            }

        }

        List<Integer> pairs = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i >= 2){
                pairs.add(pairs.get(i-1)+(i-1));
            }else{
                pairs.add(0);
            }
        }

        List<Integer> keyList = new ArrayList<>(productFreq.values());
        int count = 0;
        for(int i=0;i<keyList.size();i++){

            if((int)keyList.get(i) > 1){
                count = count + 8*pairs.get((int)keyList.get(i));
            }
        }

        return count;


    }
}