/**
 * Leetcode 162
 *
 */
public class FindpeakNumber {
    public static void main(String[] args) {
            int arr[]={1,2,3,4,3,2,1};
        System.out.println(findPeak(arr));
    }
    public static int findPeak(int []arr){
        if(arr[0]>arr[1]){
            return 0;
        }
        int res=-1;
        if(arr[arr.length-1]>arr[arr.length-2])
        {
            return arr.length-1;
        }
        int l=1,r=arr.length-2,m=0;
        while (l<=r)
        {
            m=l+((r-1)>>1);
            if(arr[m]>arr[m-1]&&arr[m]>arr[m+1]){
                res=m;
                return res;
            }
            if(arr[m]>arr[m-1]&&arr[m]<arr[m+1])
            {
                l=m+1;
            }
            if(arr[m]<arr[m-1]&&arr[m]>arr[m+1])
            {
                r=m-1;
            }
        }

        return -1;
    }
}