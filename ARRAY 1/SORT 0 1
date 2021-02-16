import java.util.Scanner;
public class Solution {  
                     /* MADE BY RUDRAKSH*/
    public static void sortZeroesAndOne(int[] arr) {
    	//Your code goes here
        int len=arr.length;
		int zero=0;
		int one=0;
		for(int i=0;i<len;i++) {
			if (arr[i]==0) {
				zero+=1;
			}
			else {
				one+=1;
			}
		}
		for (int i=0;i<zero;i++) {
			arr[i]=0;
		}
		for (int i=zero;i<len;i++) {
			arr[i]=1;
		}
		
    }
    
    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int cases=s.nextInt();
		for (int i=1;i<=cases;i++) {
			int len=s.nextInt();
			int[] arr=new int[len];
			for(int j=0;j<len;j++) {
				arr[j]=s.nextInt();			
			}
			
			sortZeroesAndOne(arr);
			
			
		}
	}
}
