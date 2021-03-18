package jasmine.jragon.action;

import java.util.function.Function;

public class FunctionMap<K, T, R> extends AbstractActionMap<K, Function<T, R>> {
    public FunctionMap(){
        super();
    }

    public R apply(K key, T valueT){
        Function<T, R> temp = map.get(key);
        if (temp != null) return temp.apply(valueT);
        return null;
    }
}
