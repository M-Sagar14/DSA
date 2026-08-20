class Solution {
    public boolean isHappy(int n) {
        while(n!=1 && n!=4){
            int ans=0;
            while(n>0){
                int x=n%10;
                ans +=x*x;
                n=n/10;
            }
            n=ans;
        }
        return n==1;

    }
}