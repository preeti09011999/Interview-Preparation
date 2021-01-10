public class rearrangePostiveAndNegative {

   public static void rearrange(int arr[]){
       int i=0,j=0;
       while(j<arr.length){
           if(arr[j] < 0){
               if(j!=0){
                   int temp = arr[j];
                   shift(arr,i,j);
                   arr[i] = temp;
                   i++;
                   j++;
               }else{
                   i++;
                   j++;
               }
           }
           else j++;
       }
   }
   
   public static void printArray(int arr[], int n){
       for(int i=0;i<n;i++) System.out.print(arr[i]+" ");
   }
   
   public static void shift(int[] arr, int i, int j){
       for(int k=j;k>i;k--){
           arr[k] = arr[k-1];
       }
   }

    public static void main(String[] args) 
    { 
        int arr[] = {12, 11, -13, -5, 6, -7, 5, -3, -6}; 
        int arr_size = arr.length; 
  
        rearrange(arr);
  
        printArray(arr, arr_size); 
    } 

}
