class LRUCache {
    private class Node{
        int key = 0;
        int value = 0;

        Node prev = null;
        Node next = null;

        Node(int key,int value){
            this.key = key;
            this.value = value;
        }
    }

    private Node head = null;
    private Node tail = null;
    private int maxSize = 0;
    private int size = 0;

    
    private HashMap<Integer,Node> map = new HashMap<>();

    public LRUCache(int capacity) {
        this.maxSize = capacity;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)) return -1;

        Node node = map.get(key);
        removeNode(node);
        addLast(node); 
        return node.value;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            int val = get(key);
            if(val != value)
               this.tail.value = value;
        }else{
            Node node = new Node(key,value);
            map.put(key,node);
            addLast(node);

            if(this.size > this.maxSize) {
                Node rnode = this.head; 
                removeNode(rnode);
                map.remove(rnode.key);
            }
        }
    }
    public void removeNode(Node node){
        if(this.size == 1){
            this.head = null;
            this.tail = null;
        }else if(this.head == node){
            this.head = this.head.next;

            this.head.prev = null;
            node.next = null;
        }else if(this.tail == node){
            this.tail = this.tail.prev;

            this.tail.next = null;
            node.prev = null;
        }else{
            Node prev = node.prev;
            Node next = node.next;

            prev.next = next;
            next.prev = prev;

            node.prev = null;
            node.next = null;
        }
        this.size--;
    }
    public void addLast(Node node){
        if(this.head == null) {
            this.head = node;
            this.tail = node;
        }else{
            this.tail.next = node;
            node.prev = this.tail;
            this.tail = node;
        }

        this.size++;
    }
}
