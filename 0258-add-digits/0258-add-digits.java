class Solution {
    public int addDigits(int n) {
        while(n>9){
            int ans=0;
            while(n>0){
                int x=n%10;
                ans +=x;
                n=n/10;
            }
            n=ans;
        }
        return n;
    }
}