//Dit betreft de Superklasse
public class Pokemon {
    //Private variabelen:
    private String name;
    private int level;

    //Constructor:
    public Pokemon(String name, int level) {
        this.name = name;
        this.level = level;
    }
    //Getters
    public String getName() {
        return name;
    }
    public int getLevel() {
        return level;
    }
    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    //Methode 1:
    public void attack() {
        System.out.println(name + " attacks!");
    }
    //Methode 2:
    public void defend() {
        System.out.println(name + "defends!");
    }
}
