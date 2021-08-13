// { Driver Code Starts
import java.io.*;
import java.util.*;

class Difference {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim()); // size of array
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]); // input elements of array
		    }
		    
		    MaxDifference obj = new MaxDifference();
		    
		    System.out.println(obj.maxIndexDiff(arr, n)); // print the result
		}
	}
}// } Driver Code Ends


class MaxDifference{
    
    // Function to find maximum difference of j-1
    // arr[]: input array
    // n: size of array
    static int maxIndexDiff(int arr[], int n) { 
        int[] left=new int[arr.length];
        int[] right=new int[arr.length];
        int min=arr[0];
        int max=arr[arr.length-1];
        left[0]=arr[0];
        int maxDiff=0;
        right[arr.length-1]=arr[arr.length-1];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
            left[i]=min;
        }
        for(int i=arr.length-2;i>=0;i--)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
            right[i]=max;
        }
        int i=0;
        int j=0;
        while(i < n && j < n)
        {
            if(left[i] <= right[j])
            {
                maxDiff = Math.max(maxDiff, j-i);
                j++;
            }
            else
            {
                i++;
            }
        }
       /* System.out.println("left ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(left[i]+ " ");
        }
        System.out.println("right ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(right[i]+" ");
        }*/
        return maxDiff;
        
    }
}
