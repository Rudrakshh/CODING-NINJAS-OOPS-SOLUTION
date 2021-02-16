public class Solution {  

    public static int[] merge(int arr1[], int arr2[]) {
        int num=arr1.length+arr2.length;
        int arr3[]=new int[num];
    	int i=0,j=0,k=0;
        if(arr1.length==0)
        {
         return arr2;
        }if(arr2.length==0)
        {
         return arr1;
        }
        while(i<arr1.length&&j<arr2.length)
        {
            if(arr1[i]<arr2[j]){
                arr3[k]=arr1[i];
                i++;
                k++;
            }
            else{
                
                arr3[k]=arr2[j];
                j++;
                k++;
            }
      }
        while(i<arr1.length){
            arr3[k]=arr1[i];
            i++;
            k++;}
        
        while(j<arr2.length){
            //if(i<arr1.length){
            arr3[k]=arr2[j];
            j++;
            k++;
            }
        return arr3;
    }
}
