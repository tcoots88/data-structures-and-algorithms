package code401challenges.repeatedWord;

public class Hashtable {

    private Node[] map;

    public Hashtable(int size) {
        map = new Node[size];
    }


    private int hash(String key) {
        int hashValue = 0;
        char[] letters = key.toCharArray();

        for( int i = 0; i<letters.length; i++) {
            hashValue += letters[i];
        }

        System.out.println("hashValueOne = " + hashValue);
        hashValue = ( hashValue * 769 ) % map.length;
                System.out.println("hashValueTwo = " + hashValue);

        return hashValue;
    }


    public void set(String key, String value) {
        //find hash key
        int hashKey = hash(key);
        //add the node
        if( this.map[hashKey] == null ) {
            map[hashKey] = new Node(key, value);
        }
        //or set next node at that location
        else {
            //check if next is null,
            Node temp = findLast(this.map[hashKey]);
            Node a = new Node(key, value);
            temp.setNext(a);
        }
        //check for collisions
        System.out.println(key + " " + hashKey);
    }


    public String get(String key) {
        int  hashKey = hash(key);
        if(this.map[hashKey] != null ) {
            return findMatch(key, this.map[hashKey]).getValue();
        }
        return null;
    }


    protected Node findLast(Node node){
        if (node.getNext() == null) return node;
        return findLast(node.getNext());

    }


    protected Node findMatch(String key, Node node){
        if (node != null){
            if ( node.getKey().equals(key) ){
                return node;
            }
            else {
                return findMatch(key, node.getNext());
            }
        }
        return null;
    }

    // has()
    public boolean contains(String key) {
        int hashKey = hash(key);
        if(this.map[hashKey] != null ) {
            return ( findMatch(key, this.map[hashKey]) != null );
        }
        return false;
    }
}
