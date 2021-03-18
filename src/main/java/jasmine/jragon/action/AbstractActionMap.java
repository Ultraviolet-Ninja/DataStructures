package jasmine.jragon.action;

import java.util.HashMap;

public abstract class AbstractActionMap<K, R> {
    protected HashMap<K, R> map;

    public AbstractActionMap(){
        map = new HashMap<>();
    }

    public void addFunc(K key, R function){
        map.put(key, function);
    }

    public R removeFunc(K key){
        return map.remove(key);
    }

    public int size(){
        return map.size();
    }
}
