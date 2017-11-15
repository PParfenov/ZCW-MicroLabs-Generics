package Table;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * This class needs to manage an ArrayList of Entry objects.  It needs a get method that takes a key and returns
 * its corresponding value, or null of the key is not in the arraylist.  It needs a put method that takes a key and value
 * and makes an entry with key, value.  NOTE: There cannot be two entries with the same key.
 * It also needs a remove method which takes a key and, if that key exists in the arraylist, removes that item.
 * Void return on `remove`.
 */
public class Table<K, V> {
    private ArrayList<Entry<K,V>> entries;

    public Table() {
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
}
