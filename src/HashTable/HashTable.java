package HashTable;

import java.util.TreeMap;

/**
 * @auther: Li jx
 * @date: 2019/5/7 20:09
 * @description:
 */
public class HashTable<K, V> {
    private final static int UPPER_TOL = 10;
    private final static int LOWER_TOL = 2;
    private final static int INITIAL_CAP = 7;

    private TreeMap<K, V>[] hashTable;
    private int M;
    private int size;

    public HashTable(int M) {
        this.M = M;
        size = 0;
        hashTable = new TreeMap[M];
        for (int i = 0; i < M; i++) {
            hashTable[i] = new TreeMap<>();
        }
    }

    public HashTable() {
        this(INITIAL_CAP);
    }

    private int hash(K key) {
        return (key.hashCode() & 0x7fffffff) % M;
    }

    public int getSize() {
        return size;
    }

    public void add(K key, V value) {
        TreeMap map = hashTable[hash(key)];
        if (map.containsKey(key)) {
            map.put(key, value);
        } else {
            map.put(key, value);
            size++;
            if (size >= M * UPPER_TOL) {
                resize(2 * M);
            }
        }
    }

    public V remove(K key) {
        TreeMap<K, V> map = hashTable[hash(key)];
        V ret = map.remove(key);
        if (map.containsKey(key)) {
            size--;
            if (size < LOWER_TOL * M && M / 2 >= INITIAL_CAP) {

                resize(M / 2);
            }
        }
        return ret;
    }

    private void resize(int newM) {
        TreeMap<K, V>[] newHash = new TreeMap[newM];
        for (int i = 0; i < newM; i++) {
            newHash[i] = new TreeMap<>();
        }

        int oldM = M;
        this.M = newM;
        for (int i = 0; i < oldM; i++) {
            TreeMap<K, V> map = hashTable[i];
            for (K key : map.keySet()) {
                newHash[hash(key)].put(key, map.get(key));
            }
        }
        this.hashTable = newHash;
    }

    public void set(K key, V value) {
        TreeMap<K, V> map = hashTable[hash(key)];
        if (map.containsKey(key)) {
            map.put(key, value);
        } else {
            throw new IllegalArgumentException(key + "doesn't exist");
        }
    }

    public boolean contains(K key) {
        return hashTable[hash(key)].containsKey(key);
    }

    public V get(K key) {
        return hashTable[hash(key)].get(key);
    }
}
