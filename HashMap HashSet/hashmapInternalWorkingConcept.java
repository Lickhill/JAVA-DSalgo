import java.util.LinkedList;

public class hashmapInternalWorkingConcept {

    static class MyHashMap<K, V> {// K and V is class sata type of key and value just like int float char etc
        public static final int Default_capacity = 4;// total indexes is 4
        public static final float Default_load_factor = 0.75f;

        private class Node {
            K key;
            V value;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int searchInBuckets(LinkedList<Node> ll, K key) {
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key == key) {
                    return i;
                }
            }
            return -1;
        }

        private int n;// total entries

        private LinkedList<Node>[] buckets;

        private void initbuckets(int N)// N--> default capacity
        {
            buckets = new LinkedList[N];// array of name buckets of size N//this is the buckets/ indexes
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();// putting empty linkedlist in every bucket
            }
        }

        private int HashFunction(K key) {
            int hashvalue = key.hashCode();// this hashvalue could be -last integer to +last integer and might not fit
                                           // in the lenght of buckets for instance if the bucket last index is 10 and
                                           // hasvalue is 1000 or -1000 then a prob is arised
            return (Math.abs(hashvalue)) % buckets.length;
        }

        public MyHashMap() {
            initbuckets(Default_capacity);
        }

        private void rehash() {
            LinkedList<Node>[] oldbuckets = buckets;
            initbuckets(oldbuckets.length * 2);// double the no. of buckets
            n = 0;
            for (var bucket : oldbuckets) {
                for (var node : bucket) {
                    put(node.key, node.value);
                }
            }

        }

        public int size() {// return the number of entries in map
            return n;
        }

        public void put(K key, V value) {
            int bucket_index = HashFunction(key);
            LinkedList<Node> currbucket = buckets[bucket_index];

            int ei = searchInBuckets(currbucket, key);
            if (ei == -1) {
                Node node = new Node(key, value);
                currbucket.add(node);
                n++;
            } else {
                Node currNode = currbucket.get(ei);
                currNode.value = value;
            }

            if (n >= buckets.length) {
                rehash();
            }

        }

        public V get(K key) {
            int bucket_index = HashFunction(key);
            LinkedList<Node> currbucket = buckets[bucket_index];
            int ei = searchInBuckets(currbucket, key);
            if (ei != -1) {
                Node currNode = currbucket.get(ei);
                return currNode.value;
            }
            return null;
        }

        public V remove(K key) {
            int bucket_index = HashFunction(key);
            LinkedList<Node> currbucket = buckets[bucket_index];
            int ei = searchInBuckets(currbucket, key);
            if (ei != 1) {
                Node currNode = currbucket.get(ei);

                V val = currNode.value;
                currbucket.remove(ei);
                n--;
                return val;
            }
            return null;
        }
    }

    public static void main(String[] args) {
        MyHashMap<String, Integer> mp = new MyHashMap<>();

        System.out.println("testing put");
        mp.put("a", 1);
        mp.put("b", 2);
        mp.put("c", 3);

        System.out.println(mp.size());

        mp.put("d", 45);
        System.out.println(mp.size());
        System.out.println();

        System.out.println(mp.get("a"));
        System.out.println(mp.get("b"));
        System.out.println(mp.get("c"));
        System.out.println(mp.get("d"));

        System.out.println(mp.get("r"));

        mp.remove("a");
        System.out.println(mp.get("a"));

    }
}
