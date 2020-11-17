class Solution {
    public boolean search(int[] arr, int data) {
        int lo = 0;
        int hi = arr.length-1;
        
        while(lo <= hi){
            int mid = (lo + hi) >> 1;
            
            if(arr[mid] == data || arr[lo] == data) return true;
            else if(arr[lo] < arr[mid]){
                if(arr[lo] <= data && data < arr[mid]) hi = mid - 1;
                else lo = mid + 1;
            }else if(arr[mid] < arr[hi]){
                if(arr[mid] < data && data <= arr[hi]) lo = mid + 1;
                else hi = mid - 1;
            }else lo++;  
        }
        
        return false;
    }
}
