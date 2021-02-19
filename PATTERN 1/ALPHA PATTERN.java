import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner s= new Scanner(System.in);
		int v=s.nextInt();
		String a="A";
		
		char c=a.charAt(0);
		for (int i=1;i<=v;i++) {
			int k=1;
			while (k<=i) {
				System.out.print(c);
				k+=1;
			}
			c+=1;
			
			System.out.print("\n");
		}

		
	}

}
