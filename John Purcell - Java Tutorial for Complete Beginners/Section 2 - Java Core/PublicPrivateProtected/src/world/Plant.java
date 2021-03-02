package PublicPrivateProtected.src.world;

public class Plant {
    // all access
    public String name;
    public final static int ID = 8;

    // can only access it within the class
    // class level
    private String type;

    // package level
    protected String size;

    // within the same class
    int height;

    public Plant() {
        this.name = "Freddy";
        this.type = "plant";
        this.size = "medium";
        this.height = 8;
    }
}
