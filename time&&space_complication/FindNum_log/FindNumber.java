



public class FindNumber {

    public static void main(String[] args) {

        //构造对数器
        int N=100;//测试次数
        int n=10;//测试数组长度
        int v=10;//测试数组数值大小范围
        for (int i = 0; i < N; i++)
        {
            int tempv=(int)(Math.random()*v)+1;
            int []arr=randomArray(n,tempv);
            int num=9;



            //检测对比

            if(right(arr,num)!=findnumber(arr,num))
            {
                System.out.println("出错了");
            }
        }
        System.out.println("程序运行结束");


    }
    public static  boolean right(int []arr,int num)
    {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num)
                return true;
        }
        return false;
    }
    public static boolean findnumber(int []arr,int num)
    {
        if(arr==null||arr.length==0) //特殊条件空数组直接返回false
            return false;

        int l=0,r=arr.length-1,m=0;

        while (l<=r)
        {
            m=l+(r-l)/2;
            if(arr[m]==num)
                return true;

            if(arr[m]<num)
            {
                l=m+1;
            }else if(arr[m]>num) {
                r = m -1;
            }
        }
        return false;
    }
    public static int[] randomArray(int n,int v) //n 生成数组长度 v数组数值范围
    {
        return Validator.randomArray(n, v);
    }




}
