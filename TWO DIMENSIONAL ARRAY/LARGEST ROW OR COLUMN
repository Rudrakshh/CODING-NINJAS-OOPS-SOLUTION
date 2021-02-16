import java.util.Scanner;
public class Solution {

	public static void findLargest(int mat[][]){
		
        int row=0;
		int col=0;
		int max=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
        if(mat.length==0 || mat[0].length==0)
		{
			System.out.print("row"+" "+"0"+" "+Integer.MIN_VALUE);
			
		}
        else{
            
		for(int i=0;i<mat.length;i++)
        {
			int sum=0;
			for(int j=0;j<mat[0].length;j++)
			{
				sum+=mat[i][j];
			}
			if(sum>max)
			{
				max=sum;
				row=i;
			}
		}
        //-----------------------------------------------
		for(int i=0;i<mat[0].length;i++)
		{
			int sum=0;
			for(int j=0;j<mat.length;j++)
			{
				sum+=mat[j][i];
			}
			if(sum>max2)
			{
				max2=sum;
				col=i;
			}
        
		}
		
		
		//-------------------------------------------------------
        if(max<max2) 
		{
            System.out.print("column"+" "+col+" "+max2);
			
		}
		else
		{
			System.out.print("row"+" "+row+" "+max);
		}
        }
	}
}
