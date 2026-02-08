public class Repository {
    private String name;
    private int year;
    public Repository(String name, int year){
        this.name = name;
        this.year = year;
    }

    public String getName(){
        return name;
    }
    public int getYear(){
        return year;
    }

    public String toString() {
        return "Name: " + name + ", Year: " + year;
    }
}
