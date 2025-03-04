class Solution {                                    // Day - 3
    public int fib(int n) {                                        
       if(n==0){
        return 0;
       }else if(n==1){
        return 1;
       }

       int ft = 0;                           // first_term (ft)
       int st = 1;                           // second_term (st)

       for(int i=1; i<=n; i++){
        int tt = ft + st;                   // third_term (tt)

        ft = st;
        st = tt;
           
       }
       
       return ft;
    }
}
