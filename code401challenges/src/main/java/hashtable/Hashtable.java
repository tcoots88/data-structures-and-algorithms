package hashtable;



// assistance from https://www.geeksforgeeks.org/hashing-data-structure/

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

        hashValue = ( hashValue * 769 ) % map.length;
        return hashValue;
    }


    public void add(String key, String value) {

        int hashKey = hash(key);

        if( this.map[hashKey] == null ) {
            map[hashKey] = new Node(key, value);
        }

        else {
            Node temp = map[hashKey];
            map[hashKey] = new Node(key, value);
            map[hashKey].addNext(temp);
        }
    }

    public String get(String key) {

        int  hashKey = hash(key);
        if(this.map[hashKey] != null ) {
            return hashHelperMethod(key, this.map[hashKey]);
        }
        return null;
    }


    private String hashHelperMethod(String key, Node node){

        if (node == null) return null;
        //if the keys are the same, return value.
        if ( node.getKey().equals(key) ){
//            System.out.println("Correct Node Value at: " + node.getValue() );
            return node.getValue();
        }
        //recurse
        else {
//            System.out.println("Incorrect Node Value at: " + node.getValue() );
            return hashHelperMethod(key, node.getNext());
        }
    }

    // has()
    public boolean contains(String key) {
        int hashKey = hash(key);
        //if hashmap has a node there
        if(this.map[hashKey] != null ) {
            // recursively walk the nodes, and if the value is there, return.
            return ( hashHelperMethod(key, this.map[hashKey]) != null );
        }
        return false;
    }
}