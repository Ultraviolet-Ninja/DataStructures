package jasmine.jragon.action;

import java.util.function.BiFunction;

public class BiFunctionMap<K, T, U, R>
        extends AbstractActionMap<K, BiFunction<T, U, R>>{
    public BiFunctionMap(){
        super();
    }

    public R apply(K key, T valueT, U valueU){
        BiFunction<T, U, R> temp = map.get(key);
        if (temp != null) return temp.apply(valueT, valueU);
        return null;
    }
}
