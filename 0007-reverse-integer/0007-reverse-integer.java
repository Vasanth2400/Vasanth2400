class Solution {
    public int reverse(int x) {
        long r=0;
        for(int i=0;x!=0;i++){
            r=r*10+x%10;
            x=x/10;
        }
        if(r>Integer.MAX_VALUE||r<Integer.MIN_VALUE){
            return 0;
        }
        return(int)r;
    }
}