// { Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;

class GFG {
    
 // } Driver Code Ends


//User function template for Java

public static void sort012(int a[], int n){
    int low=0,high=a.length-1;
    int i=0;
    while(i<=high)
    {
        if(a[i]==0)
        {
            int temp=a[i];
            a[i]=a[low];
            a[low]=temp;
            low++;  
            i++;
        }
        else if(a[i]==1)
        {
            i++;
        }
        else
        {
            int temp=a[i];
            a[i]=a[high];
            a[high]=temp;
            high--;
        }
        
    }
}

// { Driver Code Starts.

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}

  // } Driver Code Ends
