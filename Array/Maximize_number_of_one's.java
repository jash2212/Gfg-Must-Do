// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            int m = Integer.parseInt(br.readLine().trim());

            int ans = new Solve().findZeroes(arr, n, m);

            System.out.println(ans);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solve {
    // m is maximum of number zeroes allowed to flip
    int findZeroes(int arr[], int n, int m) {
        int wl=0,wr=0,ws=0,max=-1;
                    int c0=m;

        while(wr<arr.length && wl<arr.length)
        {
            if(arr[wr]==1)
            {
                wr++;
                ws=wr-wl;
                if(ws>max)
                {
                    max=ws;
                }
            }
            else if(arr[wr]==0 )
            {
                
                if(c0>0)
                {
                    wr++;
                    c0--;
                     ws=wr-wl;
                if(ws>max)
                {
                    max=ws;
                }
                }
                else
                {
                    if(arr[wl]==0)
                    {
                        c0++;
                    }
                    wl++;
                    ws=wr-wl;
               
                if(ws>max)
                {
                    max=ws;
                }
                }
                
            }
            
        }
        
        
        
       return max; 
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       /* int c1=0,c2=0,max=0;
        for(int i=0;i<arr.length;i++)
        {
            c1=0;
            c2=m;
            int c=i;
            while(c<n && c2>=0)
            {
                if(arr[c]==0)
                {
                    
                    if(c2==0)
                    {
                        break;
                    }
                    c1++;
                    c2--;
                    
                }
                else
                {
                    c1++;
                    
                }
                c++;
            }
            if(c1>max)
            {
                max=c1;
            }
            
        }
        return max;*/
    }
}
