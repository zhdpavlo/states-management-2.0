package repository;
import model.Entity;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

<<<<<<< HEAD
public class Repository <T extends Entity>{
    private Map<String, T> storage= new HashMap<>();

    public void add(T item){
        storage.put(item.getId(), item);
    }
    public T get(String id){
=======
public class Repository <T extends Entity>{ // that means that Repository can only be used with classes that implement Entity interface - they have id 
    private Map<String, T> storage= new HashMap<>(); // the key is the id of entity


    public void add(T item){ // the item has to have and id. After that we can add it to the storage
        storage.put(item.getId(), item);
    }
    public T get(String id){// the logic is: if the storage doesn't contain the id, we throw an exception, otherwise we return the item with that id
>>>>>>> 6fb46e7 (Added comments)
        if(!(storage.containsKey(id))){
            throw new EntityNotFoundException("State not found: " + id);
        }else{return storage.get(id);}
    }

<<<<<<< HEAD
    public List<T> getAll(){
        return new ArrayList<>(storage.values());
    }

    public void remove(String id){
=======
    public List<T> getAll(){// we return a new ArrayList with all the values from the storage 
        return new ArrayList<>(storage.values());
    }

    public void remove(String id){//remove by id
>>>>>>> 6fb46e7 (Added comments)
        storage.remove(id);
    }

    public int size(){
        return storage.size();
    }


    public void saveToFile() {
    List<T> items = getAll();

        try {
<<<<<<< HEAD
            PrintWriter writer = new PrintWriter("states.txt");

            for(int i = 0; i<items.size(); i++){
                T item = items.get(i);
                writer.println(item.getId() + " " + item.toString());
=======
            PrintWriter writer = new PrintWriter("states.txt"); //creates file

            for(int i = 0; i<items.size(); i++){
                T item = items.get(i);
                writer.println(item.getId() + " " + item.toString());//saves id and name in file
>>>>>>> 6fb46e7 (Added comments)
            }
            System.out.println("Writer worked successful");
            writer.close();
        }catch(FileNotFoundException e){
            System.out.println("Error while saving file: " + e.getMessage());
        }
    }


}
