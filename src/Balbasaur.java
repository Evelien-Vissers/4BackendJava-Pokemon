public class Balbasaur extends Pokemon {
    private int grassPower;
    private String specialMove;

//Constructor
public Balbasaur(String name, int level, int grassPower, String specialMove) {
    super(name, level);
    this.grassPower = grassPower;
    this.specialMove = specialMove;
}
//Getters
public int getGrassPower() {
    return grassPower;
}
public String getSpecialMove() {
return specialMove;
}
//Setters
public void setGrassPower(int grassPower) {
    this.grassPower = grassPower;
}
public void setSpecialMove(String specialMove) {
    this.specialMove = specialMove;
}
//Methods
public void useVineWhip() {
    System.out.println(getName() + " uses Vine Whip!");
}
public void synthesize() {
    System.out.println(getName() + " synthesizes!");
}
//Overridden method @Override
    public void attack() {
    System.out.println(getName() + "attacks with grass!");
    }
}

