public class Charmander extends Pokemon {
    private int firePower;
    private String specialMove;

//Constructor
public Charmander(String name, int level, int firePower, String specialMove) {
        super(name, level);
        this.firePower = firePower;
        this.specialMove = specialMove;
    }
//Getters
public int getFirePower() {
    return firePower;
}
public String getSpecialMove() {
    return specialMove;
}
//Setters
public void setFirePower(int firePower) {
    this.firePower = firePower;
}
public void setSpecialMove(String specialMove) {
    this.specialMove = specialMove;
}
//Methods
public void useFlamethrower() {
    System.out.println(getName() + " uses Flamethrower!");
}
public void growl() {
    System.out.println(getName() + " growls!");
}
//Overridden method @ Override
public void attack() {
    System.out.println(getName() + " attacks with fire!");
}
}

