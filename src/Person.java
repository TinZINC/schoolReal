public class Person {
    //properties
    private String name;
    private int id;
    private static int nextID = 0;

    //contructors
    public Person(String name) {
        this.name = name;
        this.id = nextID;
        nextID++;
    }

    //methods
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

}
