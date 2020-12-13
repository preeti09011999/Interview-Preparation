int findMaxDiff(int a[], int n)
    {
        if(n==0) return 0;
	    int omax = Integer.MIN_VALUE;
	    Stack<Integer> st = new Stack<>();
	    for(int i=0;i<n;i++){
	        while(st.size() != 0 && a[st.peek()] > a[i]){
	            int nsr = a[i];
	            st.pop();
	            int nsl = st.size() > 0 ? a[st.peek()] : 0;
	            omax = Math.max(omax, Math.abs(nsr-nsl));
	        }
	        st.push(i);
	    }
	    while(st.size() > 0){
	        int nsr = 0;
	        st.pop();
	        int nsl = st.size() > 0 ? a[st.peek()] : 0;
	        omax = Math.max(omax, Math.abs(nsr-nsl));
	    }
	    return omax;
    }
