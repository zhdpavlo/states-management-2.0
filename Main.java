import model.State;
import repository.Repository;

public class Main {
    public static void main(String[] args) {
           Repository<State> stateManager= new Repository<>();

           stateManager.add(new State("DE", "Germany"));
           stateManager.add(new State("UA", "Ukraine"));

           for(State s : stateManager.getAll()){
               System.out.println(s);
           }
        System.out.println(stateManager.get("DE"));

    }
}