public class FindNum_left {
    public static void main(String[] args) {
        int []arr={1,2,3,5,6};
        System.out.println(findLeft(arr,4));
    }
    public static int findLeft(int []arr,int num )
    {

        if(arr==null||arr.length==0)
        {
            return -1; //-1代表没有找到
        }

        int res=-1;
        int l=0,r=arr.length-1,m=0;

        while (l<=r)
        {
            m=l+((r-l)>>1);
            if(arr[m]<=num)
            {
                res=m;
                l=m+1;
            }
            else if(arr[m]>num)
            {
                r=m-1;
            }

        }

        return  res;
    }
}
