class Solution {
    public int countSpecialIntegers(int[] nums) {
        int n=nums.length;
        int specialCount=0;
        for(int i=0;i<n;i++){
            int target=nums[i];
            boolean alreadyChecked=false;
            for(int k=0;k<i;k++){
                if(nums[k]==target){
                    alreadyChecked=true;
                    break;
                }
            }
            if(alreadyChecked){
                continue;
            }
            int firstIdx=-1;
            int lastIdx=-1;
            for(int j=0;j<n;j++){
                if(nums[j]==target){
                    if(firstIdx==-1){
                        firstIdx=j;
                    }
                    lastIdx=j;
                }
            }
            boolean isSpecial=true;
            for(int j=firstIdx;j<=lastIdx;j++){
                if(nums[j]!=target){
                    isSpecial=false;
                    break;
                }
            }
            if(isSpecial){
                specialCount++;
            }
        }
        return specialCount;
        
    }
}
