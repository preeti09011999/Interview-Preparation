class Geeks
{
    // Function to insert element into list
    public static void insert(ArrayList<Integer> list, int x)
    {
        // Your code here
        list.add(x);
        
    }
    
    // Function to sort list in Increasing order
    public static void IncOrder(ArrayList<Integer> list)
    {
        // Your code here
        Collections.sort(list);
        
    }
    
    // Function to search element in the lise
    // val : element to be searched
    public static void Search(ArrayList<Integer> list, int val)
    {
        
        
        int flag = -1;
        for(int i=0;i<list.size();i++){
            if(list.get(i) == val){
                System.out.println(i);
                flag = 1;
                break;
            }
        }
        if(flag == -1){
            System.out.println("-1");
        }
        
        
    }
    
    // Function to sort list in decreasing order
    public static void DecOrder(ArrayList<Integer> list)
    {
        // Your code here
        Collections.sort(list,Collections.reverseOrder());
    }
}

class GFG{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0){
            ArrayList<Integer> clist = new ArrayList<Integer>();
            int q = scn.nextInt();
            while(q-- > 0){
                char ch = scn.next().charAt(0);
                Geeks obj = new Geeks();
                if(ch == 'a'){
                    char c = scn.next().charAt(0);
                    obj.insert(clist,c);
                }
                if(ch == 'i'){
                    obj.IncOrder(clist);
                }
                if(ch == 's'){
                    int ele = scn.nextInt();
                    obj.Search(list , ele);
                }
                if(ch == 'd'){
                    obj.DecOrder(list);
                }
            }
        }
    }
}