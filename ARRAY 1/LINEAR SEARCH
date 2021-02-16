import java.util.Scanner;
public class Solution {

    public static int linearSearch(int arr[], int x) {
		//Your code goes here
        int k=0;
        
        for (int i:arr){
            if (i==x){
                return k;
                
            }
            k+=1;
            
        }
        
            return -1;
        
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
            int find=s.nextInt();
            
            linearSearch(arr,find);
        }
    
    }
}
