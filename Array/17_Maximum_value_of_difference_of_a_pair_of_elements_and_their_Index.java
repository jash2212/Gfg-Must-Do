// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S1[] = read.readLine().split(" ");
            
            int[] arr = new int[N];
            
            for(int i=0; i<N; i++)
            {
                arr[i] = Integer.parseInt(S1[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.maxValue(arr,N));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static int maxValue(int[] arr, int N) {
         int max1=-Integer.MIN_VALUE,min1=Integer.MAX_VALUE,max2=-Integer.MIN_VALUE,min2=Integer.MAX_VALUE,max=0;
        for(int i=0;i<arr.length;i++)
        {
            int a=arr[i]+i;
            int b=-arr[i]+i;
            if(a>max1)
            {
                max1=a;    
            }
            if(a<min1)
            {
                min1=a;
            }
            if(b>max2)
            {
                max2=b;
            }
            if(b<min2)
            {
                min2=b;
            }
            max=Math.max(max1-min1,max2-min2);
        }
        return max;
    }
};
