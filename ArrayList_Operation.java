
//User function Template for Java

// Geeks clas with functions insert and freq
// insert : to insert element into ArrayList
// freq : function to count frequency of element
class Geeks
{
    // Function to insert element
    public static void insert(ArrayList<Character> clist, char c)
    {
        //add c to clist
        clist.add(c);
    }
    
    // Function to count frequency of element
    public static void freq(ArrayList<Character> clist, char c)
    {
        int count = 0;
        for(int i=0;i<clist.size();i++){
            if(c == clist.get(i)){
                count++;
            }
        }
        if(count>0)
        System.out.println(count);
        else
        System.out.println("Not Present");
        
    }
}


class GFG{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0){
            ArrayList<Character> clist = new ArrayList<Character>();
            int q = scn.nextInt();
            while(q-- > 0){
                char ch = scn.next().charAt(0);
                Geeks obj = new Geeks();
                if(ch == 'i'){
                    char c = scn.next().charAt(0);
                    obj.insert(clist,c);
                }
                if(ch == 'f'){
                    char c = scn.next().charAt(0);
                    obj.insert(clist,c);
                }
            }
        }
    }
}