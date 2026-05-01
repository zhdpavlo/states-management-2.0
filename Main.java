import model.State;
import repository.*;

public class Main {
    public static void main(String[] args) {
<<<<<<< HEAD
           Repository<State> stateManager= new Repository<>();
=======
           Repository<State> stateManager= new Repository<>(); //State is a T. T has to have an id.
>>>>>>> 6fb46e7 (Added comments)

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