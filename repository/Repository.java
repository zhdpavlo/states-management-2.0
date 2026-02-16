package repository;
import model.Entity;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Repository <T extends Entity>{
    private Map<String, T> storage= new HashMap<>();

    public void add(T item){
        storage.put(item.getId(), item);
    }
    public T get(String id){
        if(!(storage.containsKey(id))){
            throw new EntityNotFoundException("State not found: " + id);
        }else{return storage.get(id);}
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


    public void saveToFile() {
    List<T> items = getAll();

        try {
            PrintWriter writer = new PrintWriter("states.txt");

            for(int i = 0; i<items.size(); i++){
                T item = items.get(i);
                writer.println(item.getId() + " " + item.toString());
            }
            System.out.println("Writer worked successful");
            writer.close();
        }catch(FileNotFoundException e){
            System.out.println("Error while saving file: " + e.getMessage());
        }
    }


}
