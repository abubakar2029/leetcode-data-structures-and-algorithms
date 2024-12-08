package hashmap.implementation;

import java.util.LinkedList;

// wort case complexity is O(n)
public class HashmapCode {
    private class Hashmap<K, V> {
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.value = value;
                this.key = key;
            }
        }

        // final keyword once initialized, assigned a value it cannot be modified further
        private int n; // no. of nodes in Hashmap
        private int N;  // no. of buckets in Hashmap

        private LinkedList<Node> list[];

        public Hashmap() {
            this.N = 6;
            this.list = new LinkedList[N]; // initializing array here
            for (int i = 0; i < N; i++) {
                this.list[i] = new LinkedList<>(); // initializing each bucket with type linked list
            }
        }

        private void rehash() {
            LinkedList<Node> oldList[] = list;
            list = new LinkedList[N * 2];

            for (int i = 0; i < N * 2; i++) {
                this.list[i] = new LinkedList<>(); // initializing each bucket with type linked list
            }

            for (int i = 0; i < N; i++) {
                LinkedList<Node> linkedList = oldList[i];
                for (int j = 0; j < linkedList.size(); j++) {
                    Node node = linkedList.get(j);
                    put(node.key, node.value);
                }
            }
        }

        private int hashFunction(K key) {
            return Math.abs(key.hashCode()) % N;
        }

        public void put(K key, V value) {
            int bucketIndex = hashFunction(key);
            int nodeIndex = searchInLinkedList(key, bucketIndex);
            if (nodeIndex == -1) { // key doesn't exist
                list[bucketIndex].add(new Node(key, value));
                n++;
            } else { // key exist
                Node node = list[bucketIndex].get(nodeIndex);
                node.value = value;
            }
            double lambda = (double) n / N;
            if (lambda > 2.0) {
                rehash();
            }
        }

        private int searchInLinkedList(K key, int bucketIndex) {
            LinkedList<Node> linkedList = list[bucketIndex];
            for (int i = 0; i < linkedList.size(); i++) {
                if (linkedList.get(i).key == key) {
                    return i; // it is the node index
                }
            }
            return -1;
        }

        public boolean containsKey(K key) {
            int bucketIndex = hashFunction(key);
            int nodeIndex = searchInLinkedList(key, bucketIndex);
            return nodeIndex != -1;
        }

        public V remove(K key) {
            int bucketIndex = hashFunction(key);
            int nodeIndex = searchInLinkedList(key, bucketIndex);
            if (nodeIndex == -1) { // key doesn't exist
                return null;
            } else { // key exist
                Node node = list[bucketIndex].remove(nodeIndex);
                return node.value;
            }
        }

        public V get(K key) {
            int bucketIndex = hashFunction(key);
            int nodeIndex = searchInLinkedList(key, bucketIndex);
            if (nodeIndex == -1) { // key doesn't exist
                return null;
            } else { // key exist
                Node node = list[bucketIndex].get(nodeIndex);
                return node.value;
            }
        }

        public boolean isEmpty() {
            return n == 0;
        }
    }
}
