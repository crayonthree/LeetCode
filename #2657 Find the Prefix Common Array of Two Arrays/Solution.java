class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {

        List<Integer> firstList = new ArrayList<>();
        List<Integer> secondList = new ArrayList<>();

        int[] result = new int[A.length];

        for(int i=0;i<A.length;i++){

            int count = 0;
            firstList.add(A[i]);
            secondList.add(B[i]);


            for(int j=0;j<firstList.size();j++){

                if(secondList.contains(firstList.get(j))){
                    count++;
                }

            }


            result[i] = count;

        }

            
        return result;
        
    }
}
