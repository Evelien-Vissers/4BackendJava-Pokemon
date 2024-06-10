public class Pikachu extends Pokemon {
    private int electricPower;
    private String specialMove;

    //Constructor
    public Pikachu (String name, int level, int electricPower, String specialMove) {
        super(name, level);
        this.electricPower = electricPower;
        this.specialMove = specialMove;
    }
    //Getters
    public int getElecctricPower() {
        return electricPower;
    }
    public String getSpecialMove() {
        return specialMove;
    }
    //Setters
    public void setElectricPower(int electricPower) {
        this.electricPower = electricPower;
    }
    public void setSpecialMove(String specialMove) {
        this.specialMove = specialMove;
    }
    //Methods
    public void useThunderbolt() {
        System.out.println(getName() + "uses Thunderbolt!");
    }
    public void charge() {
        System.out.println(getName() + "is charging!");
    }

    // Overriden method @ Override
    public void attack() {
        System.out.println(getName() + "attacks with electricity!");
    }
}
