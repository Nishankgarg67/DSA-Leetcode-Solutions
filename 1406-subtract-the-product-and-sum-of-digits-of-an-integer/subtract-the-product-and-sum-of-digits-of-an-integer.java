class Solution {
    public int subtractProductAndSum(int n) {
        int prod = 1;
        int sum = 0;
        if(n==0){
            return 0;
        }
        while (n>0){
            int c = n%10;
            prod *=c;
            sum +=c;
            n/=10;
        }
        int diff = prod - sum ;
        return diff;
        
    }
}
