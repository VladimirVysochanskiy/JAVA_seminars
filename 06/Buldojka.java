public class Buldojka {

    public int age;
    public int mass;
    public String type;
    public String name;
    public String master;

    public Buldojka(int age, int mass, String type, String name, String master) {
        this.age = age;
        this.mass = mass;
        this.master = master;
        this.name = name;
        this.type = type;        
    }

    void gladit() {
        System.out.println("RRRRRR");
    }

    String getName() {
        return name;
    }
    
}