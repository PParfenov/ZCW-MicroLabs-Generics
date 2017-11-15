package TableNested;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {
    private ArrayList<Entry<K,V>> entries;

    public TableNested() {
        entries = new ArrayList<>();
    }

    public V get(K k){
        try{
            return entries.stream().filter(a -> a.getKey().equals(k)).findFirst().get().getValue();
        } catch (NoSuchElementException nse){
            System.out.println("No such elements");
        }
        return null;
    }

    public void put(K k, V v) {
        Entry<K,V> entry = null;
        try{
            entry = entries.stream().filter(a -> a.getKey().equals(k)).findFirst().get();
        } catch (NoSuchElementException nse){
            System.out.println("No such elements");
        }

        if ((entry == null)) {
            entries.add(new Entry(k, v));
        } else {
            entries.set(entries.indexOf(entry), new Entry(k, v));
        }
    }

    public void remove(K k) {
        try {
            entries.remove(entries.stream().filter(a -> a.getKey().equals(k)).findFirst().get());
        } catch (NoSuchElementException nse){
            System.out.println("No such elements");
        }
    }

    class Entry<K, V> {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

    }
}


