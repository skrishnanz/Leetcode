class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int num=x;
        int result=0;
        while(num!=0){
            int remain=num%10;
            result=result*10+remain;
            num/=10;
        }
        if(result==x){
            return true;
        }
    return false;
    }
}


    
  
    
