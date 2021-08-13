// { Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().rearrange(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java




class Solution {
    void rearrange(int arr[], int n) {
        int count_neg=0,count_pos=0;
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0)
            {
                count_neg++;    
            }
            else
            {
                count_pos++;    
            }
        }
        int[] neg=new int[count_neg];
        int[] pos=new int[count_pos];
        int i=0;
        j=0;
        for(int x=0;x<arr.length;x++)
        {
            if(arr[x]>=0)
            {
                pos[i]=arr[x];
                i++;
            }
            else
            {
                neg[j]=arr[x];
                j++;
            }
        }
            
        i=0;
        j=0;
        int x=0;
        int flag=0;
        while(j<neg.length || i<pos.length)
        {
            if(i<pos.length)
            {
                arr[x]=pos[i];
                i++;
                x++;
            }
            if(j<neg.length)
            {
                arr[x]=neg[j];
                j++;
                x++;
            }
            
        }
        if(i==pos.length-1)
            {
                while(j<neg.length)
                {
                    arr[x]=neg[j];
                    j++;
                    x++;    
                }
            }
            else if(j==neg.length-1)
            {
                while(i<pos.length)
                {
                    arr[x]=pos[i];
                    i++;
                    x++;    
                }
            }

        
    }
}
