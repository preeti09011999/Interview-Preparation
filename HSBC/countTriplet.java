import java.util.HashMap;

public class countTriplet {
    public static void main(String args[]){
        int arr[] = { 0, 4, 6, 2, 3, 8};
        int prod = 0;
        countT(arr, prod);
    }
    public static void countT(int arr[], int prod){
        int count = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++) hm.put(arr[i], i);
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                int fprod = arr[i] * arr[j];
                if(fprod <= prod && (fprod != 0) && (prod % fprod) == 0){ 
                    int val = prod/fprod;
                    if(hm.containsKey(val) && arr[i] != val && arr[j] != val && hm.get(val) > i && hm.get(val) > j){
                        if(fprod * val == prod) count++;

                    }
                }
            }
        }
        System.out.println(count);
    }
}
