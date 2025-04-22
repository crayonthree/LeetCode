class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {

        List<Integer> differencesList = new ArrayList<>();
        for(int i=0;i<differences.length;i++){

            if(differences[i]!=0){
                differencesList.add(differences[i]);
            }

        }

        int count = 0;
        int lastNumber = lower;
        
        int max = lastNumber;
        int min = lastNumber;
        for(int i=0;i<differencesList.size();i++){

            lastNumber = lastNumber + differencesList.get(i);
            if(lastNumber>=max){
                max = lastNumber;
            }

            if(lastNumber<=min){
                min = lastNumber;
            }

        }

        if(min<lower && max>upper){
            return 0;
        }

        min = lower - min;
        max = upper - max;

        if(min > (max+1)){
            return 0;
        }else{
            return (max+1) - min;
        }


    }
}