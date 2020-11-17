public static int nearestElement(int[] arr,int ele){
        int si = 0, ei = arr.length-1;
        while(si <= ei){
            int mid = (si+ei) >> 1;
            if(arr[mid] == ele){
                return mid;
            }
            else if(arr[mid] > ele) ei = mid-1;
            else si= mid+1;
        } 
        if(ei < 0) return si;
        else if(si >= arr.length) return ei; 
        else return (ele - arr[ei] < arr[si] - ele) ? ei : si;
    }
