import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        
		
		
		
		Scanner s= new Scanner(System.in);
		int start=s.nextInt();
		int end = s.nextInt();
		int space=s.nextInt();
		
		for (int i=start;i<=end;i+=space) {
			int ans=(i-32)*5;
			int fin=ans/9;
			System.out.println(i+"\t"+fin);
					
		}
		
	}

}
