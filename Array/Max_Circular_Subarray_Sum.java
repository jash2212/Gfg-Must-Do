// { Driver Code Starts
import java.io.*;
import java.util.*;

class Array {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());// input size of array
		    int arr[] = new int[n];
		    String inputLine2[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine2[i]); // input elements of array
		    }
		    
		    Kadane obj = new Kadane();
		    
		    System.out.println(obj.circularSubarraySum(arr, n));// print the circularSubarraySum
		}
	}
}


// } Driver Code Ends


class Kadane{
    
    // Function to find circular subarray with maximum sum
    // a: input array
    // n: size of array
    static int circularSubarraySum(int a[], int n) {
     
        if(a.length==1)
        {
            return a[0];
        }
        int sum=0;
        int max=-1000;
        int max_sum=-1000;
        int max_modified=-1000;
        int max_sum_modified=-1000;
        int count=0;
         for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i]; 
            if(a[i]<0)
            {
                count++;
            }
        }
        int min=-10000;
        if(count==n)
        {
            for(int i=0;i<a.length;i++)
            {
                if(a[i]>min)
                {
                    min=a[i];
                }
            } 
            return min;
        }
        //System.out.println("sum is "+sum);
        
       // int pre_sum=0,max=-(Integer.MAX_VALUE);
       /* for(int i=0;i<a.length;i++)
        {
            pre_sum=Math.max(pre_sum+a[i],a[i]);
            if(pre_sum>max)
            {
                max=pre_sum;
            }
        }*/
        //kadans algo for original array
        for(int i=0;i<a.length;i++)
        {
            max_sum=Math.max(max_sum+a[i],a[i]);
            if(max_sum>max)
            {
                max=max_sum;
            }
        }
        
        //kadans algo for mofified inverted array
        for(int i=0;i<a.length;i++)
        {
           a[i]=-a[i];
        }
        
        for(int i=0;i<a.length;i++)
        {
            max_sum_modified=Math.max(max_sum_modified+a[i],a[i]);
            if(max_sum_modified>max_modified)
            {
                max_modified=max_sum_modified;
            }
        }
        max_modified=-max_modified;
       /* System.out.println("max_modified = "+max_modified);
        System.out.println("max sum = "+max);
        System.out.println("max sum = "+ (sum-max_modified));

        //System.out.println("reverse = "+ (sum-min));*/
        return Math.max(sum-max_modified,max);
        
    }
    
}
