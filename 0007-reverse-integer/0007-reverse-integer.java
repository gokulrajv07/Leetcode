class Solution {
    public int reverse(int x) {
        int count = 0;
        while(x !=0){
            int rem = x % 10;
            if(count>Integer.MAX_VALUE/10 || count<Integer.MIN_VALUE/10){
                return 0;
            }
            count = count * 10 + rem;
            x = x/10;
        }
        return count;
    }
}