// { Driver Code Starts
import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            
            //taking input n
            int n = Integer.parseInt(br.readLine().trim());
            long arr[] = new long[n];
            String inputLine[] = br.readLine().trim().split(" ");
            
            //adding elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(inputLine[i]);
            }

            Solution ob = new Solution();
            
            //calling equilibriumPoint() function
            System.out.println(ob.equilibriumPoint(arr, n));
        }
    }
}// } Driver Code Ends



class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {
        int count=0,flag=0;
        long sum=0;
        long rem_sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        int pre_sum=0;
        for(int i=0;i<arr.length;i++)
        {
            pre_sum+=arr[i];
            rem_sum=sum-pre_sum+arr[i];
            if(pre_sum==rem_sum)
            {
                return i+1;
            }
            
        }
        
        
        return -1;
    }
}
