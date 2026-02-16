package repository;

public class EntityNotFoundException extends RuntimeException{
    public EntityNotFoundException (String msg){
        super(msg);
    }
}
