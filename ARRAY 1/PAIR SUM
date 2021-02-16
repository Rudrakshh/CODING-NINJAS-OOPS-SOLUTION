import java.util.Scanner;
public class Solution {  

    public static int pairSum(int arr[], int x) {
    	//Your code goes here
        int count=0;
		for(int i=0;i<arr.length-1;i++) {
			for(int k=i+1;k<arr.length;k++) {
				if(arr[i]+arr[k]==x) {
					count+=1;
				}
			}
		}
		return count;
    }
    
    public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
	        int cases=s.nextInt();
	        for (int i=1;i<=cases;i++){
	            int len=s.nextInt();
	            int[] arr=new int[len];
	            for(i=0;i<len;i++){
	                arr[i]=s.nextInt();
	            }
	            int x=s.nextInt();
	            int ans=pairSum(arr,x);
	            System.out.println(ans);
	        }
	}
}
