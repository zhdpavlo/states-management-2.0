package repository;
import model.Entity;

import java.util.*;

public class Repository <T extends Entity>{
    private Map<String, T> storage= new HashMap<>();

    public void add(T item){
        storage.put(item.getId(), item);
    }
    public T get(String id){
        return storage.get(id);
    }

    public List<T> getAll(){
        return new ArrayList<>(storage.values());
    }

    public void remove(String id){
        storage.remove(id);
    }

    public int size(){
        return storage.size();
    }



}
