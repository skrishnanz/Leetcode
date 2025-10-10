class Solution {
    public int addDigits(int num) {
        int sum=0;
        while(num>=10){
            sum=0;
            while(num>0){
                int a=num%10;
                sum+=a;
                num/=10;
            }
            num=sum;
        
        }
        return num;
        
    }
}