class Solution {
    public List<Integer> spiralOrder(int[][] a) {
        List<Integer> al=new ArrayList<>();
        int t=0;
        int b=a.length-1;
        int l=0;
        int r=a[0].length-1;
        while(l<=r && t<=b){
            for(int i=l;i<=r;i++){
                al.add(a[t][i]);
            }
            t++;
            for(int i=t;i<=b;i++){
                al.add(a[i][r]);
            }
            r--;
            if(t<=b){
                for(int i=r;i>=l;i--){
                    al.add(a[b][i]);
                }
                b--;
            }
            if(l<=r){
                for(int i=b;i>=t;i--){
                    al.add(a[i][l]);
                }
                l++;
            }
        }
        return al;
        
    }
}