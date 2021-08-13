// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;


class Array {

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		  
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements to the array
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling trappingWater() function
		    System.out.println(obj.trappingWater(arr, n));
		}
	}
}

// } Driver Code Ends




class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static int trappingWater(int arr[], int n) { 
        
        
        Stack<Integer> stack=new Stack<Integer>();
        stack.push(0);
        int[] left=new int[arr.length];
        left[0]=0;
        int[] right=new int[arr.length];
        right[arr.length-1]=0;
        int j=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<arr[stack.peek()])
            {
                left[i]=arr[stack.peek()];        
            }
            else
            {
                stack.pop();
                stack.push(i);
                left[i]=0;
            }
        }
        
        stack.clear();
        stack.push(arr.length-1);
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]<arr[stack.peek()])
            {
                right[i]=arr[stack.peek()];        
            }
            else
            {
                stack.pop();
                stack.push(i);
                right[i]=0;
            }
        }
        right[0]=0;
        int count=0;
        /* for(int i=0;i<left.length;i++)
        {
            System.out.print(left[i]);
        }
        
          for(int i=0;i<left.length;i++)
        {
            System.out.print(right[i]);
        }*/
        
        for(int i=1;i<left.length-1;i++)
        {
            int c=Math.min(left[i],right[i]);
            if(arr[i]<c)
            {
                count+=c-arr[i];
            }
        }
        return count;
        
    } 
}

