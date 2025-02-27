class Solution {                                                          // Day 1 
    public boolean isPalindrome(int x) {
      if(x<0){
        return false;
      }

      int n=x;
      int revNum = 0;
      while(n>0){
        int d = n%10;               // (n mod 10) return last digit remainder
        revNum = revNum*10+d;
        n = n/10;
      }

      if(revNum == x){
        return true;
      }else{
        return false;
      }
 
    }
}
