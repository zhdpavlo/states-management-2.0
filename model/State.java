package model;
import model.Entity;

public class State implements Entity {

    private final String id;
    private final String name;

    public State(String id, String name){
     this.id = id;
     this.name = name;
    }

    @Override
    public String getId() {
        return id;
    }



    public String toString(){
        return "State:" + name;
    }

}
