class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        int t1=0,t2=0;
        int res=1;
        int max=1;
        String ans="";
        for(int i=0;i<n;i++){
            int p1=i-1;
            int p2=i+1;
            while(p1>=0 && p2<n && (s.charAt(p1)==s.charAt(p2))){
                res=Math.max(res,p2-p1+1);
                if(res>max){
                    max=res;
                    t1=p1;
                    t2=p2;
                }
                p1--;
                p2++;
            }
            p1=i;
            p2=i+1;
            while(p1>=0 && p2<n &&(s.charAt(p1)==s.charAt(p2))){
                res=Math.max(res,p2-p1+1);
                if(res>max){
                    max=res;
                    t1=p1;
                    t2=p2;
                }
                p1--;
                p2++;
            }
        }
        for(int i=t1;i<=t2;i++){
            ans += s.charAt(i);
        }
        return ans;
    }
}