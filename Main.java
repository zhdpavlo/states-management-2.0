import model.State;
import repository.*;

public class Main {
    public static void main(String[] args) {
           Repository<State> stateManager= new Repository<>();

           stateManager.add(new State("DE", "Germany"));
           stateManager.add(new State("UA", "Ukraine"));

           for(State s : stateManager.getAll()){
               System.out.println(s);
           }
//                  stateManager.remove("DE");

        try {
            System.out.println(stateManager.get("DE"));
        }catch(EntityNotFoundException e){
            System.out.println("Handled error -> " + e.getMessage());
        }
        stateManager.saveToFile();




    }
}