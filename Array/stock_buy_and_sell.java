// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int A[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                A[i] = Integer.parseInt(inputLine[i]);
            }
            Solution obj = new Solution();
            ArrayList<ArrayList<Integer> > ans = obj.stockBuySell(A, n);
            if(ans.size()==0)
                System.out.print("No Profit");
            else{
                for (int i=0; i<ans.size(); ++i){
                    System.out.print("("+ans.get(i).get(0)+" "+ans.get(i).get(1)+") ");
                }
            }System.out.println();
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    ArrayList<ArrayList<Integer> > stockBuySell(int A[], int n) {
          ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
        
         for(int i=1;i<A.length;i++)
         {
             ArrayList<Integer> temp=new ArrayList<Integer>();
             if(A[i-1]<A[i])
             {
                 temp.add(i-1);
                 while(i<n)
                 {
                     if(A[i-1]<=A[i])
                     {
                         i++;
                     }
                     else
                     {
                         break;
                     }
                 }
                 temp.add(i-1);
                 ans.add(temp);
             }
             
         }
         return ans;
        // {
        //     int j=i+1;
        //     if(buy<A[i])
        //     {
        //         buy=A[i];
        //     }
        //     else
        //     {
        //         if(A[j]>A[i])
        //         {
        //             profit(A[j]-A[i]);
        //             if(profit>max_profit)
        //             {
                        
                        
        //             }
        //         }
        //     }
        // }
    }
}
