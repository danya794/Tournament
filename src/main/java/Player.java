public class Player {
    protected int id;
    protected String name;
    protected int strenght;

    //public int getId() {
        //return id;
    //}

    public String getName() {
        return name;
    }

    public int getStrenght() {
        return strenght;
    }

    public Player(int id, String name, int strenght) {
        this.id = id;
        this.name = name;
        this.strenght = strenght;
    }

}