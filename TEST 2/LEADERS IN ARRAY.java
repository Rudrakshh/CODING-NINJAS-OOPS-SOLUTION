public class Solution {
public static void leaders(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			boolean allSmall=true;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] < arr[j]) {
					allSmall=false;
					break;
				}
			}
			if(allSmall) {
				System.out.print(arr[i]+" ");
			}
		}
		
	}
}
