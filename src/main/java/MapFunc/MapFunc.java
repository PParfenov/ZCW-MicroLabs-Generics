package MapFunc;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Create a function called `map` that takes an ArrayList and a `Function<T,R>` object,
 * and returns an ArrayList with all of the elements of the first after the function is applied to them.
 */
public class MapFunc {

    public static <T, R> ArrayList<R> map(ArrayList<T> list, Function<T, R> function){
        Stream<R> mappedValuesStream = list.stream().map(a -> function.apply(a));
        List<R> collect = mappedValuesStream.collect(Collectors.toList());
        return (ArrayList<R>) collect;
    }

}
