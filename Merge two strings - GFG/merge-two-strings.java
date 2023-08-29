//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());
        while(t-- > 0){
            String input_line[] = read.readLine().trim().split("\\s+");
            String S1 = input_line[0];
            String S2 = input_line[1];
            Solution ob = new Solution();
            System.out.println(ob.merge(S1,S2));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String merge(String S1, String S2)
    { 
     char [] arr1=S1.toCharArray();
     char [] arr2=S2.toCharArray();
     char [] merge = new char[arr1.length+arr2.length];
    int i=0,j=0;
    while( i< merge.length){
        if(j<arr1.length){
            merge[i]=arr1[j];
            i++;
        }
        if( j< arr2.length){
            merge[i]=arr2[j];
            i++;
        }
        j++;
    }
    return new String(merge);   
  }
 }
    