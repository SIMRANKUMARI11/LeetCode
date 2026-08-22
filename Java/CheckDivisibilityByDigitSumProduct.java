class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int mul=1;
        int temp=n;
        while(temp>0){
            int digit=temp%10;
            sum=sum+digit;
            mul=mul*digit;
            temp=temp/10;
        }
        int finalValue=sum+mul;
        if(n%finalValue == 0){
            return true;
        }
        else{
            return false;
        }
    }
}