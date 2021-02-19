import java.util.Scanner;
public class Solution{  
    
                        /* MADE BY RUDRAKSH*/
    
    public static void intersections(int[] arr,int[] arr2) {
		for(int i:arr) {
			for (int k=0;k<arr2.length;k++) {
				if (i==arr2[k]) {
					System.out.print(i+" ");
					arr2[k]=Integer.MIN_VALUE;
					break;
				}
			}
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
			
			int len2=s.nextInt();
			int[] arr2=new int[len2];
			for(int j=0;j<len2;j++) {
				arr2[j]=s.nextInt();
			}
			
			intersections(arr,arr2);
		}
		
			
		
		
	}
}
