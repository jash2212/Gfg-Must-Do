// { Driver Code Starts
import java.io.*;
import java.util.*;

class Array {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		
		while(t-->0){
		    
		    //input size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //inserting elements in the array
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Leader obj = new Leader();
		    
		    StringBuffer str = new StringBuffer();
		    ArrayList<Integer> res = new ArrayList<Integer>();
		  
		    //calling leaders() function
		    res = obj.leaders(arr, n);
		    
		    //appending result to a String
		    for(int i=0; i<res.size(); i++){
		        str.append(res.get(i)+" ");
		    }
		    
		    //printing the String
		    System.out.println(str);
		}
		
	}
}
// } Driver Code Ends


class Leader{
    static ArrayList<Integer> leaders(int arr[], int n){
        int flag=0;
        ArrayList<Integer> a=new ArrayList<Integer>();
        int leader=arr[n-1];
      //  a.add(arr[n-1]);
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]>=leader)
            {
                leader=arr[i];
                a.add(arr[i]);
            }
        }
        int p=0,q=a.size()-1;
        Collections.reverse(a);
        return a;
        
        
        
        
        
       /* for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                a.add(arr[i]);    
            }
            flag=0;
        }
        a.add(arr[arr.length-1]);
        return a;*/
                
            }
}
