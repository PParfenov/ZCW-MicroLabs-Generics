package Pair;

import java.util.ArrayList;
import java.util.Collections;

/**
 * In here you must make firstLast, which will return a pair of the first element in the array list and the last
 * element in the arraylist.
 * You must also make a min method that returns the smallest item in the array list
 * A max method that returns the largest item in the arraylist
 * And a minmax method that returns a pair containing the largest and smallest items from the array list
 */
public class Arrays<E extends Comparable> {

    public static <E extends Comparable> Pair<E> firstLast(ArrayList<E> list) {
        return new Pair<E>(list.get(0), list.get(list.size()-1));
    }

    public static <E extends Comparable> E min(ArrayList<E> list) {
        return (E)Collections.min(list);
    }

    public static <E extends Comparable> E max(ArrayList<E> list) {
        return (E)Collections.max(list);
    }

    public static <E extends Comparable> Pair<E> minMax(ArrayList<E> list){
        return new Pair(Arrays.min(list), Arrays.max(list));
    }
}
