class Solution {
    public int[] evenOddBit(int n) {
      int even=0;
      int odd=0;
       int sum=0;
        while(n>0){
            int d=n%2;
            if(d==1){
                if(sum%2==0) even++;
                else 
                odd++;
            }
              n=n/2;
            sum++;
          
        }
        return new int[]{even,odd} ;
    }
}