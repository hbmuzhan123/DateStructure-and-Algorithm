

public class FindNum_right {
    public static void main(String[] args) {
            int []arr={1,2,3,5,6};
        System.out.println(findRight(arr,4));
    }
    public static int findRight(int []arr,int num)
    {
        if(arr==null||arr.length==0)
        {
            return -1;
        }
        int res=-1;
        int l=0,r=arr.length-1,m=0;
        while (l<=r)
        {
            m=l+((r-l)>>1);  //
            if(arr[m]>=num)
            {
                res=m;
                r=m-1;
            }
            else if(arr[m]<num) {
                l=m+1;
            }
        }
        return res;
    }
}
