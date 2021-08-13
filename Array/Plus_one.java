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
            
            String S[] = read.readLine().split(" ");
            
            ArrayList<Integer> arr = new ArrayList<>();
            
            for(int i=0 ; i<N ; i++)
                arr.add(Integer.parseInt(S[i]));

            Solution ob = new Solution();
            ArrayList<Integer> res = ob.increment(arr,N);
            
            for(int i=0; i<res.size(); i++)
                System.out.print(res.get(i) + " ");
            System.out.println();
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static ArrayList<Integer> increment(ArrayList<Integer> arr , int N) {
        Collections.reverse(arr);
        int carry=0;
        int flag=0;
        arr.set(0,arr.get(0)+1);
        if(arr.get(0)>9)
        {
            arr.set(0,0);
            carry=1;
        }
        
       
            for(int i=1;i<arr.size();i++)
            {
                if(carry==1)
                {
                arr.set(i,arr.get(i)+1);
                if(arr.get(i)>9)
                {
                  
                    carry=1;
                    arr.set(i,0);
                }
                else
                {
                    //arr.set(i,arr.get(i)+1);
                    carry=0;
                
                    break;    
                }
                
            }
        }
        Collections.reverse(arr);

        if(carry==1)
        {
            arr.add(0,1);
        }
        return arr;
    }
};
