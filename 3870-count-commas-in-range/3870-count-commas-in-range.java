class Solution {
    public int countCommas(int n) {
        int c=0;
        int du=n;
        while(n!=0){
            int di=n%10;
            c+=1;
            n=n/10;
        }
        if(c<=3){
            return 0;
        }
        return du-1000+1;
    }
}