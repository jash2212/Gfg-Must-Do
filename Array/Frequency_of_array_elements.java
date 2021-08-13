// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //testcases
        int t = Integer.parseInt(br.readLine().trim()); 
        while(t-->0){
            
            //size of array
            int n = Integer.parseInt(br.readLine().trim()); 
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");

            //adding elements to the array
            for(int i=0; i<n; i++){
                arr[i]=Integer.parseInt(inputLine[i]); 
            }
            
            //calling frequncycount() function
            Frequency obj = new Frequency();
            obj.frequencycount(arr, n); 
            
            //printing array elements
            for(int i=0; i<n; i++)
                System.out.print(arr[i] + " " );
            System.out.println();
        }
    }
}



// } Driver Code Ends


class Frequency{
    public static void frequencycount(int arr[], int n)
    {
       HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
       
       
        for(int i=0;i<arr.length;i++)
        {
           if(hm.containsKey(arr[i]))
           {
               int c=hm.get(arr[i]);
               hm.put(arr[i],c+1);
           }
           else
           {
               hm.put(arr[i],1);
           }
           
        }
        int i=1;
        while(i<=n)
        {
            if(hm.containsKey(i))
            {
                int c=hm.get(i);
                arr[i-1]=c;
            }
            else
            {
                arr[i-1]=0;
            }
            i++;
        }
        
       
        
    }
}
