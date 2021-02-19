import java.util.Scanner;
public class Solution {
    
    public static void swapAlternate(int arr[]) {
    	//Your code goes here
        int k;
        
        int l=0;
        for(int x:arr){
            l+=1;
        }
       
        for (int i=0;i<l-1;i+=2){
            k=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=k;
            
           
        }
        
        
        
    }
    
       public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        for (int i=1;i<=num;i++){
            int cases=s.nextInt();
            int arr[]=new int[cases];
            for (int j=0;j<cases;j++){
                arr[i]=s.nextInt();
                
            }
            
            
            swapAlternate(arr);
        }
    
    }
    
    
}
