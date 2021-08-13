// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            int n = Integer.parseInt(stt.nextToken());
            int m = Integer.parseInt(stt.nextToken());
            int k = Integer.parseInt(stt.nextToken());
            int a[] = new int[(int)(n)];
            int b[] = new int[(int)(m)];
            
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                b[i] = Integer.parseInt(inputLine1[i]);
            }
            
            
            Solution obj = new Solution();
            System.out.println(obj.kthElement( a, b, n, m, k));
            
        }
	}
}
// } Driver Code Ends


//User function Template for Java


class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        
        if(n>m)
        {
            int[] temp=arr2;
            arr2=arr1;
            arr1=temp;
            int t=n;
            n=m;
            m=t;
        }
        int low = Math.max(0,k-m), high = Math.min(k,n);
        int l1=0,l2=0,r1=0,r2=0;
        while(low<=high)
        {
            int cut1=(low+high)/2;
            if(cut1==0)
            {
                l1=Integer.MIN_VALUE;
            }
            else
            {
                l1=arr1[cut1-1];
            }
            if(cut1==n)
            {
                r1=Integer.MAX_VALUE;
            }
            else
            {
                r1=arr1[cut1];
            }
            int cut2=k-cut1;
            if(cut2==0)
            {
                l2=Integer.MIN_VALUE;
            }
            else
            {
                l2=arr2[cut2-1];
            }
            if(cut2==m)
            {
                r2=Integer.MAX_VALUE;
            }
            else
            {
                r2=arr2[cut2];
            }
            
            if(l1<=r2 && l2<=r1)
            {
                return Math.max(l1,l2);
            }
            else if(l2>r1)
            {
                low=cut1+1;
            }
            else
            {
                high=cut1-1;
            }
        }
        
        return 0;
    }
}
