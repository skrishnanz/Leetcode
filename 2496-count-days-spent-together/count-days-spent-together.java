class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int a1 = Days(arriveAlice);
        int l1 = Days(leaveAlice);
        int a2 = Days(arriveBob);
        int l2 = Days(leaveBob);
        if(l1 < a2 || l2 < a1) return 0;
        return Math.abs(Math.max(a1, a2)-Math.min(l1, l2))+1;
    }
    private int Days(String str){
        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int sum=0,m=Integer.valueOf(str.substring(0,2)),d=Integer.valueOf(str.substring(3,5));
        for(int i=0;i<m-1;i++)
            sum+=month[i];
        return d+sum;
    }
}