package jasmine.jragon.action;

import java.util.function.Supplier;

public class SupplierMap<K, R> extends AbstractActionMap<K, Supplier<R>>{

    public SupplierMap(){
        super();
    }

    public R supply(K key){
        Supplier<R> temp = map.get(key);
        if (temp != null) return temp.get();
        return null;
    }
}
