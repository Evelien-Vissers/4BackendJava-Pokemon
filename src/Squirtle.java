public class Squirtle extends Pokemon {
    private int waterPower;
    private String specialMove;

//Constructor
    public Squirtle(String name, int level, int waterPower, String specialMove) {
        super(name, level);
        this.waterPower = waterPower;
        this.specialMove = specialMove;
    }
//Getters
    public int getWaterPower() {
        return waterPower;
    }
    public String getSpecialMove() {
        return specialMove;
    }
//Setters
    public void setWaterPower(int waterPower) {
        this.waterPower = waterPower;
    }
    public void setSpecialMove(String specialMove) {
        this.specialMove = specialMove;
    }
//Methods
    public void useWaterGun() {
        System.out.println(getName() + " uses Water Gun!");
    }
    public void withdraw() {
        System.out.println(getName() + "withdraws into its shell!");
    }
// Overridden method @Override
    public void attack() {
        System.out.println(getName() + " attacks with water!");
    }
}
