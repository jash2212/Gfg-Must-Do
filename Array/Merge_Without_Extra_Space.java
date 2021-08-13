// { Driver Code Starts
//Initial Template for Java

import java.util.Scanner;
import java.util.*;
import java.util.HashSet;

class Driverclass
{
    // Driver Code
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t>0)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
			
			for(int i=0; i<n; i++)
				a[i] = sc.nextInt();
		    
		    // Making object of GfG	
			Subseq g = new Subseq();
			
			System.out.println(g.findLongestConseqSubseq(a, n));
		
		t--;
		}
	}
}// } Driver Code Ends


//User function Template for Java

class Subseq
{   
    // arr[] : the input array
    // N : size of the array arr[]
    
    // return the length of the longest subsequene of consecutive integers
    
	static int findLongestConseqSubseq(int arr[], int N)
	{
	     HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++)
	    {       
	       hm.put(arr[i],1); 
	    }
        for(int i=0;i<arr.length;i++)
        {
            if(hm.containsKey(arr[i]-1))
            {
                hm.put(arr[i],0);
            }
        }
        int max=0;
        for (int i=0;i<arr.length;i++)  
        { 
            if((hm.get(arr[i]))>0)
            {
                int k=arr[i];
                int count=0;
                while(hm.containsKey(k))
                {
                    k++;
                    count++;
                    
                }
                if(count>max)
                {
                    max=count;
                }
            }
        }
        
        return max;
	    /*ArrayList<Integer> a=new ArrayList<Integer>(); 
	    int max=0;
	    for(int i=0;i<arr.length;i++)
	    {
	        if(arr[i]>max)
	        {
	            max=arr[i];
	        }
	        a.add(arr[i]);
	    }
	    int min=max;
	    for(int i=0;i<arr.length;i++)
	    {
	        if(arr[i]<min)
	        {
	            min=arr[i];
	        }
	    }
	 /*   System.out.print("min ="+min);
	    System.out.print("max ="+max);
        int du_min=min;
	    HashMap<Integer,Integer> hm=new  HashMap<Integer,Integer>();
	    
	    for(int i=min;i<=max;i++)
	    {
	        if(a.contains(min))
	        {
	            hm.put(min,1);    
	        }
	        else
	        {
	           // hm.put(min,0);
	        }
	        min=min+1;
	    }
	    
	    
	    
	    /* for (Map.Entry<Integer,Integer> entry : hm.entrySet())  
            System.out.println("Key = " + entry.getKey() + 
                             ", Value = " + entry.getValue());
                             
        int count=0,count_max=0;                     
        for(int i=du_min;i<=max;i++)
        {
            	 

            
            if(hm.containsKey(du_min))
            {
                
                    count++;
	  	           // System.out.println("count"+count); 
                    if(count>count_max)
                    {
                        count_max=count; 
                    //    System.out.println("count_max"+count_max);  

                    }
              
               
            }
             else
                {
                    count=0;
                //	System.out.println("else makes count"+count);  
                }
            du_min=du_min+1;
            
        }
	 // System.out.println("count_max"+count_max);  
	  return count_max; */ 
	}
}
