import java.util.Scanner;
public class Solution{  
                   /* MADE BY RUDRAKSH*/
    public static int duplicateNumber(int arr[]) {
    	//Your code goes here
        
        
	    	int ans=0;
			for(int i=0;i<arr.length;i++) {
				int c=0;
				for(int k=0;k<arr.length;k++) {
					
					if(i==k) {
						continue;
					}
					if(arr[i]==arr[k]) {
						c+=1;
						break;
					}
				}
				if(c==1) {
					ans=arr[i];
					break;
				}
			}
			return ans;
	        

	    }
	    
	    public static void main(String args[]){
	        Scanner s=new Scanner(System.in);
	        int cases=s.nextInt();
	        for (int i=1;i<=cases;i++){
	            int len=s.nextInt();
	            int[] arr=new int[len];
	            for(i=0;i<len;i++){
	                arr[i]=s.nextInt();
	            }
	            int ans=duplicateNumber(arr);
	            System.out.println(ans);
	        }
	    
    }
}
